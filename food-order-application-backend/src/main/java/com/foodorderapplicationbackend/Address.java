package com.foodorderapplicationbackend;

public class Address {
    private String Country;
    private String city;
    private String streetAddress;
    private String addressNumber;
    private String apptNumber;
    private String postalCode;

    public Address() {
    }

    public Address(String country,
                   String city,
                   String streetAddress,
                   String addressNumber, String apptNumber, String postalCode) {
        Country = country;
        this.city = city;
        this.streetAddress = streetAddress;
        this.addressNumber = addressNumber;
        this.apptNumber = apptNumber;
        this.postalCode = postalCode;
    }

    public Address(String country, String city, String streetAddress, String addressNumber, String postalCode) {
        Country = country;
        this.city = city;
        this.streetAddress = streetAddress;
        this.addressNumber = addressNumber;
        this.postalCode = postalCode;
    }

    public Address(String country, String streetAddress, String postalCode) {
        Country = country;
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
    }
}
