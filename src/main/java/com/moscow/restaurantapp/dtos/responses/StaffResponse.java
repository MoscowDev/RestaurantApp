package com.moscow.restaurantapp.dtos.responses;

import com.moscow.restaurantapp.data.models.Role;
import lombok.Data;

@Data
public class StaffResponse {
    public Long id;
    public String name;
    public String email;
    public Role role;
}
