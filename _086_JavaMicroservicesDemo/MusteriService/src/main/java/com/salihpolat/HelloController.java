package com.salihpolat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    // http://localhost:9091
    @GetMapping
    public String hello() {

        return "Hello Müşteri Service";
    }

    // http://localhost:9091/info
    @GetMapping("/info")
    public String info() {

        return "INFO: Müşteri Service";
    }
}