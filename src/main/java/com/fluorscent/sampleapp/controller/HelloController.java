package com.fluorscent.sampleapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld")
public class HelloController {

    @GetMapping
    public String sayHi() {
        return "Hi";
    }
}
