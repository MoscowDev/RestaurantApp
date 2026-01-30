package com.moscow.restaurantapp.dtos.responses;

import com.moscow.restaurantapp.data.models.Role;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class StaffResponse {
    public Long id;
    public String name;
    public String email;
    public Role role;
    public int  Unitprice;
    public int quantity;
    public int price;
}
