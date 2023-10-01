package com.amex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHomeController {
	@GetMapping("/home")
	public String home() {
		return "I am Abhishek";
	}

}
