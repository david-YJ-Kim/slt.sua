package com.plexter.sellter.agent.product.controller;

import com.plexter.sellter.agent.product.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Sellter Agent Product Controller.")
@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService service;
}
