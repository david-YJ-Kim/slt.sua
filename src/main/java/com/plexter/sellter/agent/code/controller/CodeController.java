package com.plexter.sellter.agent.code.controller;

import com.plexter.sellter.agent.code.service.CodeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Sellter Agent Code Controller.")
@RestController
@RequestMapping(value = "/code")
public class CodeController {

    @Autowired
    CodeService service;
}
