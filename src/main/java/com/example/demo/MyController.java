package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test")
    public String  getMessage(){
        return "Hello Shamim";
    }
    
    @GetMapping("/greeting")
    public String  getMessage(){
        return "Hello Nasir";
    }
}
