package com.project.searchmicroservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.searchmicroservice.models.TrainDetails;
import com.project.searchmicroservice.repository.TrainRepository;
import com.project.searchmicroservice.service.SearchServiceImpl;

@SpringBootTest
public class SearchMicroservicesApplicationTest {
	
	@Autowired
	SearchServiceImpl serve;
	
	@MockBean
	TrainRepository repos;
	
	public List<TrainDetails> train;
	
	@Test
	public void findAllTrainsTest() {
		when(repos.findAll()).thenReturn((List<TrainDetails>) Stream.of(new TrainDetails(57823L,"Fareed Express","07:00am","08:00am",
				"02-02-2023","Karachi City","Quetta")).collect(Collectors.toList()));
		assertEquals(1,serve.findAllTrains().size());  
		
	}
	
	@Test
	public void findTest() {
		TrainDetails train = new TrainDetails(57823L,"Fareed Express","07:00am","08:00am",
				"02-02-2023","Karachi City","Quetta");
		TrainDetails tr = this.repos.find("02-02-2023","Karachi City","Quetta");
		assertEquals(train,tr);
		
				
	}
	
	@Test
	public void createTrainTest() {
		TrainDetails train = new TrainDetails(35462L,"02-02-2023","Khyber Mall","07:00am","08:00am","Karachi City","Quetta");
		when(repos.save(train)).thenReturn(train);
		assertEquals(train,serve.createTrain(train));
		
	}

}
