package com.ust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	
	@GetMapping("/home")
	public String getHomePage() {
		return "Welcome to Home Page";
	}

}
