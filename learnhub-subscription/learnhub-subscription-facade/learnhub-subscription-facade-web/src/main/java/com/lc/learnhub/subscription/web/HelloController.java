package com.lc.learnhub.subscription.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello() {
        log.info("Hello, World!");
        return "Hello, World!";
    }
}