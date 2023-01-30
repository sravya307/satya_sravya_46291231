package com.project.ticketbookmicroservice.service;



import java.util.List;


import org.springframework.data.mongodb.repository.Query;

import com.project.ticketbookmicroservice.models.TrainSeatDetails;






public interface SearchService {
	
	
	
	public List<TrainSeatDetails>   findBytrainno(long trainno);
	public TrainSeatDetails	createTrain(TrainSeatDetails train);


	

	

}
