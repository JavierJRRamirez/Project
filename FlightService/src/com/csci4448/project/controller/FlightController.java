package com.csci4448.project.controller;
import java.util.*;

import com.csci4448.project.model.Flight;
import com.csci4448.project.view.PathFinderView;

/**
 * This class creates flights, stores them in myFlight list and uses
 * two methods in PathFinder and PathFinderView to access all of the 
 * locations and uses myFlight list of flight information to display to the user.
 * @author javierramirez
 *
 */
public class FlightController {
	private static List<Flight> myFlight;
	
	/**
	 * Creates flights and stores flight information in myFlight.
	 * @return List<Flight>
	 */
	public static List<Flight> flightInfo(){
		return myFlight;
	}
	static{
		myFlight = new ArrayList<Flight>();
		
		myFlight.add(new Flight("5:00am", "6:00am", 1, 10, 90, "86", 95.12, 1));
		myFlight.add(new Flight("8:00am", "10:00am", 2, 21, 79, "110", 120.55, 2));
		myFlight.add(new Flight("9:00am", "12:00pm", 3, 15, 85, "242", 144.60, 3));
		myFlight.add(new Flight("2:00pm", "6:00pm", 4, 20, 80, "103", 185.90, 4));
		myFlight.add(new Flight("7:00pm", "10:00pm", 3, 25, 75, "58", 124.76, 5));
		myFlight.add(new Flight("11:00pm", "1:00am", 2, 48, 52, "2", 105.22, 6));
	}
	
	
	/**
	 * This method is used to call searchFlight in PathFinder class
	 * to select locations.
	 */
	public static void flightRun(){
		PathFinder.searchFlight();
	}
	
	/**
	 * This method calls dayOfFlight in PathFinderView class to display flight information.
	 * @return Flight
	 */
	public static Flight checkFlight(){
		PathFinderView.dayOfFlight(myFlight);
		Flight currentFlight = null;
		
		return currentFlight;
		}
}
