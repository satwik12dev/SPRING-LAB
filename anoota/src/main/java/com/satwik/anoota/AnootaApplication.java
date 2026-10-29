package com.satwik.anoota;

import com.satwik.anoota.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AnootaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnootaApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(UserService userService) {
		return args -> {
			userService.display();
			userService.getUserName();
		};
	}
}