package com.bihan.boilerplate.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication.run(RestApplication.class, args);
	}
}
