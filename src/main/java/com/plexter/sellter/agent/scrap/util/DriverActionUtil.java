package com.plexter.sellter.agent.scrap.util;

import com.plexter.sellter.agent.scrap.code.JavaScriptCode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static java.lang.System.out;

public class DriverActionUtil {

    public static void main(String[] args) {
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
        String scriptFormat = JavaScriptCode.NOVE_WINDOW_SCROLL.getScript();

        JavascriptExecutor executor = (JavascriptExecutor) driver;

        Long last_height = (Long) executor.executeScript(JavaScriptCode.GET_SCROLL_HEIGHT.getScript());
        Thread.sleep(SCROLL_PAUSE_SEC);

        while (true) {
            executor.executeScript(String.format(scriptFormat, String.valueOf(start), String.valueOf(start + interval)));
            start = start + interval;

            Thread.sleep(SCROLL_PAUSE_SEC);

            Long new_height = (Long) executor.executeScript(JavaScriptCode.GET_SCROLL_HEIGHT.getScript());

            if (new_height <= last_height){
                out.println(String.valueOf(new_height) + " <= " + String.valueOf(last_height));
                out.println("Break Loop, End Scrolling");
                break;
            }
            last_height = new_height;
        }
    }
}
