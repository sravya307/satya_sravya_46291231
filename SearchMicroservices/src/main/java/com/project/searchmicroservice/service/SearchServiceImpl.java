package com.project.searchmicroservice.service;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.project.searchmicroservice.exception.TrainNotFoundException;
import com.project.searchmicroservice.models.TrainDetails;
import com.project.searchmicroservice.repository.TrainRepository;

@Service

public class SearchServiceImpl implements SearchService {
	Logger lg = LoggerFactory.getLogger(SearchServiceImpl.class);
	
	@Autowired
	TrainRepository repository;

	@Autowired	
	TrainDetails details;
	
	@Override
	public TrainDetails find(String date,String src,String dest)throws TrainNotFoundException {		
		
		//return this.repository.find(date, src, dest);
		TrainDetails tr = repository.find(date, src, dest);
		if(tr == null) {throw new TrainNotFoundException("Train Not Found on date "+date);}
		return tr;
	}
	
	
	
	@Override
	public List<TrainDetails> findAllTrains() {		
		
		return this.repository.findAll();
	}



	@Override
	public TrainDetails createTrain(TrainDetails train) {
		// TODO Auto-generated method stub
		return repository.save(train);
	}



	@Override
	public TrainDetails getTrainByTrainno(long trainno) {
		return repository.findById(trainno);
	
		
	}



	@Override
	public void deleteTrainBytrainno(Long trainno) {
		// TODO Auto-generated method stub
		repository.deleteById(trainno);
	}
	
	

}
