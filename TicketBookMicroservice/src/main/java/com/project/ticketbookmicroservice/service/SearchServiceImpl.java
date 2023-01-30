package com.project.ticketbookmicroservice.service;



import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ticketbookmicroservice.models.TrainSeatDetails;
import com.project.ticketbookmicroservice.repository.TrainRepository;



@Service

public class SearchServiceImpl implements SearchService {
	
	@Autowired
	TrainRepository repository;

	@Autowired	
	TrainSeatDetails details;
	
	

	/*@Override
	public List<TrainSeatDetails> find(String date,String src,String dest) {
		
		
		
		
		return this.repository.find(date, src, dest);
	}*/
	
	public List<TrainSeatDetails> findBytrainno(long trainno){
		return this.repository.findBytrainno(trainno);
	}

	public TrainSeatDetails createTrain(TrainSeatDetails train) {
		return  repository.save(train);
		
	}
	

}
