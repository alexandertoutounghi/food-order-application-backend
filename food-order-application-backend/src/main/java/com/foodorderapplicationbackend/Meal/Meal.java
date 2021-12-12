package com.foodorderapplicationbackend.Meal;

import org.springframework.stereotype.Controller;

import java.time.LocalDate;
@Controller
public class Meal {
    private long id;
    private double cost;
    private String title;
    private String details;

    public Meal() {
    }

    public Meal(long id, double cost, String title, String details) {
        this.id = id;
        this.cost = cost;
        this.title = title;
        this.details = details;
    }

    public Meal(float cost, String title, String details) {
        this.cost = cost;
        this.title = title;
        this.details = details;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
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
                "id=" + id +
                ", cost=" + cost +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
