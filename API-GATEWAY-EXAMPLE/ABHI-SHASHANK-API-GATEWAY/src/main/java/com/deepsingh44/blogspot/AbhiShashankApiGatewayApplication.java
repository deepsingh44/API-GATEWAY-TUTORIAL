package com.deepsingh44.blogspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AbhiShashankApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbhiShashankApiGatewayApplication.class, args);
	}

}
