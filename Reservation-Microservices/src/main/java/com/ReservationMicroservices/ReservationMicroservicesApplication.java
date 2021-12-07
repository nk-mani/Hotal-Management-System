package com.ReservationMicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReservationMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationMicroservicesApplication.class, args);
	}

}
