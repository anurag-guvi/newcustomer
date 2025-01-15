package com.example.newcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.newcustomer")
public class NewcustomerApplication {

	public static void main(String[] args) {

		SpringApplication.run(NewcustomerApplication.class, args);
	}

}
