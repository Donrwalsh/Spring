package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class SpringBoot {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot.class, args);
	}

}
