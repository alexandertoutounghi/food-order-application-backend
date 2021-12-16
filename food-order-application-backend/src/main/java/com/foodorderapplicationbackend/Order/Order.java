package com.foodorderapplicationbackend.Order;

import com.foodorderapplicationbackend.Meal.Meal;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity(name = "Order")
@Table
public class Order {
    @Id
    @SequenceGenerator(
            name="order-sequence",
            sequenceName = "order-sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order-sequence"
    )
    @Column (
            name = "orderId",
            updatable = false,
            nullable = false
    )
    private long orderId;
    @Column(
            name = "timeStamp",
            updatable = true,
            nullable = false,
            insertable = false
    )
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @Column (
            name="cost",
            updatable = true,
            nullable = false
    )
    private Long cost;
    @Column (
            name="customerName",
            updatable = true,
            columnDefinition = "TEXT"
    )
    private String customerName;
    @OneToMany
    private List<Meal> details;

    @Column(name = "RIGHT")
    @Enumerated(EnumType.ORDINAL)
    private OrderStatus status;

    public Order() {
    }

    public Order(long orderId, Date timestamp, Long cost, String customerName, List<Meal> details, OrderStatus status) {
        this.orderId = orderId;
        this.timestamp = timestamp;
        this.cost = cost;
        this.customerName = customerName;
        this.details = details;
        this.status = status;
    }

    public Order(Long cost, String customerName, List<Meal> details, OrderStatus status) {
        this.cost = cost;
        this.customerName = customerName;
        this.details = details;
        this.status = status;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Meal> getDetails() {
        return details;
    }

    public void setDetails(List<Meal> details) {
        this.details = details;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + orderId +
                ", timestamp=" + timestamp +
                ", cost=" + cost +
                ", customerName='" + customerName + '\'' +
                ", details=" + details +
                ", status=" + status +
                '}';
    }
}
