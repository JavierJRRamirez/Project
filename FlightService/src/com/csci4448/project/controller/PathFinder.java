package com.csci4448.project.controller;
import com.csci4448.project.model.Customer;
import com.csci4448.project.model.Flight;
import com.csci4448.project.model.Location;
import java.util.List;

public class PathFinder{
	public String locationFrom;
	public String locationTo;
	public Customer customer;
	public List<Flight> selectedFlights;
	public static List<Location> availableLocation;
	
	static {
		availableLocation.add(new Location("Boulder", 1));
		availableLocation.add(new Location("Fort Collins", 2));
		availableLocation.add(new Location("Colorado Springs", 3));
		availableLocation.add(new Location("Denver", 4));
		availableLocation.add(new Location("Pueblo", 5));
	}
	
//	public Flight searchFlight(String locationFrom, String locationTo, 
//			List<Flight> selectedFlights){
//		
//		return Flight;
//	}
}
