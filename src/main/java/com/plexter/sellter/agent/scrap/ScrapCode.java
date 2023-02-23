package com.plexter.sellter.agent.scrap;

public enum ScrapCode {

    productScrapURlForma("https://aliexpress.com/item/%s.html");

    private String val;
    ScrapCode(String val){
        this.val = val;
    }

    public String getVal(){
        return this.val;
    }


}
