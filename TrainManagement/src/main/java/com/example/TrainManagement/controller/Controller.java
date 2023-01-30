package com.example.TrainManagement.controller;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.TrainManagement.models.TrainDetails;
import com.example.TrainManagement.models.TrainSeatDetails;
import com.example.TrainManagement.service.AdminService;

@RestController
@RequestMapping("/admin")
public class Controller {
	@Autowired
	private RestTemplate rt;
	
	@Autowired
	private AdminService aservice;
	
	@GetMapping("/findalltrains")
	public List<TrainDetails> getAllTrains() {
		return Arrays.asList(rt.getForObject("http://localhost:8080/search/gettrains", TrainDetails[].class));
	}
	
	@GetMapping("{date}/{src}/{dest}")
	public ResponseEntity<TrainDetails> getTrain(@PathVariable String date,@PathVariable String src,@PathVariable String dest){
		
		return rt.getForEntity("http://localhost:8080/search/{date}/{src}/{dest}", TrainDetails.class, date,src,dest);
	}
	
	@GetMapping("/gettrain/{trainno}")
	public ResponseEntity<TrainDetails> getTrainByTrainno(@PathVariable long trainno) {
		return rt.getForEntity("http://localhost:8080/search/gettrain/{trainno}", TrainDetails.class, trainno);
	}
	
	
	//adding a train into the traindetails database
	@PostMapping("/addtrain")
	public ResponseEntity<TrainDetails> createTrain(@RequestBody TrainDetails train1) {
		return rt.postForEntity("http://localhost:8080/search/addtrain", train1, TrainDetails.class);
	}
	
	//adding seat details into the userdb
	@PostMapping("/addseatdetails")
	public ResponseEntity<TrainSeatDetails> addSeats(@RequestBody TrainSeatDetails seat) {
		return rt.postForEntity("http://localhost:8081/book/train", seat, TrainSeatDetails.class);
	}
	
	@GetMapping("/deletetrain/{trainno}")
	public String deletetrain(@PathVariable Long trainno )
	{
		//return rt.getForEntity("http://localhost:8080/search/deletetrain/{trainno}", TrainDetails.class, trainno);
		 return rt.delete("http://localhost:8080/deletetrain/{trainno}", trainno);
		
		//return rt.getForObject("http://localhost:8080/deletetrain/{trainno}",TrainDetails.class,trainno);
		
	}
	
	/*@GetMapping("/gettrain/{trainno}")
	public TrainDetails gettrainByTrainno(@PathVariable Long trainno) {
		return aservice.gettrainByTrainno(trainno);
	}*/
	
	
	


}
