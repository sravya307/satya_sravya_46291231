package com.example.TrainManagement.models;

public class Admin {
	
	private int adminid;
	private String adminname;
	
	
	//default constructor
	public Admin() {
		super();
	}
	
	//parameterised constructors
	public Admin(int adminid, String adminname) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	
	

}
