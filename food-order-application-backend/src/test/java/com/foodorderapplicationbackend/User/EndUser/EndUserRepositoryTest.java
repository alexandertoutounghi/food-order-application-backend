package com.foodorderapplicationbackend.User.EndUser;

import com.foodorderapplicationbackend.Address.AddressEntity;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class EndUserRepositoryTest {
    @Autowired
    private EndUserRepository endUserRepository;

    @Test
    public void saveEndUser() {
        EndUserEntity endUserEntity = EndUserEntity.builder()
                .firstName("andrew")
                .lastName("ryan")
                .password("would you kindly")
                .email("andrewryan@bioshock.com")
                .build();
        endUserRepository.save(endUserEntity);
    }

    @Test
    public void saveEndUserWithAddress() {
        AddressEntity addressEntity = AddressEntity.builder()
                .streetAddress("Royal")
                .addressNumber("4534")
                .postalCode("h4a2m8")
                .city("Montreal")
                .Country("Canada")
                .build();
        EndUserEntity endUserEntity = EndUserEntity.builder()
                .firstName("andrew")
                .lastName("ryan")
                .password("would you kindly")
                .email("andrewryan@bioshock.com")
                .address(addressEntity)
                .build();
        endUserRepository.save(endUserEntity);
    }

    @Test
    public void printAllEndUser() {
        List<EndUserEntity> endUserEntityList = endUserRepository.findAll();
        System.out.println(endUserEntityList);
    }
    @Test
    public void printUserByFirstName() {
        List<EndUserEntity> endUserEntityList = endUserRepository.findByFirstName("maria");
        System.out.println(endUserEntityList);
    }
    @Test
    public void printUserByFirstNameContaining() {
        List<EndUserEntity> endUserEntityList = endUserRepository.findByFirstNameContaining("m");
        System.out.println(endUserEntityList);
    }
    @Test
    public void printUserByLastName() {
        List<EndUserEntity> endUserEntityList = endUserRepository.findByFirstName("sharpanova");
        System.out.println(endUserEntityList);
    }
    @Test
    public void printUserBasedOnAddress() {
        List<EndUserEntity> endUserEntityList = endUserRepository.findByAddress_StreetAddress("Royal");
        System.out.println(endUserEntityList);
    }
    @Test
    public void printByFirstNameAndLastName() {
        EndUserEntity endUserEntity = endUserRepository.findByFirstNameAndLastName("maria","sharpanova");
        System.out.println(endUserEntity);
    }
    @Test
    public void printEmailAddress() {
        EndUserEntity endUserEntity = endUserRepository.findByEmailAddress("maria.sharpanova@videontron.ca");
        System.out.println(endUserEntity);
    }
    @Test
    public void printFirstNameByEmailAddress() {
        String endUserFirstName = endUserRepository.findStudentFirstnameByEmailAddress("maria.sharpanova@videontron.ca");
        System.out.println(endUserFirstName);
    }
    @Test
    public void getStudentByEmailAddressNative() {
        EndUserEntity endUserEntity = endUserRepository.getStudentByEmailAddressNative("maria.sharpanova@videontron.ca");
        System.out.println(endUserEntity);
    }

    /**
     * Just adding named param
     */
    @Test
    public void getStudentByEmailAddressNativeNamedParam() {
        EndUserEntity endUserEntity = endUserRepository.getStudentByEmailAddressNative("maria.sharpanova@videontron.ca");
        System.out.println(endUserEntity);
    }




}