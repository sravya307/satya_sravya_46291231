package com.project.searchmicroservice.repository;





import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.searchmicroservice.models.TrainDetails;


public interface TrainRepository extends MongoRepository<TrainDetails,Long> {
	
	
	
	@Query("{'date':?0,'src':?1,'dest':?2}")
	public TrainDetails find(String date,String src,String dest);

	@Query("{'trainno':?0}")
	public TrainDetails findById(long trainno);
	

}
