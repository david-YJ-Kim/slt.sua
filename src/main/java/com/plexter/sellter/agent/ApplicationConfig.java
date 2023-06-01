package com.plexter.sellter.agent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfig {

    @Autowired
    private Environment env;


    public String getScrapScriptPath(){
        return this.getProperty("scrap.resource.path");
    }
    private String getProperty(String path){
        return env.getProperty(path);
    }
}
