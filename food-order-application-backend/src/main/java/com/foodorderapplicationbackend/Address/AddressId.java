package com.foodorderapplicationbackend.Address;

import javax.persistence.Id;
import java.io.Serializable;

public class AddressId implements Serializable {
    private String apptNumber;
    private String postalCode;

    public AddressId(String apptNumber, String postalCode) {
        this.apptNumber = apptNumber;
        this.postalCode = postalCode;
    }
}
