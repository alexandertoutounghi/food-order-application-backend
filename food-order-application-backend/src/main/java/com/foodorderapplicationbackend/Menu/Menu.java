package com.foodorderapplicationbackend.Menu;

import com.foodorderapplicationbackend.Meal.Meal;

import javax.persistence.*;
import java.util.List;

@Entity(name="menu")
@IdClass(MenuId.class)
public class Menu {
    @Id
    private Long menuId;

    @OneToMany
    private List<Meal> Menu;
}
