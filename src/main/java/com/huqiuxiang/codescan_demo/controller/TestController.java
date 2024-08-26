package com.huqiuxiang.codescan_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello test!xxxx hahaha ";
    }

    @GetMapping("/test1")
    public String test1(){
        return "hello test1!xxxx hahaha ";
    }
}
