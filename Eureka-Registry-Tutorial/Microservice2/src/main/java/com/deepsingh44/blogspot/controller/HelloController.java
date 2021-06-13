package com.deepsingh44.blogspot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	@Autowired
	private RestTemplate rest;

	@GetMapping("/good")
	public String callMicroservice1() {
		return rest.getForObject("http://MICROSERVICE-1/hello", String.class);
	}

}
