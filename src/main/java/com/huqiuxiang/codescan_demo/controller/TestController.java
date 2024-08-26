package com.huqiuxiang.codescan_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test2")
    public String test(){
        return "hello test!xxxx hahaha ";
    }


}
