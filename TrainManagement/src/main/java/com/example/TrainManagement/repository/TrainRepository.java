package com.example.TrainManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.TrainManagement.models.TrainDetails;
import com.example.TrainManagement.models.TrainSeatDetails;

public interface TrainRepository extends MongoRepository<TrainDetails,Long>{

	TrainDetails findTrainByTrainno(Long trainno);

	

}
