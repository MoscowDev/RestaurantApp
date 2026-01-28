package com.moscow.restaurantapp.dtos.requests;

import com.moscow.restaurantapp.data.models.Role;
import lombok.Data;

@Data
public class StaffRequest {
    private String username;
    private String password;
    private String email;
    private Role role;
}
