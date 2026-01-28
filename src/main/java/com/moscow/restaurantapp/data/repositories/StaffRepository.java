package com.moscow.restaurantapp.data.repositories;

import com.mongodb.client.MongoDatabase;
import com.moscow.restaurantapp.data.models.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends MongoRepository<Staff, Integer> {

}
