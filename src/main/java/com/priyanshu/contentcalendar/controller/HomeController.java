package com.priyanshu.contentcalendar.controller;

import com.priyanshu.contentcalendar.config.ContentCalenderProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
//    trying to access application.properties variables
//    @Value("${cc.welcomeMessage}")
//    private String welcomeMessage;
//
//    @Value("${cc.about}")
//    private String about;

//    displaying json
    private final ContentCalenderProperties properties;

    public HomeController(ContentCalenderProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalenderProperties home(){
        return properties;
    }
}
