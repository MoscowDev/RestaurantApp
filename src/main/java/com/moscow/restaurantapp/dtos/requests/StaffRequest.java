package com.moscow.restaurantapp.dtos.requests;

import com.moscow.restaurantapp.data.models.Role;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class StaffRequest {
    private String username;
    private String password;
    private String email;
    private Role role;
    private int quantity;
    private int unitPrice;
    private int price;


}
