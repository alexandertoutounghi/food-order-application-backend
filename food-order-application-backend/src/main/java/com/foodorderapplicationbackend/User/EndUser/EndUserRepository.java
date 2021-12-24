package com.foodorderapplicationbackend.User.EndUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EndUserRepository extends JpaRepository<EndUserEntity, Long> {
    List<EndUserEntity> findByFirstName(String firstName);
    List<EndUserEntity> findByFirstNameContaining(String name);
    List<EndUserEntity> findByLastNameNotNull();
    List<EndUserEntity> findByAddress_StreetAddress(String streetAddress);
    List<EndUserEntity> findByAddress_AddressNumber(String addressNumber);
    EndUserEntity findByFirstNameAndLastName(String firstName,String lastname);
    //JPQL
    @Query("select u from EndUser u where u.email=?1")
    EndUserEntity findByEmailAddress(String emailAddress);

}
