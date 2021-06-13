package com.deepsingh44.blogspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ABApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ABApiGatewayApplication.class, args);
	}

}
