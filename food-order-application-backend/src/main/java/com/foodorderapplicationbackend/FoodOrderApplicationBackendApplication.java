package com.foodorderapplicationbackend;

import com.foodorderapplicationbackend.Address.AddressEntity;
import com.foodorderapplicationbackend.Menu.MenuEntity;
import com.foodorderapplicationbackend.Menu.MenuRepository;
import com.foodorderapplicationbackend.User.EndUser.EndUserEntity;
import com.foodorderapplicationbackend.User.EndUser.EndUserRepository;
import com.foodorderapplicationbackend.User.Vendor.Vendor;
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
	CommandLineRunner commandLineRunner(EndUserRepository endUserRepository,
										MenuRepository menuRepository) {
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

			Vendor vendorEntity = Vendor.builder()
					.bizAddress("111 drury lane")
					.businessName("Andoli's Pizza")
					.build();
			MenuEntity menuEntity =
					MenuEntity.builder()
							.menuName("Wine Menu")
							.vendor(vendorEntity)
							.build();
			menuRepository.save(menuEntity);
		};

	}



}
