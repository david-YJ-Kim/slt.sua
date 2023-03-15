package com.plexter.sellter.agent.scrap.code;

public enum JavaScriptCode {

    GET_SCROLL_HEIGHT("return document.body.scrollHeight"),
    NOVE_WINDOW_SCROLL("window.scrollTo(%s, %s);");

    private String script;

    JavaScriptCode(String script){
        this.script = script;

    }

    public String getScript() {
        return script;
    }
}
