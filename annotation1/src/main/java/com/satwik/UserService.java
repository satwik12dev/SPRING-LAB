package com.satwik;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void display() {
        System.out.println(userRepository.getUserName());
    }
}
