package com.project.ticketbookmicroservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserDb")
public class UserModel {
	@Id
	private Integer id;
	private String fname;
	private String lname;	
	private String email_address;
	private String username;
	private String password;
	public UserModel() {
		super();
	}
	public UserModel(Integer id, String fname, String lname, String email_address, String username, String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email_address = email_address;
		this.username = username;
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
