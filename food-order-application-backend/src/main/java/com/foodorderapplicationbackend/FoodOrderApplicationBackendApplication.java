package com.foodorderapplicationbackend;

import com.foodorderapplicationbackend.Address.AddressEntity;
import com.foodorderapplicationbackend.User.EndUser.EndUserEntity;
import com.foodorderapplicationbackend.User.EndUser.EndUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FoodOrderApplicationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderApplicationBackendApplication.class, args);

	}
	@Bean
	CommandLineRunner commandLineRunner(EndUserRepository endUserRepository) {
		return args -> {
			AddressEntity addressEntity= AddressEntity.builder()
					.addressNumber("4534")
					.Country("Canada")
					.postalCode("H4A2M8")
					.streetAddress("Royal")
					.build();
			EndUserEntity maria = EndUserEntity.builder()
					.firstName("maria")
					.lastName("sharpanova")
					.password("password")
					.email("maria.sharpanova@videontron.ca")
					.address(addressEntity)
					.build();

			endUserRepository.save(maria);
		};

	}



}
