package com.deepsingh44.blogspot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String welcome() {
		return "Hello Microservice1";
	}
	
}
