package com.plexter.sellter.agent.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/util")
public class UtilServiceController {

    @GetMapping("/healthCheck")
    public void checkAgentHealth(){
        System.out.println("H/C " + System.currentTimeMillis());
    }
}
