package com.project.searchmicroservice.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.searchmicroservice.models.TrainDetails;
import com.project.searchmicroservice.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	SearchService searchService;
	
	
	
	
	 @GetMapping("{date}/{src}/{dest}")
	 public  TrainDetails getDetails(@PathVariable String date,@PathVariable String src,@PathVariable String dest) 
	 {
		 
		 	
	        return searchService.find(date,src,dest);
	    }
	 
	 @GetMapping("gettrains")
	 public  List<TrainDetails> getDetails() 
	 {
		 
		 	
	        return (List<TrainDetails>) searchService.findAllTrains();
	    }
	   @PostMapping("/addtrain")
	   public TrainDetails createTrain(TrainDetails train) {
		   return searchService.createTrain(train);
	   }
	   

		 @GetMapping("gettrain/{trainno}")
		 public TrainDetails getTrainByTraino(@PathVariable long trainno) {
			 return searchService.getTrainByTrainno(trainno);
		 }
		 
		 @DeleteMapping("deletetrain/{trainno}")
		 public String deleteTrainBytrainno(@PathVariable Long trainno) {
			 searchService.deleteTrainBytrainno(trainno);
			 return "Train Deleted "+trainno;
		 }
		 

}
