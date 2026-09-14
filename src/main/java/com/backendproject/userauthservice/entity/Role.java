package com.backendproject.userauthservice.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "service_role")
@Getter
@Setter
public class Role extends BaseModel {
    private String roleName;
    private String description;
}
