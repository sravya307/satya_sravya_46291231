package com.project.ticketbookmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.project.ticketbookmicroservice.models.AuthenticationRequest;
import com.project.ticketbookmicroservice.models.ReservationDetails;
import com.project.ticketbookmicroservice.models.UserModel;

public interface UserRepository extends MongoRepository<UserModel,Integer>{
	

	UserModel findByUsername(String username);

	AuthenticationRequest save(AuthenticationRequest auth);
}
