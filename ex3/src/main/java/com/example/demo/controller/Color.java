package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	@Value("${color}")
	private String color;
	@GetMapping("/")
	public String display()
	{
		return "My favorite color is "+color;
	}

}
