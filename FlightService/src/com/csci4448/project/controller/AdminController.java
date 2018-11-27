package com.csci4448.project.controller;

import com.csci4448.project.model.Customer;
import com.csci4448.project.model.Flight;

/**
 *AdminController gets information from the FlightController and 
 *CustomerController and uses this information in the AdminView to display.
 * @author javierramirez
 *
 */
public class AdminController {	
	/**
	 * Check1 checks if flight number selected
	 * matches flightNumber and returns total amount 
	 * of seats available.
	 * @param	flightNumber is the flight number for individual flights.
	 * @return	int
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
	 * checkCustomer checks if the first name matches
	 * the first name of a customer in CustomerController.
	 * @param	firstName Checks firstName of the customers in CustomerController.
	 * @return	Customer
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
