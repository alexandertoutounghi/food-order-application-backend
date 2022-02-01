package com.foodorderapplicationbackend.Menu;

import com.foodorderapplicationbackend.Meal.MealEntity;
import com.foodorderapplicationbackend.Repository.MealRepository;
import com.foodorderapplicationbackend.User.Vendor.Vendor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MenuRepositoryTest {
    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private MealRepository mealRepository;

    @Test
    public void SaveMenu() {
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
    }

    @Test
    public void SaveMeal() {
        MealEntity mealEntity = MealEntity.builder()
                .cost(15.00)
                .title("Pizza")
                .details("Cheese Pizza")
                .build();
        MenuEntity menuEntity =
                MenuEntity.builder()
                        .menuName("Pizza Menu")
                        .meals(List.of(mealEntity))
                        .build();
        menuRepository.save(menuEntity);
    }



    @Test
    public void printAllMenus() {
        List<MenuEntity> menus = menuRepository.findAll();
        System.out.println(menus);

    }

}