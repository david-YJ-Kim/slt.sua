package com.tsh.slt.sua.rest.main;

import com.tsh.slt.sua.domain.scrap.work.ScrapServiceWorker;
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
    public String checkAgentHealth(){
        String test = "H/C" + System.currentTimeMillis();
        System.out.println(test);
        return test;
    }
}
