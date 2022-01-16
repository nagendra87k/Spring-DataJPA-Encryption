package com.nagendra.springdatajpaencryption;

import com.nagendra.springdatajpaencryption.controller.UserDetailsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = UserDetailsController.class)
public class SpringDataJpaEncryptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaEncryptionApplication.class, args);
	}

}
