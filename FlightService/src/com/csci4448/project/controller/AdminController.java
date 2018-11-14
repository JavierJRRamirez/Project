package com.csci4448.project.controller;

import com.csci4448.project.model.Customer;
import com.csci4448.project.model.Flight;

public class AdminController {	
	/**
	 * Check1 if flight number selected
	 * matches flightNumber and returns total amount 
	 * of seats available 
	 * @param flightNumber
	 * @return
	 */
	public static int checkVacency(String flightNumber){
		Flight currentSeats = null;
		for(Flight check1 : FlightController.flightInfo()){
			if(check1.getFlightNum().equals(flightNumber)){
				currentSeats = check1;
				int totalSeats = check1.seatsAvailable;
				return totalSeats;
			}
		}
		if(currentSeats == null){
			System.out.println("No flight found");
			return 0;
		}
		return 0;
	}
	
	/**
	 * @param firstName
	 * @return
	 */
	public static Customer searchClient(String firstName){
		Customer searchCustomer = null;
		for(Customer checkCustomer : CustomerController.hardCustomer()){
			if(checkCustomer.getFirstName().equals(firstName)){
				searchCustomer = checkCustomer;
			}
		}
		if(searchCustomer == null){
			System.out.println("Client not found");
			return null;
		}
		return searchCustomer;
	}
}
