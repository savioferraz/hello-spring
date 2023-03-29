package com.spring.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class HealthController {

    @GetMapping("/health")
    public String ReportHealth() {
        return "Running on port 8080";
    }
}
