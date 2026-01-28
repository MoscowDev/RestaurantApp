package com.moscow.restaurantapp.data.models;

import lombok.Data;

@Data
public class Staff {
    private String name;
    private String password;
    private String id;
    private OrderStatus orderStatus;
    private Role role;

}
