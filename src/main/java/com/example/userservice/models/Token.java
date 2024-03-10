package com.example.userservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

//import java.sql.Date;

import java.util.Date;

@Getter
@Setter
@Entity
public class Token extends BaseModel {
    private String value;
    private Date ExpireAt;
    @ManyToOne   // many tokens can be created by one user if multiple login are allowed.
    private User user;
}
