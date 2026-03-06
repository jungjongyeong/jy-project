package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/data")
    public String getData() {
        return "스프링 부트에서 보낸 데이터를 Vue가 받았습니다!";
    }
}