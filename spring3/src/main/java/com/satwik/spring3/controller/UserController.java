package com.satwik.spring3.controller;

import com.satwik.spring3.model.User;
import com.satwik.spring3.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    // Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Create user table
    @PostMapping("/create-table")
    public String createTable() {
        userService.createTable();
        return "Users table created successfully";
    }

    // Create user
    @PostMapping("/create-user")
    public String createUser(@RequestBody User user) {

        System.out.println("USER = " + user);

        userService.createUser(user);

        return "User created successfully";
    }

    // Get all users
    @GetMapping("/get-users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}