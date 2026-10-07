package com.satwik.spring3.service;

import com.satwik.spring3.model.User;
import com.satwik.spring3.repository.UserDetailsDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserDetailsDAO userDetailsDAO;

    public UserService(UserDetailsDAO userDetailsDAO) {
        this.userDetailsDAO = userDetailsDAO;

        System.out.println("[Done]\tUser Service Created");
    }

    // Create table
    public void createTable() {
        userDetailsDAO.createTable();
    }

    // Create user
    public void createUser(User user) {
        userDetailsDAO.saveUser(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userDetailsDAO.getAllUsers();
    }

    public void display() {
        System.out.println("[Done]\tUser Service Working");
    }
}