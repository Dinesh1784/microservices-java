package com.dinesh.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans(@ComponentScan(value = "com.dinesh.cards.controller"))
@EnableJpaRepositories(value = "com.dinesh.cards.repository")
@EntityScan(value = "com.dinesh.cards.model")
public class CardsApplication {
	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
