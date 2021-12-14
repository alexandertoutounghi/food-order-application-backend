package com.foodorderapplicationbackend;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="Address")
@IdClass(AddressId.class)
public class Address {
    private String Country;
    private String city;
    private String streetAddress;
    private String addressNumber;
    @Id
    private String apptNumber;
    @Id
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
