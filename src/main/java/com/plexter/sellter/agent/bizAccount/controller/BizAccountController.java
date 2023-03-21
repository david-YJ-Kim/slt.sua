package com.plexter.sellter.agent.bizAccount.controller;

import com.plexter.sellter.agent.bizAccount.service.BizAccountService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Sellter Agent BizACoount Controller.")
@RestController
@RequestMapping(value = "/bizAccount")
public class BizAccountController {

    @Autowired
    BizAccountService service;
}
