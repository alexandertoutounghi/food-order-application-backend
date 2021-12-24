package com.foodorderapplicationbackend.User.EndUser;

import com.foodorderapplicationbackend.Address.AddressEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "EndUser")
@Table(name = "EndUser",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "EndUser-Email-Unique",
                        columnNames = "email"
                )
        }
)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class EndUserEntity {
    @Id
    @SequenceGenerator(
            name = "end_user_sequence",
            sequenceName = "end_user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "end_user_sequence"
    )
    @Column(
            name = "userId",
            updatable = false,
            nullable = false
    )
    private Long userId;
    @Column(
            name = "firstName",
            updatable = true,
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;
    @Column(
            name = "lastName",
            updatable = true,
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;
    @Column(
            name = "password",
            updatable = true,
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String password;
    @Column(
            name = "email",
            updatable = true,
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String email;

    @Embedded
    private AddressEntity address;
//    @ManyToMany
//    private List<AddressEntity> addressEntities;

    public EndUserEntity(String firstName, String lastName, String password, String email, AddressEntity address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public EndUserEntity(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public List<AddressEntity> getAddress() {
//        return addressEntities;
//    }

//    public void setAddress(List<AddressEntity> addressEntities) {
//        this.addressEntities = addressEntities;
//    }


    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }
}
