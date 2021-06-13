package com.deepsingh44.blogspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AbhiShashankRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbhiShashankRegistryApplication.class, args);
	}

}
