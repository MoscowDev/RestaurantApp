package com.moscow.restaurantapp.service;

import com.moscow.restaurantapp.dtos.requests.OrderItemsRequest;
import com.moscow.restaurantapp.dtos.requests.StaffRequest;
import com.moscow.restaurantapp.dtos.responses.StaffResponse;
import org.springframework.stereotype.Service;

@Service
public interface StaffService {
    StaffResponse createStaff(StaffRequest staffRequest);

    StaffResponse createCook(StaffRequest staffRequest);

    OrderItemsRequest updatePrice();
}
