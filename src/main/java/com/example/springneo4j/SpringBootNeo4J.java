package com.example.springneo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootNeo4J {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNeo4J.class, args);
	}
}
