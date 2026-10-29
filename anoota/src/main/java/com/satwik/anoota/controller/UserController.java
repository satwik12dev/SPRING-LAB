package com.satwik.anoota.controller;

import com.satwik.anoota.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController

public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/display")
    public void display() {
        userService.display();
    }

    @GetMapping("/display2")
    public void getUserName() {
        userService.getUserName();
    }
}