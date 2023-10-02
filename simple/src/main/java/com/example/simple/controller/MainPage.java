package com.example.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainPage {

    @GetMapping("/")
    public String mainPage(){
        return "main";
    }

    @PostMapping("/")
    public String mainPagePost(){
        return "main";
    }
}
