package com.example.exampleProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class securityController {

    @GetMapping("/get")
    public String greeting(){
        return "hii how r u?";
    }
}
