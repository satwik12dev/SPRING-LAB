package com.satwik.anoota.repository;

import jakarta.inject.Named;
import org.springframework.stereotype.Repository;

@Named("userRepository")
@Repository
public class UserRepository {
    public String getUsername(){
        return "Satwik";
    }
}