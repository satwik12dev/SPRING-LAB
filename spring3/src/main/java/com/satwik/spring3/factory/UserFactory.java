package com.satwik.spring3.factory;

import com.satwik.spring3.model.User;

public class UserFactory{

    public User createUser(){
        User user = new User();

        user.setName("Satwik");
        user.setEmail("satwiksaxena@gmail.com");

        return user;
    }

    public  static User createUser2(){
        User user = new User();

        user.setName("Satwik Saxena");
        user.setEmail("satwiksaxena@gmail.com");

        return user;
    }



}