package com.bajaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryDemoApplication.class, args);
	}

}
