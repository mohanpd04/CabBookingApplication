package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Driver;
import com.example.model.Location;
import com.example.model.User;
import com.example.service.CabBookingService;

@RestController
@RequestMapping("/cab")
public class CabBookingController {
	
	@Autowired
	private CabBookingService cabBookingService;
	
	@PostMapping("/adduser")
	public void addUser(@RequestBody User user) {
		cabBookingService.addUsers(user);
	}
	
	
	@PostMapping("/adddriver")
	public void addDriver(@RequestBody Driver driver) {
		cabBookingService.addDrivers(driver);
	}
	
	@GetMapping("/findrides")
	public List<String> findRides(
            @RequestParam String username,
            @RequestParam int sourceX,
            @RequestParam int sourceY,
            @RequestParam int destinationX,
            @RequestParam int destinationY) {
        
        Location source = new Location(sourceX, sourceY);
        Location destination = new Location(destinationX, destinationY);
        return cabBookingService.findRides(username, source, destination);
    }
	
	@PostMapping("/setdriverunavailable/{driverName}")
	public void setDriverUnAvailable(@PathVariable String driverName) {
		 cabBookingService.setDriverUnavailable(driverName);
	}
	
	@PostMapping("/choseride")
	public void choseRide(@RequestParam String username, @RequestParam String driverName) {
		cabBookingService.choseRide(username,driverName);
	}
	

}
