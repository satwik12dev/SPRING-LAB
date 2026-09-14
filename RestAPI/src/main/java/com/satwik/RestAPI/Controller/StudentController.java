package com.satwik.RestAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/get-all")
    public List<String> getAllStudents() {

        List<String> students = List.of(
                "Satwik",
                "Rahul",
                "Aman",
                "Rohit"
        );

        return students;
    }

    @GetMapping("/get-name")
    public String getName() {
        return "Satwik";
    }
}