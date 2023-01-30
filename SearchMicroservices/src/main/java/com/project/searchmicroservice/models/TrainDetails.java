package com.project.searchmicroservice.models;




import org.springframework.data.annotation.Id;
import java.lang.Long;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Service
@Document(collection = "traindetails")
public class TrainDetails {
	
	@Id
	private Long trainno;
	private String trainname;
	private String arrtime;
	private String depttime;
	private String date;
	private String src;
	private String dest;
	public TrainDetails() {
		super();
	}
	public TrainDetails(Long trainno, String trainname, String arrtime, String depttime, String date, String src,
			String dest) {
		super();
		this.trainno = trainno;
		this.trainname = trainname;
		this.arrtime = arrtime;
		this.depttime = depttime;
		this.date = date;
		this.src = src;
		this.dest = dest;
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
	
	@Override
	public String toString() {
		return "TrainDetails [trainno=" + trainno + ", trainname=" + trainname + ", arrtime=" + arrtime + ", depttime="
				+ depttime + ", date=" + date + ", src=" + src + ", dest=" + dest + "]";
	}
	
	
}