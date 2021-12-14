package com.foodorderapplicationbackend.Meal;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.time.LocalDate;
@Controller
@Entity(name="Meal")
@Table(name="Meal")
public class Meal {
    @Id
    private Long mealId;
    @SequenceGenerator(
            name="meal-sequence-unique",
            sequenceName = "end-user-sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "end-user-sequence"
    )
    @Column(
            name="mealId",
            updatable = false
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
