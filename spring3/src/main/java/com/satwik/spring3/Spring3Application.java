package com.satwik.spring3;

import com.satwik.spring3.model.User;
import com.satwik.spring3.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring3Application {

	public static void main(String[] args) {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		User userService = (User) context.getBean("userService");

		userService.dis();
	}
}