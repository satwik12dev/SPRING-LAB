package com.satwik.Spring.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class first {
    @GetMapping("/")
    public String homeController(){
        return "Satwik";
    }

    @GetMapping("/about")
    public String About(){
        return "Satwik\n" + "\nTCA2357046" + "\nTMU" + "\n8126666980" + "\nMoradabad";
    }
}