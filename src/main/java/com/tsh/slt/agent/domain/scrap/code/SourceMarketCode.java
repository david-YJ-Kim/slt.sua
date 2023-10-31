package com.tsh.slt.agent.domain.scrap.code;

public enum SourceMarketCode {

    ALI_PRD_URL_FORMAT("https://aliexpress.com/item/%s.html"),

    CHR_DRIVER_PROP("webdriver.chrome.driver"),

    CLS_PRD_PAGINA_WRAP("product-pagination-wrap"),

    CLS_JIIX("JIIxO"),
    CLS_PRD_INF("product-info"),
    CLS_PRD_TITLE("product-title"),
    CLS_PRD_SKU("product-sku"),
    CLS_IMG_VIEW_ITM("images-view-item"),
    TAG_IMG("img"),
    CLS_SKU_PROP("sku-property"),
    CLS_SKU_TITLE("sku-title"),
    CLS_SKU_PROP_LIST("sku-property-list"),


    SPL_HTM_SRC("src=\""),
    SPL_HTML_SRC_END("\">"),


    ALI_STD_SHP("AliExpress Standard Shipping"),
    ALI_SEL_SHP("AliExpress Selection Shipping");



    private String code;

    public String getCode() {
        return code;
    }

    SourceMarketCode(String code){
        this.code = code;
    }
}
