package com.foodorderapplicationbackend.User;

import org.apache.tomcat.jni.Address;

import java.time.LocalDate;
@Table

public class User {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Address address;

    public User(Long id, String name, String email, LocalDate dob, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.address = address;
    }

    public User(String name, String email, LocalDate dob, Address address) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
