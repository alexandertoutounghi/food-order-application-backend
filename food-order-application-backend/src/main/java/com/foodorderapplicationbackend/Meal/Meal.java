package com.foodorderapplicationbackend.Meal;

import com.foodorderapplicationbackend.Address.AddressId;
import com.foodorderapplicationbackend.Menu.MenuId;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.time.LocalDate;
@Controller
@Entity(name="Meal")
@Table(name="Meal")
@IdClass(MenuId.class)
public class Meal {
    @Id
    @SequenceGenerator(
            name="meal-sequence",
            sequenceName = "meal-sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "meal-sequence"
    )
    @Column(
            name="mealId",
            updatable = false,
            nullable = false
    )
    private Long mealId;
    @Id
    private Long menuId;
    @Column(
            nullable = false
    )
    private double cost;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String title;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String details;

    public Meal() {
    }

    public Meal(Long mealId, double cost, String title, String details) {
        this.mealId = mealId;
        this.cost = cost;
        this.title = title;
        this.details = details;
    }

    public Meal(double cost, String title, String details) {
        this.cost = cost;
        this.title = title;
        this.details = details;
    }

    public Long getMealId() {
        return mealId;
    }

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + mealId +
                ", cost=" + cost +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
