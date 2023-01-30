package com.project.ticketbookmicroservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ticketbookmicroservice.models.AuthenticationRequest;
import com.project.ticketbookmicroservice.models.AuthenticationResponse;
import com.project.ticketbookmicroservice.models.UserModel;
import com.project.ticketbookmicroservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository urepository;
	
	/*@Autowired
	AuthenticationResponse ar = new AuthenticationResponse();*/
	
	public UserModel createUser(UserModel user) {
		//Save to MongoDB via repo
		return urepository.save(user);//hits MongoDB
	}
	
	public AuthenticationRequest register(AuthenticationRequest auth) {
		String uname = auth.getUsername();
		String pwd = auth.getPassword();
		
		UserModel ud = new UserModel();
		ud.setUsername(uname);
		ud.setPassword(pwd);		
		
		return urepository.save(auth);
		
	}

	
}
