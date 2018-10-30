package com.csci4448.project.view;
import java.io.*;
import java.util.*;
import com.csci4448.project.controller.FlightController;
import com.csci4448.project.model.Flight;

public class FlightView {
	
	public static void chosenFlight(){
		System.out.println("Choose from the available locations");
		Scanner reader = new Scanner(System.in);
		System.out.println("Start Location: ");
		String userInput = reader.nextLine();
		Flight currentFlight = FlightController.checkFlight(userInput);
		if(currentFlight == null){
			return;
		}
		System.out.println("Date: " + currentFlight.getDate());
		System.out.println("Start time: " + currentFlight.getStartTime());
		System.out.println("End time: " + currentFlight.getEndTime());
		System.out.println("Duration: " + currentFlight.getDuration());
		System.out.println("Flight number: " + currentFlight.getFlightNum());
		System.out.println("Cost: " + currentFlight.getCost());
	}
}