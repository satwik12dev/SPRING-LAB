package com.satwik.anoota;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public String getUsername() {
        return "Satwik";
    }
}