package com.project.ticketbookmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.ticketbookmicroservice.models.ReservationDetails;

public interface ReservationRepository extends MongoRepository<ReservationDetails, Integer>{

}
