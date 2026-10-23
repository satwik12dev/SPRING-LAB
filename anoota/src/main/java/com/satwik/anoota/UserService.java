package com.satwik.anoota;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void display() {
        System.out.println(userRepository.getUsername());
    }
}