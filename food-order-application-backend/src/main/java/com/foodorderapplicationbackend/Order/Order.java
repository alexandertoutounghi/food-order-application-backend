package com.foodorderapplicationbackend.Order;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private long id;
    private LocalDate timestamp;
    private float cost;
    private String customerName;
    private List<String> details;
    private OrderStatus status;

    public Order() {
    }

    public Order(long id, LocalDate timestamp, float cost, String customerName, List<String> details, OrderStatus status) {
        this.id = id;
        this.timestamp = timestamp;
        this.cost = cost;
        this.customerName = customerName;
        this.details = details;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public float getCost() {
        return cost;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getDetails() {
        return details;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", cost=" + cost +
                ", customerName='" + customerName + '\'' +
                ", details=" + details +
                ", status=" + status +
                '}';
    }
}
