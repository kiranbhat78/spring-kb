package com.kirandb.spring.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringKbApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Kiran Bhat's World";
	}
	
	@GetMapping("/{input}")
	public String Gone(@PathVariable String input) {
		return "Hi " + input + " Your Application has been a success";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringKbApplication.class, args);
	}

}
