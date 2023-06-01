package com.plexter.sellter.agent.main.controller;

import com.plexter.sellter.agent.scrap.work.ScrapServiceWorker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/util")
public class UtilServiceController {

    @GetMapping("/test/scrapService")
    public void testScrapService(){

        ScrapServiceWorker scrapServiceWorker = new ScrapServiceWorker();
        Thread thread = new Thread(scrapServiceWorker);
        thread.start();
    }

    @GetMapping("/healthCheck")
    public void checkAgentHealth(){
        System.out.println("H/C " + System.currentTimeMillis());
    }
}
