package com.GuestMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GuestMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuestMicroservicesApplication.class, args);
	}

}
