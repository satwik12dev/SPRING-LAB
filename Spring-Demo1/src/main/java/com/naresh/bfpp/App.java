package com.naresh.bfpp;

import com.naresh.properties.DbUserDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user =(User) context.getBean("users");
        user.dis();
    }
}
