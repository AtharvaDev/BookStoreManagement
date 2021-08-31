package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.project")
@EnableJpaRepositories(basePackages="com.project")
public class BookStoreManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreManagementApplication.class, args);
		System.out.println("BookStoreManagementApplication");
	}

}
