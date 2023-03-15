package com.plexter.sellter.agent.scrap;

import com.plexter.sellter.agent.scrap.code.SourceMarketCode;
import com.plexter.sellter.agent.scrap.util.DriverActionUtil;
import com.plexter.sellter.agent.util.code.CommonCode;
import com.plexter.sellter.agent.util.ScrapCommonUtil;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class SourceProductScrapper {

    public static void main(String[] args) {

        System.setProperty(SourceMarketCode.CHR_DRIVER_PROP.getCode(), "C:\\Users\\tspsc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println(System.getProperty(SourceMarketCode.ALI_PRD_URL_FORMAT.getCode()));

        System.out.println(new ScrapCommonUtil().isChromeDriverSet());


        long startTM = System.currentTimeMillis();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver  driver = new ChromeDriver(options);

        SourceProductScrapper.elapsedTest(driver);
//        for(int i = 0; i < 10; i++){
//            SourceProductScrapper.elapsedTest(driver);
//
//        }


        System.out.println(" Total Elapsed Time :  "  + String.valueOf((System.currentTimeMillis() - startTM) / 1000) + "s" );

    }

    public static void elapsedTest(WebDriver driver){

        /**
         * 1005005152888024 : MOUNTAINHIKER-휴대용 알루미늄 합금 테이블, 접이식 캠핑 테이블
         * 1005004969628018 : 접이식 카트 왜건 휴대용 150L 대용량 다기능 카트
         * 1005004290169764 : 고의 품질 FG7C 에센셜 7 번째 컬렉션 지퍼 후드 남성  (Multi Factor Case)
         */

        String itemId = "1005005152888024";

        System.out.println(String.format(SourceMarketCode.ALI_PRD_URL_FORMAT.getCode(), itemId));



//        SourceProductScrapper scrapper = new SourceProductScrapper();
//        scrapper.execute(itemId, SourceMarketCode.ALI_PRD_URL_FORMAT.getCode());

        long startTM = System.currentTimeMillis();


        String targetURL = String.format(ScrapCode.productScrapURlForma.getVal(), itemId);
        driver.get(targetURL);

        Document html = Jsoup.parse(driver.getPageSource());

        /**
         * Thumbnail List
         */
//        SourceProductScrapper.getThumbnail(driver, html);

        /**
         * Product Title
         * ex) Usb 충전식 내장 배터리 5 Led 강력한 헤드 라이트, 슈퍼 브라이트 헤드 마운트 손전등 야외 충전식 야간 낚시
         */
//        SourceProductScrapper.getProductTitle(driver,html);


        /**
         * Product Option List
         */
        SourceProductScrapper.getProductOption(driver, html);

        /**
         * Delivery Option.
         * ex) AliExpress Standard Shipping
         */
//        SourceProductScrapper.getDeliveryOption(driver, html);


        /**
         * Purchase Option.
         * ex) 사용자 구매 횟수 제한..
         */
//        SourceProductScrapper.getPurchaseLimit(driver, html);

        /**
         * Product Details.
         */
//        SourceProductScrapper.getProductDetails(driver, html);

//        driver.close();

        System.out.println(" Unit Elapsed Time :  "  + String.valueOf((System.currentTimeMillis() - startTM) / 1000) + "s" );
    }


    public static void getProductDetails(WebDriver driver, Document html){

//        System.out.println("PRINT ALL HTML : " +  html.html());
//        driver.findElement(By.className("tab-inner")).click();

        // Wait for All Elements are loaded.
        try {
            DriverActionUtil.scroll_down_and_up_interval(driver, 1000, 1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(
                "getProductDetails_RESULT : " +  driver.findElement(By.className("tab-content")).getAttribute("outerHTML")
        );
    }


    public static void getDeliveryOption(WebDriver driver, Document html){

        // 1. html 로 5일 배송 있는지 확인
        if(html.getElementsByClass("product-dynamic-shipping").hasText()){

            String shippingInfo = html.getElementsByClass("product-dynamic-shipping").text();
            if(shippingInfo.contains(SourceMarketCode.ALI_STD_SHP.getCode())){
                System.out.println("getDeliveryOption : " + SourceMarketCode.ALI_STD_SHP.getCode() + " ::::::: " + shippingInfo);

            }else if(shippingInfo.contains(SourceMarketCode.ALI_SEL_SHP.getCode())){
                System.out.println(SourceMarketCode.ALI_SEL_SHP.getCode() + " ::::::: " + shippingInfo);

            }else{
                System.out.println("NOT in our case ::::::: " + shippingInfo);
            }


        // 2. click 해서 팝업으로 확인
        }else{
            driver.findElement(By.className("product-dynamic-shipping-moreOptions")).click();

            Duration duration = Duration.of(10, ChronoUnit.SECONDS);
            new WebDriverWait(driver, duration).until(ExpectedConditions.presenceOfElementLocated(By.className("comet-modal-content")));

            System.out.println(
                    driver.findElement(By.className("comet-modal-content")).findElement(By.className("comet-modal-body")).getText()
            );

        }



    }


    /**
     * 사용자 구매 횟수 제한..
     * @param driver
     * @param html
     */
    public static void getPurchaseLimit(WebDriver driver, Document html){

        boolean isPurchaseLimit = html.getElementsByClass("product-quantity-tip").first().getElementsByTag("span").first().hasText();


        System.out.println(
                "getPurchaseList_RESULT : " + html.getElementsByClass("product-quantity-tip").first().getElementsByTag("span").first().text()
        );
        System.out.println(
                "getPurchaseList_RESULT : " + isPurchaseLimit
        );
    }

    public static void getProductOptionMultiFactor(WebDriver driver, Document html){

        List<WebElement> propList = driver.findElements(By.className(SourceMarketCode.CLS_SKU_PROP_LIST.getCode()));

//        propList.get(0).findElements()
    }

    /**
     * Product Info
     *  1. Thumbnail List
     *  2. Product Title
     *  3. Product Option and it's images
     *  4. Product actual price with options
     *  5. Delivery Option
     *  6. Extra Info
     *      6-1. isChoice
     *      6-2. Review count, order count ( aka product reputation)
     */

    public static void getProductOption(WebDriver driver, Document html){

        // TODO multi factor option 대응 필요
        // multi factor option : 제품 옵션에 사이즈 & 칼러 이런식으로 조합 가능한 option 이 2개 이상

        ArrayList<String> optionImageList = new ArrayList<>();
        ArrayList<String> optionPriceList = new ArrayList<>();
        ArrayList<String> optionTitleList = new ArrayList<>();
        ArrayList<String> optionStockCntList = new ArrayList<>();

        Element element = html.getElementsByClass(SourceMarketCode.CLS_PRD_INF.getCode()).first();
        Element optElement = element.getElementsByClass(SourceMarketCode.CLS_PRD_SKU.getCode()).first().getElementsByClass("sku-wrap").first().getElementsByClass("sku-property").first();
        Element optListElement = optElement.getElementsByClass("sku-property-list").first();


        for(WebElement ele : driver.findElements(By.className("sku-property-item"))){
            ele.click();
            if(!ele.getAttribute("class").contains("selected")){

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
            System.out.println("OPTION TITLE : " + driver.findElement(By.className("sku-title-value")).getText());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println("STOCK COUNT : " + driver.findElement(By.className("product-quantity-tip")).getText());

            optionStockCntList.add(driver.findElement(By.className("product-quantity-tip")).getText());
            // 시간 딜레이 ... 필요.. 두번째 값을 가지고 온다..
            optionTitleList.add(driver.findElement(By.className("sku-title-value")).getText());

            try{
                optionPriceList.add(driver.findElement(By.className("uniform-banner-box-price")).getText());
            }catch (Exception e){
                optionPriceList.add(driver.findElement(By.className("product-price-value")).getText());
            }
        }

        for(Element optImg : optListElement.getElementsByClass("sku-property-image")){

//            System.out.println(optImg.getElementsByTag("img").attr("src"));
            optionImageList.add(optImg.getElementsByTag("img").attr("src"));
        }


        System.out.println("getProductOption_RESULT!!!!");
        System.out.println(optionTitleList.toString());
        System.out.println(optionPriceList.toString());
        System.out.println(optionImageList.toString());
        System.out.println(optionStockCntList.toString());
    }


    public static void getProductTitle(WebDriver driver, Document html){

        Element element = html.getElementsByClass(SourceMarketCode.CLS_PRD_INF.getCode()).first();
        Element titleElement = element.getElementsByClass(SourceMarketCode.CLS_PRD_TITLE.getCode()).first().getElementsByTag("h1").first();
        String titleElementString = titleElement.toString();

        int startIndex = titleElementString.indexOf(">");
        int lastIndex = titleElementString.lastIndexOf("<");

        System.out.println("getProductTitle  : " + titleElementString.substring(startIndex + 1, lastIndex));


    }

    public static void getThumbnail(WebDriver driver, Document html){

        ArrayList<String> list = new ArrayList<>();

        for(Element ele : html.getElementsByClass("images-view-item")){
//            Element imgElement = ele.getElementsByTag("img").attr("src");

//            String imgSourceString = imgElement.toString();

//            int startIndex = imgSourceString.lastIndexOf(SourceMarketCode.SPL_HTM_SRC.getCode());
//            int lastIndex = imgSourceString.lastIndexOf(SourceMarketCode.SPL_HTML_SRC_END.getCode());
//
//            list.add(imgSourceString.toString().substring(startIndex + 5, lastIndex));
            list.add(ele.getElementsByTag("img").attr("src"));
        }

        System.out.println("getThumbnail_RESULT : " + list.toString());


    }



    private String TargetSource;
//    private HashMap<String, String> map;

    private WebDriver driver;

    public SourceProductScrapper(){
        this(CommonCode.ALI.name());
    }

    public SourceProductScrapper(String source){
        this.TargetSource = source;
//        this.map = new HashMap<>();

        driver = new ChromeDriver();
    }




    public void execute(String itemId){}

    public void execute(String itemId, @NotNull String urlFormat){

        System.out.println(String.format(urlFormat, itemId));

        String targetURL = String.format(ScrapCode.productScrapURlForma.getVal(), itemId);
        this.driver.get(targetURL);

        // Wait for All Elements are loaded.
        try {
            DriverActionUtil.scroll_down_and_up_interval(driver, 1000, 1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Duration duration = Duration.of(10, ChronoUnit.SECONDS);
        new WebDriverWait(driver, duration).until(ExpectedConditions.presenceOfElementLocated(By.className("product-pagination-wrap")));

    }
}
