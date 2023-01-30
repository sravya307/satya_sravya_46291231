package com.project.searchmicroservice.service;



import java.util.List;


import org.springframework.data.mongodb.repository.Query;

import com.project.searchmicroservice.exception.TrainNotFoundException;
import com.project.searchmicroservice.models.TrainDetails;




public interface SearchService {
	
	
	public  TrainDetails  find(String date,String src, String dest);
	public List<TrainDetails>	findAllTrains();
	public TrainDetails createTrain(TrainDetails train);
	public TrainDetails getTrainByTrainno(long trainno);
	public void deleteTrainBytrainno(Long trainno);


	

	

}
