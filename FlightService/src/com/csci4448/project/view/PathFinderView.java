package com.csci4448.project.view;

import java.util.List;
import java.util.Scanner;

import com.csci4448.project.controller.CheckoutController;
import com.csci4448.project.controller.FlightController;
import com.csci4448.project.controller.MementoSaveState;
import com.csci4448.project.model.Flight;
import com.csci4448.project.model.MementoState;

public class PathFinderView {
	
	static MementoState mementoPicked = new MementoState();
	static MementoSaveState mementoSave = new MementoSaveState();
	
	public static void dayOfFlight(List<Flight> allFlights){
		Scanner reader = new Scanner(System.in);
		System.out.println("Input date for flight: (such as 01/12/19 month/day/year)");
		String userInput1 = reader.nextLine();

		System.out.println("Times and information available for flight this day: ");
		
		System.out.println("Start Time " + "End Time " + "Duration    " + "Seats Available " +"Flight Number   " + "Cost " + "Number assigned to Flight");

		for(Flight myFlight : allFlights){
			System.out.println(myFlight.getStartTime() + "     " + myFlight.getEndTime() + "    " + myFlight.getDuration() + " Hours" + "     " + myFlight.getSeatsAvailable() + "                " +  myFlight.getFlightNum() + "           " + "$" + myFlight.getCost() + "      " + myFlight.getId());
		}
		System.out.println("Select:");
		int userInput2 = reader.nextInt();
		boolean flightAvailable = false;

		for(Flight myFlight : allFlights){
			if(userInput2 == myFlight.getId()) {
				flightAvailable = true;
				System.out.println("          Start Time " + "End Time " + "Duration    " + "Seats Available " +"Flight Number     " + "Cost      " + "Date");
				System.out.println("Selected: " + myFlight.getStartTime() + "     " + myFlight.getEndTime() + "    " + myFlight.getDuration() + " Hours" + "     " + /*goFlight*/myFlight.getSeatsAvailable() + "                " +  myFlight.getFlightNum() + "             " + "$" + myFlight.getCost() + "    " + userInput1);
			}
		}
		if(flightAvailable == false){
			System.out.println("Flight not available, please enter again:");
			FlightController.checkFlight();
		}
		if(flightAvailable == true){
			System.out.println("Are you sure you want this flight? Yes (Type 1) No (Type 2)");
		int userInput3 = reader.nextInt();
		if(userInput3 == 1){
		CheckoutController.searchCard();
		}
		if(userInput3 == 2){
			mementoPicked.setState(String.valueOf(userInput2));
			mementoSave.add(mementoPicked.saveStateToMemento());
			mementoPicked.getStateFromMemento(mementoSave.get(0));
			System.out.println("Option picked last time: " + mementoPicked.getState());
			FlightController.checkFlight();
		}
		else {
			System.out.println("Choice not possble, enter valid number");
			System.out.println(" ");
			FlightController.checkFlight();
		}
	}
	}
}
