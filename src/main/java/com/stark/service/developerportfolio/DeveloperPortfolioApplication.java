package com.stark.service.developerportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*", allowedHeaders="*", allowCredentials = "*")
public class DeveloperPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperPortfolioApplication.class, args);
	}

}
