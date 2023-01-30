package com.example.TrainManagement.service;

import java.util.List;

import com.example.TrainManagement.models.TrainDetails;
import com.example.TrainManagement.models.TrainSeatDetails;

public interface AdminService {

	public TrainDetails createTrain(TrainDetails train);
	public TrainSeatDetails	addtrainseat(TrainSeatDetails seat);
	public void deletetrain(Long trainno);
	//public  List<TrainDetails> findTrainByTrainno(Long trainno);
	
	
}
