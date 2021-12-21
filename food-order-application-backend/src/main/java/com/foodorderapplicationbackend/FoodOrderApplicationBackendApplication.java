package com.foodorderapplicationbackend;

import com.foodorderapplicationbackend.Meal.Meal;
import com.foodorderapplicationbackend.User.EndUser;
import com.foodorderapplicationbackend.User.EndUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class FoodOrderApplicationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderApplicationBackendApplication.class, args);

	}
	@Bean
	CommandLineRunner commandLineRunner(EndUserRepository endUserRepository) {
		return args -> {
			EndUser maria = new EndUser("maria","sharpanova","password","maria.jones@videontron.ca");
			endUserRepository.save(maria);
		};

	}



}
