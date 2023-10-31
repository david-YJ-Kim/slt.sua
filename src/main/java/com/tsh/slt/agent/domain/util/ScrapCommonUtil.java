package com.tsh.slt.agent.domain.util;

import com.tsh.slt.agent.domain.util.code.CommonCode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.lang.System.out;

public class ScrapCommonUtil {

    public static ChromeOptions getDriverOption(boolean headless){
        ChromeOptions options = new ChromeOptions();
        if(headless) options.addArguments("headless");
        return options;
    }


    /**
     * In this example, we first use the Runtime.getRuntime().availableProcessors() method to get the number of available CPUs or processor cores in the system.
     * We then calculate the optimal thread pool size based on this value, using the following formula:
     *
     * We subtract 1 from the number of cores to leave one core available for other system tasks.
     * We limit the maximum pool size to 5 threads to avoid excessive resource consumption.
     * We ensure that the minimum pool size is at least 2 threads to allow for parallel processing.
     * This approach should provide a reasonable starting point for setting the thread pool size based on the machine's available resources.
     * However, it's important to monitor system performance and adjust the pool size as needed based on the specific requirements of the application and the workload.
     * @param minWorkerCnt
     * @param maxWorkerCnt
     * @return
     */
    public static int getSuitablePoolSize(int minWorkerCnt, int maxWorkerCnt, int bufferWorkerCnt){

        int numCores = Runtime.getRuntime().availableProcessors();
        int poolSize = Math.max(minWorkerCnt, Math.min(numCores - bufferWorkerCnt, maxWorkerCnt));
        return poolSize;
    }

    public boolean isChromeDriverSet(){

        String driverPropertyKey = CommonCode.webdriver.name().concat("." + CommonCode.chrome.name() + "." + CommonCode.driver.name() );
        String driverPath = System.getProperty(driverPropertyKey);
        if(driverPath == null){
            return false;
        }else{
            if(driverPath.contains("chromedriver.exe")){
                return true;
            }

        }
        return false;
    }

    /**
     * UI Element를 Scan 하기위해, 페이지를 위/ 아래 흟는다.
     * @param driver
     * @param interval
     * @throws InterruptedException
     */
    public static void scroll_down_and_up_interval(WebDriver driver, int interval, int scrollPauseSec) throws InterruptedException{

        int SCROLL_PAUSE_SEC = scrollPauseSec;
        int start = 0;
        String scriptFormat = "window.scrollTo(%s, %s);";

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        Long last_height = (Long) executor.executeScript("return document.body.scrollHeight");
        Thread.sleep(SCROLL_PAUSE_SEC);

        while (true) {
            executor.executeScript(String.format(scriptFormat, String.valueOf(start), String.valueOf(start + interval)));
            start = start + interval;

            Thread.sleep(SCROLL_PAUSE_SEC);

            Long new_height = (Long) executor.executeScript("return document.body.scrollHeight");

            if (new_height <= last_height){
                out.println(String.valueOf(new_height) + " <= " + String.valueOf(last_height));
                out.println("Break Loop, End Scrolling");
                break;
            }
            last_height = new_height;
        }
    }
}
