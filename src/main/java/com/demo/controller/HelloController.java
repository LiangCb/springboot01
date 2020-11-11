package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: cbliang
 * @Date: 2020/9/18 15:39
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello boot";
    }

    @GetMapping("/getSomething")
    private String getSomething(){
        return UUID.randomUUID().toString();
    }

}
