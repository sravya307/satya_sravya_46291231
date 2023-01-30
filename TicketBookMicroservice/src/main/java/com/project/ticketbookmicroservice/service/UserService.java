package com.project.ticketbookmicroservice.service;

import com.project.ticketbookmicroservice.models.AuthenticationRequest;
import com.project.ticketbookmicroservice.models.UserModel;

public interface UserService {
	public UserModel createUser(UserModel user);
	public AuthenticationRequest register(AuthenticationRequest auth);
	

}
