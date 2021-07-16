package com.example.microservicetest.servertwo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
@Slf4j
public class HelloControllerTwo {

    @GetMapping
    public String helloFrom() {
        log.info("in controller 2");
        return "Hello from server Two";
    }
}
