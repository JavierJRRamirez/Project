package com.csci4448.project.view;
import java.io.*;
import java.util.*;

import com.csci4448.project.controller.AdminController;
import com.csci4448.project.controller.CustomerController;
import com.csci4448.project.controller.FlightController;
import com.csci4448.project.model.Customer;
import com.csci4448.project.model.Flight;

public class AdminView {
	public static void adminStart(){
		System.out.println("Check vacancy of a flight: (Type 1)");
		System.out.println("Search for a client: (Type 2)");
		adminSelect();
	}
	
	public static void adminSelect(){
		Scanner reader = new Scanner(System.in);
		int userInput = reader.nextInt();
		if(userInput == 1){
			Scanner read = new Scanner(System.in);
			System.out.println("Enter flight number");
			String flightNumber = read.nextLine();
			int currentSeats = AdminController.checkVacency(flightNumber);
			if(currentSeats == 0){
				return;
			}
			System.out.println("Vacant seat for Flight number: " + flightNumber);
			System.out.println("Amount of vacant seats: " + currentSeats);
		}
		if(userInput == 2){
			Scanner read = new Scanner(System.in);
			System.out.println("Enter client name: ");
			String clientName = read.nextLine();
			Customer searchCustomer = AdminController.searchClient(clientName);
			if(searchCustomer == null){
				return;
			}
			System.out.println("Information display :)");
		}
	}
}
