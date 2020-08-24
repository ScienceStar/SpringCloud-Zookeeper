package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(StartApplication.class, args);	
	}

}
