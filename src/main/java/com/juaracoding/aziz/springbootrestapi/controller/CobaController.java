package com.juaracoding.aziz.springbootrestapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/main")
public class CobaController {


    @GetMapping("/welcome")
    public String welcome(){

        System.out.println("Masuk Kesini");
        return "Hello World!!";
    }
}
