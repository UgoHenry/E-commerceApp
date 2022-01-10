package com.ecommerce.ecommerceApp;

import com.ecommerce.ecommerceApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceAppApplication implements CommandLineRunner {
	@Autowired
	ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
