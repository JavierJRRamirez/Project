package com.csci4448.project.view;

import java.util.List;
import java.util.Scanner;

import com.csci4448.project.controller.FlightController;
import com.csci4448.project.model.Flight;
import com.csci4448.project.model.Location;

public class PathFinderView {
	public static void dayOfFlight(List<Flight> allFlights){
		Scanner reader = new Scanner(System.in);
		System.out.println("Input date for flight: (such as 01/12/19)");
		String userInput1 = reader.nextLine();

		System.out.println("Times and information available for flight this day: ");
		
		System.out.println("Start Time " + "End Time " + "Duration    " + "Seats Available " +"Flight Number   " + "Cost " + "Number assigned to Flight");

		for(Flight myFlight : allFlights){
			System.out.println(myFlight.getStartTime() + "     " + myFlight.getEndTime() + "    " + myFlight.getDuration() + " Hours" + "     " + myFlight.getSeatsAvailable() + "                " +  myFlight.getFlightNum() + "           " + "$" + myFlight.getCost() + "      " + myFlight.getId());
		}
		System.out.println("Select:");
		int userInput2 = reader.nextInt();
		
		System.out.println("          Start Time " + "End Time " + "Duration    " + "Seats Available " +"Flight Number   " + "Cost ");
		for(Flight myFlight : allFlights){
			if(userInput2 == myFlight.getId()) {
				System.out.println("Selected: " + myFlight.getStartTime() + "     " + myFlight.getEndTime() + "    " + myFlight.getDuration() + " Hours" + "     " + myFlight.getSeatsAvailable() + "                " +  myFlight.getFlightNum() + "           " + "$" + myFlight.getCost());
			}
		}
	}
}
