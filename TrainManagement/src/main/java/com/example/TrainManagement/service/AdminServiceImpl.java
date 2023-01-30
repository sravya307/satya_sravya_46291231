package com.example.TrainManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.TrainManagement.models.TrainDetails;
import com.example.TrainManagement.models.TrainSeatDetails;
import com.example.TrainManagement.repository.TrainRepository;
import com.example.TrainManagement.repository.TrainSeatRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired 
	TrainRepository trepository;
	
	@Autowired
	TrainSeatRepository trepos;
	
	@Autowired
	private RestTemplate rt;
	
	public TrainDetails createTrain(TrainDetails train) {
		return trepository.save(train);
	}

	@Override
	public TrainSeatDetails addtrainseat(TrainSeatDetails seat) {
		// TODO Auto-generated method stub
		return trepos.save(seat);
	}
	
	public void deletetrain(Long trainno) {
		
		trepository.deleteById(trainno);
	}

	/*@Override
	public List<TrainDetails> findTrainByTrainno(Long trainno) {
		// TODO Auto-generated method stub
		return 
	}*/

	
	
	

	
	
	

}
