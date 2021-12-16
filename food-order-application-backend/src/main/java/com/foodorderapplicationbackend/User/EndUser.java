package com.foodorderapplicationbackend.User;

import com.foodorderapplicationbackend.Address.Address;

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
public class EndUser {
    @Id
    @SequenceGenerator(
            name = "end-user-sequence",
            sequenceName = "end-user-sequence",
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
    @ManyToMany
    private List<Address> address;

    public EndUser() {
    }

    public EndUser(Long userId, String firstName, String lastName, String password, String email, List<Address> address) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.address = address;
    }

    public EndUser(String firstName, String lastName, String password, String email, List<Address> address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.address = address;
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

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
