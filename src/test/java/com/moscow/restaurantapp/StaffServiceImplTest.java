package com.moscow.restaurantapp;

import com.moscow.restaurantapp.data.models.OrderItems;
import com.moscow.restaurantapp.data.models.Role;
import com.moscow.restaurantapp.data.models.Staff;
import com.moscow.restaurantapp.dtos.requests.StaffRequest;
import com.moscow.restaurantapp.dtos.responses.StaffResponse;
import com.moscow.restaurantapp.service.StaffService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StaffServiceImplTest {
    @Autowired
    StaffService staffService;
    StaffRequest staffRequest = new StaffRequest();
    StaffResponse staffResponse = new StaffResponse();


    @Test
    public void testStaffCreation() {
        staffRequest.setUsername("admin");
        staffRequest.setPassword("admin");
        staffRequest.setEmail("admin");
        staffRequest.setRole(Role.COOK);
        StaffResponse staffResponse = staffService.createStaff(staffRequest);
        assertEquals("admin", staffResponse.getName());

    }

    @Test
    public void testAdminCanUpdatePrice() {
        Staff admin = new Staff();
        admin.setRole(Role.ADMIN);
        staffRequest.setQuantity(2);
        staffRequest.setUnitPrice(1000);
        StaffResponse staffResponse = staffService.updatePrice(staffRequest);
        assertEquals(2000, staffResponse.getPrice());
    }


    @Test
    public void testStaffCreationByRole() {
        staffRequest.setRole(Role.COOK);
        StaffResponse staffResponse = staffService.createStaff(staffRequest);
        assertEquals(Role.COOK, staffResponse.getRole());
    }

    @Test
    public void testAdminCanUpdateQuantity() {
        staffRequest.setQuantity(8);
        staffResponse = staffService.updateQuantity(staffRequest);
        assertEquals(8, staffResponse.getQuantity());

    }


    }
