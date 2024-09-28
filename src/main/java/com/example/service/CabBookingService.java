package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Driver;
import com.example.model.Location;
import com.example.model.Ride;
import com.example.model.User;

@Service
public class CabBookingService {
	
	HashMap<String, User> users = new HashMap<>();
	List<Driver> drivers = new ArrayList<>();
	List<Ride> rides = new ArrayList<>();
	
	
	List<String> availableDrivers = new ArrayList<>();
	
	public void addUsers(User user) {
		users.put(user.getName(), new User(user.getName(), user.getGender(), user.getAge()) );
	}
	
	public void addDrivers(Driver driver) {
		drivers.add(new Driver(driver.getUser(), driver.getVehicle(), driver.getCurrentLocation()));
	}
	
	public List<String> findRides(String username, Location userLocation, Location destination) {
		if(!users.containsKey(username)) {
			throw new RuntimeException("User Not Registered");
		}
		
		
		
		for(Driver driver :drivers) {
			if(driver.isAvailable() && isWithinDistance(driver.getCurrentLocation(), userLocation, 5)) {
				availableDrivers.add(driver.getUser().getName());
			}
		}
		return availableDrivers.isEmpty() ? List.of("No ride found") : availableDrivers;
	}
	
	private boolean isWithinDistance(Location driverLocation, Location userLocation, int maxDistance) {
		int distance = Math.abs(driverLocation.getX() - userLocation.getX()
				+ Math.abs(driverLocation.getY() - driverLocation.getY()));
		
		return distance <= maxDistance;
	}
	
	public void setDriverUnavailable(String driverName) {
		for(Driver driver : drivers) {
			if(driver.getUser().getName().equals(driverName)) {
				driver.setAvailable(false);
			}
		}		
	}

	public void choseRide(String username, String driverName) {
		// TODO Auto-generated method stub
		if(!users.containsKey(username)) {
			throw new RuntimeException("User Not Registered");
		}
		
		if(!availableDrivers.contains(driverName)) {
			throw new RuntimeException("Please Chose Available Drivers");
		}
		
		rides.add(new Ride(username, driverName));
	}

}
