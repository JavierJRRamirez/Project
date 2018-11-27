package com.csci4448.project.controller;
import com.csci4448.project.model.Customer;
import com.csci4448.project.model.Flight;
import com.csci4448.project.model.Location;
import com.csci4448.project.view.FlightView;

import java.util.ArrayList;
import java.util.List;

/**
 * This class uses the Location class to add a name and id (which is a city and
 * id assigned to each city) to the availableLocation list to use 
 * in the FlightView class.
 * @author javierramirez
 *
 */
public class PathFinder{
	public Location locationFrom;
	public Location locationTo;
	public Customer customer;
	public static Flight selectedFlights;
	public static List<Location> availableLocation;
	
	static {
		availableLocation = new ArrayList<Location>();
		availableLocation.add(new Location("Boulder", 1));
		availableLocation.add(new Location("Fort Collins", 2));
		availableLocation.add(new Location("Colorado Springs", 3));
		availableLocation.add(new Location("Denver", 4));
		availableLocation.add(new Location("Pueblo", 5));
	}
	
	/**
	 * This method is used to display available locations in searchFlight
	 * in the FlightView class.
	 */
	public static void searchFlight(){
		FlightView.chosenFlight(availableLocation);
	}
}
