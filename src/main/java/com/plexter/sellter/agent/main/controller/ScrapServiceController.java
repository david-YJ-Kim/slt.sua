package com.plexter.sellter.agent.main.controller;

import com.plexter.sellter.agent.main.vo.ScrapRequestVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScrapServiceController {

    @PostMapping("/scrapService")
    public void executeScrapService(@RequestBody ScrapRequestVO vo){
        System.out.println(vo.toString());
        System.out.println("Execute Scrap Service. run scrap Manager.");

    }
}
