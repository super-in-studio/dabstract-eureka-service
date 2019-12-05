package com.dabstract.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
