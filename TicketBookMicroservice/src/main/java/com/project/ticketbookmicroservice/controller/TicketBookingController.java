package com.project.ticketbookmicroservice.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.ticketbookmicroservice.models.AuthenticationRequest;
import com.project.ticketbookmicroservice.models.AuthenticationResponse;
import com.project.ticketbookmicroservice.models.ReservationDetails;
import com.project.ticketbookmicroservice.models.TrainSeatDetails;
import com.project.ticketbookmicroservice.models.UserModel;
import com.project.ticketbookmicroservice.service.ReservationService;
import com.project.ticketbookmicroservice.service.SearchService;
import com.project.ticketbookmicroservice.service.UserService;

@RestController
@RequestMapping("/book")
public class TicketBookingController {
	@Autowired
	UserService uservice;
	
	@Autowired
	ReservationService rservice;
	
	@Autowired 
	SearchService tservice;
	
	@PostMapping("newuser")
	public UserModel newUser(@RequestBody UserModel user){
		return uservice.createUser(user);
		}
	
	@PostMapping("reserveticket")
	public String newreservation(@RequestBody ReservationDetails reserve){
		reserve.setPnr(0);
		rservice.addUser(reserve);
		return "The PNR number is : "+reserve.getPnr();
	}
	
	
	@GetMapping("/gettrains/{trainno}")
	public List<TrainSeatDetails> getDetails(@PathVariable long trainno) {
		return (List<TrainSeatDetails>) tservice.findBytrainno(trainno);
	}
	
	
	@PostMapping("/train")
	public TrainSeatDetails addtrain(@RequestBody TrainSeatDetails train) {
		return tservice.createTrain(train);
		
	}
}
