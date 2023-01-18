package com.example.exampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class ExampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleProjectApplication.class, args);
	}

}
