package com.plexter.sellter.agent.scrap;

import com.plexter.sellter.agent.util.CommonCode;
import com.plexter.sellter.agent.util.ScrapCommonUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class SourceProductScrapper {

    public static void main(String[] args) {

        String itemId = "1005004823147597";
        String productUrlFormat = "https://aliexpress.com/item/%s.html";

        System.out.println(String.format(productUrlFormat, itemId));

        System.setProperty("webdriver.chrome.driver","C:\\Users\\tspsc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));

        System.out.println(new ScrapCommonUtil().isChromeDriverSet());
    }


    private String TargetSource;
    private HashMap<String, String> map;

    public SourceProductScrapper(){
        this(CommonCode.ALI.name());
    }

    public SourceProductScrapper(String source){
        this.TargetSource = source;
        this.map = new HashMap<>();
    }




    public void execute(String itemId){}

    public void execute(String itemId, String urlFormat){

        String targetURL = String.format(ScrapCode.productScrapURlForma.getVal(), itemId);
        WebDriver driver = new ChromeDriver();
        driver.get(targetURL);
    }
}
