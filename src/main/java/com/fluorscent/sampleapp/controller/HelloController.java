package com.fluorscent.sampleapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vanakkam")
public class HelloController {

    @GetMapping
    public String sayHi() {
        return "Vanakkam";
    }

    @GetMapping("/{name}")
    public String sayHi(@PathVariable String name) {
        return "Vannakkam " + name;
    }
}
