package com.example.HappyFoodDeliveryWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HappyFoodDeliveryWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappyFoodDeliveryWebAppApplication.class, args);
		System.out.println("hi");
	}

}
