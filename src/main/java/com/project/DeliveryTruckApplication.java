package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeliveryTruckApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryTruckApplication.class, args);
		System.out.println("Truck loading");
	}

}
