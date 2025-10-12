package com.dsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.dsa.mongo.repository")
@SpringBootApplication
public class DsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsaApplication.class, args);
	}

}
