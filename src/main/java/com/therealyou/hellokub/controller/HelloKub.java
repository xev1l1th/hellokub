package com.therealyou.hellokub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloKub {

    private final String username;

    @Autowired
    public HelloKub(@Value("${username}") String username) {
        this.username = username;
    }

    @GetMapping
    public String hello(){
        return "hello, " + username;
    }
}
