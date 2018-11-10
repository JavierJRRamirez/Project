package com.csci4448.project.view;
import java.io.*;
import java.util.*;
import com.csci4448.project.controller.FlightController;
import com.csci4448.project.controller.PathFinder;
import com.csci4448.project.model.Flight;
import com.csci4448.project.model.Location;

public class FlightView {
	
	public static void chosenFlight(List<Location> allLocation){
		System.out.println("Choose from the available locations");
		for(Location availableLocation : allLocation) {
			System.out.println(availableLocation.getName() + ": " + availableLocation.getId());
		}
		System.out.println("Enter number assigned to the Location");
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter start and end location: ");
		int userInput = reader.nextInt();
		int userInput2 = reader.nextInt();
		for(Location availableLocation : allLocation){
			if(userInput == availableLocation.getId() || userInput2 == availableLocation.getId()){
				System.out.println("Selected: " + availableLocation.getName());
			}
		}
		FlightController.checkFlight();
//		Scanner reader1 = new Scanner(System.in);
//		String userInput1 = reader.nextLine();
//		Flight currentFlight = FlightController.checkFlight(userInput1);
//		if(currentFlight == null){
//			return;
//		}
//		System.out.println("Date: " + currentFlight.getDate());
//		System.out.println("Start time: " + currentFlight.getStartTime());
//		System.out.println("End time: " + currentFlight.getEndTime());
//		System.out.println("Duration: " + currentFlight.getDuration());
//		System.out.println("Flight number: " + currentFlight.getFlightNum());
//		System.out.println("Cost: " + currentFlight.getCost());
	}
}
