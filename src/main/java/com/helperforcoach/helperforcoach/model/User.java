package com.helperforcoach.helperforcoach.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    private Long id;
    String firstName;
    String secondName;
    Long age;
    Enum<Role> role;
    String email;
    String password;

    public User() {

    }

}
