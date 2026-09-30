package com.satwik.spring3.repository;

import com.satwik.spring3.model.User;

public class DatabaseInitializer {
    public DatabaseInitializer() {
        System.out.println("[Ok]\t DataBase Initializer created(Constructor)");
    }

    public void connecttodb(){
        System.out.println("[Ok]\t DataBase Initializer created");
    }

    public User getUser(){
        User user = new User();
        user.setEmail("satwik@gmail.com");
        user.setName("Satwik");
        return user;
    }

    public void closeConn(){
        System.out.println("[Done]\tDatabase connection closed");
    }
}