package com.foodorderapplicationbackend.User.Vendor;

import com.foodorderapplicationbackend.Meal.MealEntity;
import com.foodorderapplicationbackend.Menu.MenuEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VendorRepositoryTest {
    @Autowired
    private VendorRepository vendorRepository;

    @Test
    public void SaveMenu() {


        MealEntity mealEntity = MealEntity.builder()
                .cost(15.00)
                .title("Pizza")
                .details("Cheese Pizza")
                .build();
        MenuEntity menuEntity =
                MenuEntity.builder()
                        .menuName("Wine Menu")
                        .meals(List.of(mealEntity))
                        .build();
        Vendor vendorEntity = Vendor.builder()
                .bizAddress("121 drury lane")
                .businessName("Andoli's Pizza")
//                .menu(menuEntity)
                .build();

         vendorRepository.save(vendorEntity);
    }

    @Test
    public void printVendors() {
        List<Vendor> vendors = vendorRepository.findAll();
        System.out.println(vendors);
    }
}