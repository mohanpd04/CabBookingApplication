package com.example.model;

public class Driver {
	
	private User user;
	private Vehicle vehicle;
	private Location currentLocation;
	private boolean available = true;
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public Driver(User user, Vehicle vehicle, Location currentLocation) {
		super();
		this.user = user;
		this.vehicle = vehicle;
		this.currentLocation = currentLocation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
	}

	

	
	

}
