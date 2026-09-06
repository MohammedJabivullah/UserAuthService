package com.backendproject.userauthservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity(name = "USER")
@Getter
@Setter
public class User extends BaseModel{
    private String name;
    private String emailId;
    private String password;  // to be stored Hashed code.
    @ManyToMany
    private List<Role> role;

}
