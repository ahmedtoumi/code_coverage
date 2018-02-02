package com.atoumi.cilab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class Apllication {

	public static void main(final String[] args) {
        SpringApplication.run(Apllication.class, args);
    }
	
}
