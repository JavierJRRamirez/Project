package com.csci4448.project.controller;
import java.util.*;

import com.csci4448.project.model.Customer;
import com.csci4448.project.model.Flight;
import com.csci4448.project.view.FlightView;
import com.csci4448.project.view.View;

public class FlightController {
	private static List<Flight> myFlight;
	
	public static List<Flight> pathFinder(){
		return myFlight;
	}
	static{
		myFlight = new ArrayList<Flight>();
		//
		Flight myFlight1 = new Flight();
		myFlight1.setDate("11-20-2018");
		myFlight1.setStartTime("5:00am");
		myFlight1.setEndTime("6:00am");
		myFlight1.setDuration(1);
		myFlight1.setFlightNum("86");
		myFlight1.setSeatsAvailable(10);
		myFlight1.setSeatsTaken(90);
		myFlight1.setCost(95.12);
		myFlight.add(myFlight1);
		
		Flight myFlight2 = new Flight();
		myFlight2.setDate("11-21-2018");
		myFlight2.setStartTime("8:00am");
		myFlight2.setEndTime("10:00am");
		myFlight2.setDuration(2);
		myFlight2.setFlightNum("110");
		myFlight2.setSeatsAvailable(21);
		myFlight2.setSeatsTaken(19);
		myFlight2.setCost(120.55);
		myFlight.add(myFlight2);
		
		Flight myFlight3 = new Flight();
		myFlight3.setDate("11-22-2018");
		myFlight3.setStartTime("9:00am");
		myFlight3.setEndTime("12:00pm");
		myFlight3.setDuration(3);
		myFlight3.setFlightNum("242");
		myFlight3.setSeatsAvailable(15);
		myFlight3.setSeatsTaken(85);
		myFlight3.setCost(144.60);
		myFlight.add(myFlight3);
		
		Flight myFlight4 = new Flight();
		myFlight4.setDate("11-23-2018");
		myFlight4.setStartTime("2:00pm");
		myFlight4.setEndTime("6:00pm");
		myFlight4.setDuration(4);
		myFlight4.setFlightNum("103");
		myFlight4.setSeatsAvailable(20);
		myFlight4.setSeatsTaken(80);
		myFlight4.setCost(185.90);
		myFlight.add(myFlight4);
		
		Flight myFlight5 = new Flight();
		myFlight5.setDate("11-24-2018");
		myFlight5.setStartTime("7:00pm");
		myFlight5.setEndTime("10:00pm");
		myFlight5.setDuration(3);
		myFlight5.setFlightNum("58");
		myFlight5.setSeatsAvailable(25);
		myFlight5.setSeatsTaken(75);
		myFlight5.setCost(124.76);
		myFlight.add(myFlight5);
		
		Flight myFlight6 = new Flight();
		myFlight6.setDate("11-25-2018");
		myFlight6.setStartTime("11:00pm");
		myFlight6.setEndTime("1:00am");
		myFlight6.setDuration(2);
		myFlight6.setFlightNum("2");
		myFlight2.setSeatsAvailable(48);
		myFlight2.setSeatsTaken(52);
		myFlight6.setCost(105.22);
		myFlight.add(myFlight6);
	}
	
	public static void flightRun(){
		FlightView.chosenFlight();
	}
	
	public static Flight checkFlight(String userInput){
		Flight currentFlight = null;
		for(Flight check1 : FlightController.pathFinder()){
			if(check1.getDate().equals(userInput)){
				currentFlight = check1;
				break;
			}
		}
		if(currentFlight == null){
			System.out.println("No user found");
			return null;
		}
		return currentFlight;
	}
}
