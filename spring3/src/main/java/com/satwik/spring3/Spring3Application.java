package com.satwik.spring3;

import com.satwik.spring3.model.User;
import com.satwik.spring3.repository.DatabaseInitializer;
import com.satwik.spring3.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring3Application {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		User userService = (User) context.getBean("userService");
		DatabaseInitializer db = (DatabaseInitializer) context.getBean("database", DatabaseInitializer.class);
		System.out.println(db.getUser());
		context.close();
//		userService.dis();
	}
}