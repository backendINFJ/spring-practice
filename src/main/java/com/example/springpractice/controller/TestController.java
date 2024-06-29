package com.example.springpractice.controller;

import com.example.springpractice.service.TestService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/api/v1/test")
    public String test() {
        return testService.test();
    }
}
