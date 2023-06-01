package com.plexter.sellter.agent.scrap;

import com.plexter.sellter.agent.keyword.vo.SltrLcKeywordVO;
import com.plexter.sellter.agent.scrap.code.SourceMarketCode;
import com.plexter.sellter.agent.scrap.work.ScrapServiceWorker;
import com.plexter.sellter.agent.util.ScrapCommonUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScrapServiceManager {

    public static void main(String[] args) {
         ScrapServiceManager manager = ScrapServiceManager.getInstance();

         manager.test();

    }

    private static ScrapServiceManager instance;
    public static int scrapWorkerCnt = ScrapCommonUtil.getSuitablePoolSize(2, 5, 2);
    public ExecutorService executor;
//    private final WebDriver driver;

    public boolean isWebDriverSet;

    private ScrapServiceManager(){

//        System.setProperty(SourceMarketCode.CHR_DRIVER_PROP.getCode(), "C:\\Users\\tspsc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\tspsc\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        System.out.println(System.getProperty(SourceMarketCode.ALI_PRD_URL_FORMAT.getCode()));

//        isWebDriverSet = new ScrapCommonUtil().isChromeDriverSet();
//        System.out.println(isWebDriverSet);

        executor = Executors.newFixedThreadPool(scrapWorkerCnt);

//        driver = new ChromeDriver(ScrapCommonUtil.getDriverOption(true));
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("http://naver.com");
    }

    public static ScrapServiceManager getInstance() {
        if(instance == null) {
            instance = new ScrapServiceManager();
        }
        return instance;
    }

    public void test(){

        SltrLcKeywordVO vo = new SltrLcKeywordVO();
        vo.setKEYWORD_URL("TESTURL");
        vo.setCOLLECT_START_PAGE(2);
        vo.setCOLLECT_END_PAGE(5);
        this.getSCrapTargetList(vo);
    }

    public void receiveOrderSheet(SltrLcKeywordVO vo){
        System.out.println("Receive Scrap Order : " + vo.toString());

        String keywordID = vo.getOBJ_ID();
        String keywordName = vo.getPROD_KEYWORD();
        String sourceMarketCode = vo.getSRC_MKT_ID();
        String sourceUrl = vo.getKEYWORD_URL();
        Integer startPage = vo.getCOLLECT_START_PAGE();
        Integer endPage = vo.getCOLLECT_END_PAGE();

        this.distributeScrapWork(keywordID, keywordName, sourceMarketCode, this.getSCrapTargetList(vo));

    }

    private void distributeScrapWork(String jobId, String keywordName, String sourceMarketCd, ArrayList<String> scrapList){


        for(int i=0; i < scrapList.size(); i++){
            Runnable task = new ScrapServiceWorker();
            executor.execute(task);
        }

    }
    /**
     *
     * return : scrap 대상, product id list (url)
     */
    private ArrayList<String> getSCrapTargetList(SltrLcKeywordVO vo){
        // manager driver 이용해서.. 사용
        ArrayList<String> result = new ArrayList<>();

        for(int i = vo.getCOLLECT_START_PAGE(); i <= vo.getCOLLECT_END_PAGE(); i++){
            this.scrapTargetList(result, vo.getKEYWORD_URL().concat("&page=" + String.valueOf(i)));
        }



        return result;
    }

    private void scrapTargetList(ArrayList<String> result, String url){
        System.out.println(url);

//        driver.get(url);
//        try {
//            ScrapCommonUtil.scroll_down_and_up_interval(driver, 1000, 1);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Duration duration = Duration.of(1, ChronoUnit.SECONDS);
//        new WebDriverWait(driver, duration).until(ExpectedConditions.presenceOfElementLocated(By.className("product-pagination-wrap")));
//
//        /**
//         * GET GRIDS
//         */
//        Document html = Jsoup.parse(driver.getPageSource());
//
//        /**
//         * GET PAGE GRID
//         */
//
//        WebElement pageGrid = driver.findElement(By.className("product-pagination-wrap"));
//        WebElement maxCountElement = pageGrid.findElement(By.className("jump-aera"));
//        String maxCount = maxCountElement.findElement(By.tagName("span")).getText();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        /**
//         * GET PRODUCT GRID
//         */
//        // way to get product grid element.
//        Element productGrid = html.getElementsByClass("JIIxO").first();
//
//        for(Element ele : productGrid.getElementsByTag("a")){
//            if(ele.attr("href").contains("aliexpress.com/item/")){
//                System.out.println(ele.attr("href"));
//            }
//        }
    }

}
