package com.project.ticketbookmicroservice.models;




import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Service
@Document(collection = "trainseatdetails")
public class TrainSeatDetails {
	
	@Id
	private Long trainno;
	private String trainname;	
	private String date;
	private String src;
	private String dest;
	private int ac;
	private int sl;
	private int thirdac;
	private String arrtime;
	private String depttime;
	
	
	public TrainSeatDetails() {
		super();
	}


	public TrainSeatDetails(Long trainno, String trainname, String date, String src, String dest, int ac, int sl,
			int thirdac, String arrtime, String depttime) {
		super();
		this.trainno = trainno;
		this.trainname = trainname;
		this.date = date;
		this.src = src;
		this.dest = dest;
		this.ac = ac;
		this.sl = sl;
		this.thirdac = thirdac;
		this.arrtime = arrtime;
		this.depttime = depttime;
	}


	public Long getTrainno() {
		return trainno;
	}


	public void setTrainno(Long trainno) {
		this.trainno = trainno;
	}


	public String getTrainname() {
		return trainname;
	}


	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getSrc() {
		return src;
	}


	public void setSrc(String src) {
		this.src = src;
	}


	public String getDest() {
		return dest;
	}


	public void setDest(String dest) {
		this.dest = dest;
	}


	public int getAc() {
		return ac;
	}


	public void setAc(int ac) {
		this.ac = ac;
	}


	public int getSl() {
		return sl;
	}


	public void setSl(int sl) {
		this.sl = sl;
	}


	public int getThirdac() {
		return thirdac;
	}


	public void setThirdac(int thirdac) {
		this.thirdac = thirdac;
	}


	public String getArrtime() {
		return arrtime;
	}


	public void setArrtime(String arrtime) {
		this.arrtime = arrtime;
	}


	public String getDepttime() {
		return depttime;
	}


	public void setDepttime(String depttime) {
		this.depttime = depttime;
	}


	@Override
	public String toString() {
		return "TrainDetails [trainno=" + trainno + ", trainname=" + trainname + ", date=" + date + ", src=" + src
				+ ", dest=" + dest + ", ac=" + ac + ", sl=" + sl + ", thirdac=" + thirdac + ", arrtime=" + arrtime
				+ ", depttime=" + depttime + "]";
	}
	
	
}