package com.example.model;

public class Ride {
	
	private String userName;
	private String driverName;
	
	
	
	public Ride() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Ride(String userName, String driverName) {
		super();
		this.userName = userName;
		this.driverName = driverName;
	
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	

	@Override
	public String toString() {
		return "Ride [userName=" + userName + ", driverName=" + driverName;
	}
	
	
	

}
