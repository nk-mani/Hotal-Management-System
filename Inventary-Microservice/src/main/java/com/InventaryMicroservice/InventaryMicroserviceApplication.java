package com.InventaryMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InventaryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventaryMicroserviceApplication.class, args);
	}

}
