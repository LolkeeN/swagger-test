package com.example.swaggertest.controller;

import com.example.swaggertest.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test() {
        return "TEST";
    }

    @GetMapping("/{customText}")
    public String testCustomText(@PathVariable String customText) {
        return customText;
    }

    @PostMapping
    public TestDto createText(@RequestBody TestDto dto) {
        return dto;
    }

    @GetMapping("/fromParam")
    public String testCustomTextFromParams(@RequestParam String text) {
        return text;
    }
}
