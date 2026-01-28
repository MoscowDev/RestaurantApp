package com.moscow.restaurantapp;

import com.moscow.restaurantapp.data.models.OrderItems;
import com.moscow.restaurantapp.data.models.Role;
import com.moscow.restaurantapp.dtos.requests.OrderItemsRequest;
import com.moscow.restaurantapp.dtos.requests.StaffRequest;
import com.moscow.restaurantapp.dtos.responses.OrderItemsResponse;
import com.moscow.restaurantapp.dtos.responses.StaffResponse;
import com.moscow.restaurantapp.service.StaffService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StaffServiceImplTest {
    @Autowired
    StaffService staffService;
    StaffRequest staffRequest = new StaffRequest();
    StaffResponse staffResponse = new StaffResponse();
    OrderItems orderItems = new OrderItems();
    OrderItemsRequest orderItemsRequest = new OrderItemsRequest();
    OrderItemsResponse orderItemsResponse = new OrderItemsResponse();

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
    public void PriceUpdate() {
        staffRequest.setUsername("admin");
        staffRequest.setPassword("admin");
        staffRequest.setEmail("admin");
        staffRequest.setRole(Role.ADMIN);
        //staffRequest1 = staffService.updatePrice(BigDecimal price);
        orderItemsRequest = staffService.updatePrice();
        //staffService.;
        //assertEquals("admin", staffResponse.getPrice(500));
    }

//    @Test
//    public void testAdminResponseCreation() {
//        staffResponse.setName(staffRequest.getUsername());
//        staffResponse.setRole(staffRequest.getRole());
//        staffResponse.setEmail(staffRequest.getEmail());
//        StaffResponse admin= staffService.createStaff(staffRequest);
//        assertEquals("successfully created", admin.getRole());
//
//    }
//    @Test
//    public void testAdminResponseGet() {
//        staffResponse.setUsername("admin");
//        staffResponse.setMessage("successfully created");
//        StaffResponse admin= staffService.createStaff(staffRequest);
//        assertEquals("successfully created", admin.getMessage());
//    }

//    @Test
//    public   void testAdminCreateCook() {
//        staffResponse.setUsername("Mike");
//        staffResponse.setMessage("successfully created");
//        StaffResponse admin= staffService.createCook(staffRequest);
//        assertEquals("successfully created", admin.getMessage());
//    }

}
