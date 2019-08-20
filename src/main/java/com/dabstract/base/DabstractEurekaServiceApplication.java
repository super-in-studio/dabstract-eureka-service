package com.dabstract.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DabstractEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DabstractEurekaServiceApplication.class, args);
	}

}
