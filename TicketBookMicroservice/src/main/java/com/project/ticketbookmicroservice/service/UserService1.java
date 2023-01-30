package com.project.ticketbookmicroservice.service;


/*import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.ticketbookmicroservice.models.UserModel;
import com.project.ticketbookmicroservice.repository.UserRepository;

@Service
public class UserService1 implements UserDetailsService {

	@Autowired
	UserRepository urepos;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserModel founduser = urepos.findByUsername(username);
		if(founduser == null)return null;
		
		String name = founduser.getUsername();
		String pwd1 = founduser.getPassword();
		return new User(name,pwd1,null);
	}

}*/
