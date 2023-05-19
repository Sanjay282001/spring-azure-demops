package com.maysanjay.azure.demops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemopsApplication {
	
	@GetMapping("message")
	public String message() {
		return "sanjay created web app";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemopsApplication.class, args);
	}

}
