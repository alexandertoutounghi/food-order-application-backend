package com.foodorderapplicationbackend.User;

import com.foodorderapplicationbackend.Address;

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
            name = "end_user_sequence",
            sequenceName = "end_user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "end_user_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
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

    public EndUser(Long id, String firstName, String lastName, String password, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public EndUser(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
