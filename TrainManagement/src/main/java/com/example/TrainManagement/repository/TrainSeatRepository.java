package com.example.TrainManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.TrainManagement.models.TrainSeatDetails;

public interface TrainSeatRepository extends MongoRepository<TrainSeatDetails,Long> {

}
