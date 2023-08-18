package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {
	@GetMapping("/")
	public static String Welcome()
	{
		return "Welcome Spring Boot!";
	}
}
