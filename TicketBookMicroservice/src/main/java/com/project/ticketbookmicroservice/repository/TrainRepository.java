package com.project.ticketbookmicroservice.repository;





import java.util.List;



import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.ticketbookmicroservice.models.TrainSeatDetails;




public interface TrainRepository extends MongoRepository<TrainSeatDetails,Long> {
	

	@Query("{'date':?0,'src':?1,'dest':?2}")
	List<TrainSeatDetails> find(String date,String src,String dest);
	
	//@Query("{'trainno':?0}")
	List<TrainSeatDetails> findBytrainno(long trainno);
	

}
