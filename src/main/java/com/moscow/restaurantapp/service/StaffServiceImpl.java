package com.moscow.restaurantapp.service;

import com.moscow.restaurantapp.data.models.Role;
import com.moscow.restaurantapp.data.models.Staff;
import com.moscow.restaurantapp.data.repositories.StaffRepository;
import com.moscow.restaurantapp.dtos.requests.OrderItemsRequest;
import com.moscow.restaurantapp.dtos.requests.StaffRequest;
import com.moscow.restaurantapp.dtos.responses.StaffResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffRepository staffRepository;

    @Override
    public StaffResponse createStaff(StaffRequest staffRequest) {
        Staff staff =new Staff() ;
        StaffResponse staffResponse =new StaffResponse();
        staff.setName(staffRequest.getUsername());
        staff.setPassword(staffRequest.getPassword());
        staffRepository.save(staff);
        staffResponse.setEmail(staffRequest.getEmail());
        staffResponse.setName(staffRequest.getUsername());
        staffResponse.setRole(staffRequest.getRole());
        return staffResponse;
    }

    @Override
    public StaffResponse createCook(StaffRequest staffRequest) {
        return null;
    }

    @Override
    public OrderItemsRequest updatePrice() {
        return null;
    }


    @Override
    public StaffResponse updatePrice(StaffRequest staffRequest) {
        Staff staff =new Staff();
        int total =
                staffRequest.getQuantity() * staffRequest.getUnitPrice();
        staffRepository.save(staff);

        StaffResponse response = new StaffResponse();
        response.setPrice(total);

        return response;
    }

    @Override
    public Role getRole(Role role) {
        if (role == null) {
            return Role.COOK;
        }
        return role;
    }

    @Override
    public StaffResponse updateQuantity(StaffRequest staffRequest) {
        StaffResponse response = new StaffResponse();
        response.setQuantity(staffRequest.getQuantity());
        return response;
    }



    }


