package com.turnkeyafrica.turnkeytraining.underwritingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UnderwritingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnderwritingServiceApplication.class, args);
	}

}
