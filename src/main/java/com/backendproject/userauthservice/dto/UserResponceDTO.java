package com.backendproject.userauthservice.dto;

import com.backendproject.userauthservice.entity.Role;
import com.backendproject.userauthservice.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class UserResponceDTO {
    private String name;
    private String email;
    private List<RoleResponceDTO> roles;

    public static UserResponceDTO from(User user){
        if(user == null){
            return null;
        }
        UserResponceDTO userResponceDTO = new UserResponceDTO();
        userResponceDTO.name = user.getName();
        userResponceDTO.email = user.getEmailId();
        userResponceDTO.roles = new ArrayList<>();
        for(Role role : user.getRoles()){
            RoleResponceDTO responceDTO = new RoleResponceDTO();
            responceDTO.setDescription(role.getDescription());
            responceDTO.setRole(role.getRoleName());
            userResponceDTO.roles.add(responceDTO);
        }
        return userResponceDTO;
    }
}
