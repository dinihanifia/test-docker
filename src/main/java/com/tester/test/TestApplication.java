package com.tester.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@GetMapping("")
	public String insert(
	) {
		return "Hello, Docker nya bisa nih!";
	}
	@GetMapping("/api2")
	public String insertT(
	) {
		return "Hiiii, ini API Docker ke 2!";
	}
}
