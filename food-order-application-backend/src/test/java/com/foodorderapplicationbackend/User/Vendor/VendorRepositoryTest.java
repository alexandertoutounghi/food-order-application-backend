package com.foodorderapplicationbackend.User.Vendor;

import com.foodorderapplicationbackend.Menu.MenuEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VendorRepositoryTest {
    @Autowired
    private VendorRepository vendorRepository;

    @Test
    public void SaveMenu() {

        MenuEntity menuEntity =
                MenuEntity.builder()
                        .menuName("Wine Menu")
                        .build();
        Vendor vendorEntity = Vendor.builder()
                .bizAddress("111 drury lane")
                .businessName("Andoli's Pizza")
                .menu(menuEntity)
                .build();

        vendorRepository.save(vendorEntity);
    }

    @Test
    public void printVendors() {
        List<Vendor> vendors = vendorRepository.findAll();
        System.out.println(vendors);


    }
}