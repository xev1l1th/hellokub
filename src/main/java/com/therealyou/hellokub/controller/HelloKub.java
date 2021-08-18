package com.therealyou.hellokub.controller;

import com.therealyou.hellokub.config.RoflanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKub {

    private final RoflanConfig roflanConfig;

    @Autowired
    public HelloKub(RoflanConfig roflanConfig) {
        this.roflanConfig = roflanConfig;
    }

    @GetMapping
    public String hello(){
        return "hello, " + roflanConfig.getUsername();
    }

    @GetMapping("/roflan")
    public String roflan(){
        return roflanConfig.getUsername() + " " + roflanConfig.getPassword();
    }
}
