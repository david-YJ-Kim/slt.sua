package com.plexter.sellter.agent.main.controller;

import com.plexter.sellter.agent.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getQueryResult() {

        return mainService.getTest();
    }



}
