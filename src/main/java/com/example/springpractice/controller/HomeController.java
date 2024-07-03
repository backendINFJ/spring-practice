package com.example.springpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/v1/test")
    public String greeting() {
        return "Hello, World!";
    }
}
