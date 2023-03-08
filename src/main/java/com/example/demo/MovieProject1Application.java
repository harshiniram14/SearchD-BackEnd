package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.servlet.annotation.WebServlet;

@WebServlet
@SpringBootApplication
@SpringBootConfiguration
public class MovieProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieProject1Application.class, args);
	}

}
