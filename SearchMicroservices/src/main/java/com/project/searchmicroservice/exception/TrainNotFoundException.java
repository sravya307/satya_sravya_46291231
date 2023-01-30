package com.project.searchmicroservice.exception;

public class TrainNotFoundException extends RuntimeException{

	
	String message;

	public TrainNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public TrainNotFoundException() {
		super();
	}
	
}
