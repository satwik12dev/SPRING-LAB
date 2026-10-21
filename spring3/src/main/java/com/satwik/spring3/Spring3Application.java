package com.satwik.spring3;

import com.satwik.spring3.model.User;
import com.satwik.spring3.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring3Application {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(Spring3Application.class, args);

		UserService userService = context.getBean(UserService.class);

		userService.createUser(new User(2,"Sanya", "sany7a2gamil.com"));
		userService.getSingleUser();
		System.out.println("[Done]\tSpring Boot Application Started");
	}
}