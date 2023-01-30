package com.project.ticketbookmicroservice.models;


import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "reservationdetails")
public class ReservationDetails {
	@Id
	private int id;
	private String fullname;
	private String gender;
	private String coach;
	private int passengers;
	private String origin;
	private String destination;
	private String date;
	private long pnr;
	
	
	public ReservationDetails() {
		super();
	}


	public ReservationDetails(int id, String fullname, String gender, String coach, int passengers, String origin,
			String destination, String date) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.coach = coach;
		this.passengers = passengers;
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		//this.pnr = pnr;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCoach() {
		return coach;
	}


	public void setCoach(String coach) {
		this.coach = coach;
	}


	public int getPassengers() {
		return passengers;
	}


	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public long getPnr() {
		return pnr;
	}



	public void setPnr(long pnr) {
		long number=(long) Math.floor(Math.random() * 9_000_000_00L)+1_000_000_00L;
		this.pnr = number;
		
	}
	
	@Override
	public String toString() {
		return "ReservationDetails [id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", coach=" + coach
				+ ", passengers=" + passengers + ", origin=" + origin + ", destination=" + destination + ", date="
				+ date + ", pnr=" + pnr + "]";
	}
	

}
