package com.satwik.spring3.service;

import com.satwik.spring3.model.User;

public class UserService {

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void displayUser() {
        user.dis();
    }
}