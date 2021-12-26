package com.foodorderapplicationbackend.User.EndUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EndUserRepository extends JpaRepository<EndUserEntity, Long> {
    List<EndUserEntity> findByFirstName(String firstName);

    List<EndUserEntity> findByFirstNameContaining(String name);

    List<EndUserEntity> findByLastNameNotNull();

    List<EndUserEntity> findByAddress_StreetAddress(String streetAddress);

    List<EndUserEntity> findByAddress_AddressNumber(String addressNumber);

    EndUserEntity findByFirstNameAndLastName(String firstName, String lastname);

    //JPQL
    @Query("select u from EndUser u where u.email=?1")
    EndUserEntity findByEmailAddress(String emailAddress);

    //JPQL
    @Query("select u.firstName from EndUser u where u.email=?1")
    String findStudentFirstnameByEmailAddress(String emailAddress);

    //    For complex queries
    @Query(
            value = "select * from end_user s where s.email = ?1",
            nativeQuery = true
    )
    EndUserEntity getStudentByEmailAddressNative(String emailAddress);


    //    For multiple query params more efficeitn thatn ?#
    @Query(
            value = "select * from end_user s where s.email = :email",
            nativeQuery = true
    )
    EndUserEntity getStudentByEmailAddressNativeNamedParam(@Param("email") String emailAddress);


}
