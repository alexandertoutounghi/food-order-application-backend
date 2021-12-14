package com.foodorderapplicationbackend.Meal;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MealService {

    public List<Meal> getMeals() {
        return List.of(
                new Meal(1L,12.5,"meatball pasta","lovely spaghetti and meatballs"),
                new Meal(2L,25.0,"extra large pizza","pizza with cheese and sauce"),
                new Meal(3L,32.29,"lasagna","nice lasagna with meat")
        );
    }

}
