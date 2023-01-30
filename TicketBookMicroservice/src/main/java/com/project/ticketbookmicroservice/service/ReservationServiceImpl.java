package com.project.ticketbookmicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ticketbookmicroservice.models.ReservationDetails;

import com.project.ticketbookmicroservice.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	ReservationRepository repository;
	
	public ReservationDetails addUser(ReservationDetails reserve) {
		//Save to MongoDB via repo
		return repository.save(reserve);//hits MongoDB
	}

}
