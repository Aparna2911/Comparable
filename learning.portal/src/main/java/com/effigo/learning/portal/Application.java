package com.effigo.learning.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.effigo.learning.portal.service", "com.effigo.learning.portal.mapper",
		"com.effigo.learning.portal.controller" })
@EnableJpaRepositories(basePackages = { "com.effigo.learning.portal.repository" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
