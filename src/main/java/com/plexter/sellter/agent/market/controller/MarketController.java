package com.plexter.sellter.agent.market.controller;

import com.plexter.sellter.agent.market.service.MarketService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Sellter Agent Keywprd Controller.")
@RestController
@RequestMapping(value = "/keyword")
public class MarketController {

    @Autowired
    MarketService service;

}
