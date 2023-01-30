package com.payment.paymentservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.payment.paymentservice.Model.PaymentDetails;
@EnableMongoRepositories

public interface PaymentRepository extends MongoRepository<PaymentDetails, Long> {
	// PaymentPOJO findOrderById(Integer orderId);
	}