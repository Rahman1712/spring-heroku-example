package com.ar;

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
		return "Welocome to Heroku Cloud Solution Area";
	}
	
	@GetMapping("/message/{input}")
	public String getMessage(@PathVariable String input) {
		return "Welocome "+input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHerokuExampleApplication.class, args);
	}

}
