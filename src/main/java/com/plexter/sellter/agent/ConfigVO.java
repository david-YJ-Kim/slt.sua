package com.plexter.sellter.agent;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "scrap.resource")
@Component
public class ConfigVO {
    private String path;
}
