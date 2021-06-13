package com.deepsingh44.blogspot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/b")
public class HelloController {
	@Autowired
	private RestTemplate rest;

	@GetMapping("/good")
	public String getMessage() {
		return rest.getForObject("http://A-SERVICE/a/hello",String.class);
	}

}
