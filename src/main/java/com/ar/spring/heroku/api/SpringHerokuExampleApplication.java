package com.ar.spring.heroku.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHerokuExampleApplication {

	@GetMapping("/")
	public String home() {
		return "Welcome to Heroku Area";
	}
	
	@GetMapping("/message/{input}")
	public String message(@PathVariable String input) {
		return "Welcome "+input;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringHerokuExampleApplication.class, args);
	}

}
