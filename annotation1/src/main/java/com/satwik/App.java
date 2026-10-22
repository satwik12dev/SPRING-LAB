package com.satwik;

import com.satwik.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.logging.LogManager;

public class App {
    public static void main(String[] args) {

        LogManager.getLogManager().reset();

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user", User.class);
        System.out.println(user.getName());

        UserService userService = context.getBean(UserService.class);
        userService.display();
    }
}