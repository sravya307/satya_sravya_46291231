package com.project.ticketbookmicroservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.project.ticketbookmicroservice.models.TrainSeatDetails;
import com.project.ticketbookmicroservice.models.UserModel;
import com.project.ticketbookmicroservice.repository.TrainRepository;
import com.project.ticketbookmicroservice.repository.UserRepository;
import com.project.ticketbookmicroservice.service.SearchServiceImpl;
import com.project.ticketbookmicroservice.service.UserServiceImpl;

@SpringBootTest
class TicketBookMicroserviceApplicationTests {
	@Autowired
	UserServiceImpl userve;
	
	@Autowired
	SearchServiceImpl sserve;
	
	@MockBean
	UserRepository urepos;
	
	@MockBean
	TrainRepository trepos;
	


	@Test
	public void createUserTest() {
		UserModel umodel = new UserModel(482,"satya","sravya","sravya@gmail.com","dhh","euie");
		when(urepos.save(umodel)).thenReturn(umodel);
		assertEquals(umodel,userve.createUser(umodel));
	}
	
	@Test
	public void findBytrainnoTest() {
		TrainSeatDetails ts = new TrainSeatDetails(89473L,"Fareed Express","02-02-2023","Karachi City","Quetta",20,	15,	40,"07:00am","08:00am");
		
		assertThat(ts.getTrainno()).isEqualTo(89473);
	}

}
