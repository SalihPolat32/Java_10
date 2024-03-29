package com.salihpolat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    // http://localhost:9093
    @GetMapping
    public String hello() {
        return "UserProfile Service";
    }

    // http://localhost:9093/info
    @GetMapping("/info")
    public String info() {
        return "INFO: UserProfile Service";
    }
}