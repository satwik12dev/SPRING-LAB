package com.naresh.properties;

import java.util.Properties;

public class DbUserDetails {

    Properties details;
//    String DbUrl;
//    String username;
//    String password;
//    boolean isAdmin;
//    String port;

    public void setDetails(Properties details) {
        this.details = details;
    }

    public void dis(){
        System.out.println(details);
    }
}
