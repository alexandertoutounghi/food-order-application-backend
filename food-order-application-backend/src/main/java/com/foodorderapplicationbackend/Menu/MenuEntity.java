package com.foodorderapplicationbackend.Menu;

import com.foodorderapplicationbackend.Meal.MealEntity;

import javax.persistence.*;
import java.util.List;

@Entity(name="menu")
public class MenuEntity {
    @Id
    private Long menuId;

//    @OneToMany(targetEntity = MealEntity.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "mealForeignKey",referencedColumnName = "mealId")
//    private List<MealEntity> Menu;
}
