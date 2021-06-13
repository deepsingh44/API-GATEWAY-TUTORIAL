package com.deepsingh44.blogspot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shashank")
public class HelloController {
	@Autowired
	private CircuitBreakerFactory circuitBreakerFactory;

	@Autowired
	private RestTemplate rest;

	@GetMapping("/hello")
	public String callAbhi() {
		CircuitBreaker circuitBreaker = circuitBreakerFactory.create("circuitbreaker");
		String url = "http://ABHI-SERVICE/abhi/hello";
		return circuitBreaker.run(() -> rest.getForObject(url, String.class), throwable -> fallBackMethod(throwable));
	}

	public String fallBackMethod(Throwable throwable) {
		return "Please try after some time \n " + throwable;
	}

}
