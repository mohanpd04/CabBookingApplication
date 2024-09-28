package com.example;

import com.example.model.Driver;
import com.example.model.Location;
import com.example.model.User;
import com.example.model.Vehicle;
import com.example.service.CabBookingService;

public class Demo {
	
	public static void main(String[] args) {
		
		CabBookingService service = new CabBookingService();
		
		service.addUsers(new User("Mohsin", "Male", 26));
		service.addUsers(new User("Prasad", "Male", 23));
		service.addUsers(new User("Jenny", "Female", 27));
		
		service.addDrivers(new Driver(new User("Gajanan", "Male", 45), new Vehicle("Dzire", "MH-40-R1234"), new Location(1, 1)));
		service.addDrivers(new Driver(new User("Salim", "Male", 48), new Vehicle("Zest", "MH-40-D1264"), new Location(7, 3)));
		service.addDrivers(new Driver(new User("John", "Male", 55), new Vehicle("WagonR", "MH-49-R1274"), new Location(8, 4)));
		
		System.out.println(service.findRides("Mohsin", new Location(4, 5), new Location(13, 15)));
		service.choseRide("Mohsin", "Salim");
		service.setDriverUnavailable("Mohsin");
	}

}
