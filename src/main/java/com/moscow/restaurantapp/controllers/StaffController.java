package com.moscow.restaurantapp.controllers;

import com.moscow.restaurantapp.data.repositories.StaffRepository;
import com.moscow.restaurantapp.dtos.requests.StaffRequest;
import com.moscow.restaurantapp.dtos.responses.StaffResponse;
import com.moscow.restaurantapp.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @PostMapping("createStaff")
    public ResponseEntity<?>createStaff(@RequestBody StaffRequest staffRequest){
        StaffResponse StaffResponse = staffService.createStaff(staffRequest);
        return new ResponseEntity<>(StaffResponse, HttpStatus.CREATED);
    }






}
