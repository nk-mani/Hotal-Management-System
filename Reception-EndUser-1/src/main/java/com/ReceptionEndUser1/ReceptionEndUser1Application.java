package com.ReceptionEndUser1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReceptionEndUser1Application {

	public static void main(String[] args) {
		SpringApplication.run(ReceptionEndUser1Application.class, args);
	}

}
