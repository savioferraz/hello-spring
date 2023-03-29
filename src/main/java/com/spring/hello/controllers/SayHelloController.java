package com.spring.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class SayHelloController {

    @GetMapping("/")
    public String SayHello() {

        return "Olá Spring, Tudo certo por aqui!";
    }
}
