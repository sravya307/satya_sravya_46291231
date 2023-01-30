package com.payment.paymentservice.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Payments")
public class PaymentDetails {
	
	@Id
    private Long pnr;
	private int amount;
	private String paymentStatus;
	private String txId;
	public Long getPnr() {
		return pnr;
	}
	public void setPnr(Long pnr) {
		this.pnr = pnr;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	
}

	