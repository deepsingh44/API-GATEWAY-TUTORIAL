package com.deepsingh44.blogspot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abhi")
public class HelloController {

	@GetMapping("/hello")
	public String welcome() {
		return "Hello Abhijeet";
	}

}
