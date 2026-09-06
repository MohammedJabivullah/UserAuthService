package com.backendproject.userauthservice.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "USER_ROLE")
@Getter
@Setter
public class Role extends BaseModel{
    private String roleName;
    private String desc;
}
