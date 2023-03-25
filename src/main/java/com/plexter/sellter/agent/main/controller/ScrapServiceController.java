package com.plexter.sellter.agent.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScrapServiceController {

    @PostMapping("/scrapService")
    public void executeScrapService(){
        System.out.println("Execute Scrap Service. run scrap Manager.");

    }
}
