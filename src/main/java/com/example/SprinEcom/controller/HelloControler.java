package com.example.SprinEcom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping("/hello")
    public String greet(){
        return "Hello, Welcome!";
    }
}
