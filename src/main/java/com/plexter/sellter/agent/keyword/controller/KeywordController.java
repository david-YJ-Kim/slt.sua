package com.plexter.sellter.agent.keyword.controller;

import com.plexter.sellter.agent.keyword.service.KeywordService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Sellter Agent Keyword Controller.")
@RestController
@RequestMapping(value = "/keyword")
public class KeywordController {

    @Autowired
    KeywordService service;
}
