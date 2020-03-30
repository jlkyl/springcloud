package com.aaa.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;

    @Value("${demo-config-profile-env}")
    private String env;

    @RequestMapping("/getConfig")
    public String getConfig(){
        return this.from+" "+this.env;
    }
}
