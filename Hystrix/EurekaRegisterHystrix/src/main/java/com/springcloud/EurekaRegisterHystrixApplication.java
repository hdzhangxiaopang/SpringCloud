package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegisterHystrixApplication.class, args);
	}
}
