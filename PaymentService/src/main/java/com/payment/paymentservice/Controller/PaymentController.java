package com.payment.paymentservice.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.paymentservice.Model.PaymentDetails;
import com.payment.paymentservice.Repository.PaymentRepository;
import com.payment.paymentservice.Service.PaymentService;

import ch.qos.logback.core.joran.spi.ActionException;


@RestController
@RequestMapping("/payments")
public class PaymentController {
	@Autowired
	public PaymentService paymentService;
	@Autowired
	public PaymentRepository paymentRepository;

	/*@GetMapping("/orders/{id}")
	public Optional<PaymentPOJO> getCustomerById(@PathVariable int id) throws ActionException {
		return Optional.of(paymentRepository.findById(id).orElseThrow(() -> new ActionException()));
		}*/

	@PostMapping("/payment")
		public PaymentDetails doPayment(@RequestBody PaymentDetails payment)
		{return paymentService.doPay(payment);
		}
}
