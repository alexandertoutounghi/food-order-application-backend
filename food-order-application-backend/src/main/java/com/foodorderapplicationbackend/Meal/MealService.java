package com.foodorderapplicationbackend.Meal;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  MealService {

    public List<MealEntity> getMeals() {
        return List.of(
                new MealEntity(1L,12.5,"meatball pasta","lovely spaghetti and meatballs"),
                new MealEntity(2L,25.0,"extra large pizza","pizza with cheese and sauce"),
                new MealEntity(3L,32.29,"lasagna","nice lasagna with meat")
        );
    }

}
