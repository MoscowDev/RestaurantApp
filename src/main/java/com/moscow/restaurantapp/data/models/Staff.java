package com.moscow.restaurantapp.data.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Staff {
    private String name;
    private String password;
    private String id;
    private OrderStatus orderStatus;
    private Role role;
    private int UnitPrice;
    private int quantity;
    private int price;

}
