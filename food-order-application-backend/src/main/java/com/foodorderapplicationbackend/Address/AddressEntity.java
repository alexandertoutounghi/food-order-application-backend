package com.foodorderapplicationbackend.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//@Entity(name="Address")
//@IdClass(AddressId.class)
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@AttributeOverrides({
//        @AttributeOverride (
//                name="streetAddress",
//                column= @Column(name ="street_address")
//        )
//})
public class AddressEntity implements Serializable {
    private String Country;
    private String city;
    private String streetAddress;
    private String addressNumber;
//    @Id
    private String apptNumber;
//    @Id
    private String postalCode;

    public AddressEntity(String country, String city, String streetAddress, String addressNumber, String postalCode) {
        Country = country;
        this.city = city;
        this.streetAddress = streetAddress;
        this.addressNumber = addressNumber;
        this.postalCode = postalCode;
    }

    public AddressEntity(String country, String streetAddress, String postalCode) {
        Country = country;
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getApptNumber() {
        return apptNumber;
    }

    public void setApptNumber(String apptNumber) {
        this.apptNumber = apptNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "AddressEntity{" +
                "Country='" + Country + '\'' +
                ", city='" + city + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", addressNumber='" + addressNumber + '\'' +
                ", apptNumber='" + apptNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
