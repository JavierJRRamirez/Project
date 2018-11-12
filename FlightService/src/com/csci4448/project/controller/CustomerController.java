package com.csci4448.project.controller;
import com.csci4448.project.model.Customer;
import com.csci4448.project.model.Flight;
import com.csci4448.project.view.View;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
	private static List<Customer> customers;
	
	public static List<Customer> hardCustomer(){
			customers = new ArrayList<Customer>();
		
			Customer customer1 = new Customer();
			customer1.setFirstName("Javier");
			customer1.setLastName("Ramirez");
			customer1.setCellPhone("719-715-253");
			customer1.setStartLoc("Denver");
			customer1.setEndLoc("Colorado Springs");
			customer1.setStartTime("9:00am");
			customer1.setEndTime("12:00pm");
			customer1.setFlightDuration("3");
			customer1.setFlightNumber("242");
			customer1.setCost((float) 80.00);
			customer1.setReferenceNum();
			customers.add(customer1);
		
			Customer customer2 = new Customer();
			customer2.setFirstName("Kyla");
			customer2.setLastName("Warner");
			customer2.setCellPhone("719-629-9328");
			customer2.setStartLoc("Colorado Springs");
			customer2.setEndLoc("Boulder");
			customer2.setStartTime("7:00pm");
			customer2.setEndTime("10:00pm");
			customer2.setFlightDuration("58");
			customer2.setFlightNumber("2");
			customer2.setCost((float) 125.00);
			customer2.setReferenceNum();
			customers.add(customer2);
		
			Customer customer3 = new Customer();
			customer3.setFirstName("John");
			customer3.setLastName("Lawyer");
			customer3.setCellPhone("951-435-798");
			customer3.setStartLoc("Fort Collins");
			customer3.setEndLoc("Pueblo");
			customer3.setStartTime("2:00pm");
			customer3.setEndTime("6:00pm");
			customer3.setFlightDuration("4");
			customer3.setFlightNumber("103");
			customer3.setCost((float) 184.60);
			customer3.setReferenceNum();
			customers.add(customer3);
			
			return customers;
	}
	
	public static void runAllDay(){
		View.infoRecieved();
	}
	
	public static Customer checkCustomer(String userInput1){
		Customer currentCustomer = null;
		for(Customer check1 : CustomerController.hardCustomer()){
			if(check1.getFirstName().equals(userInput1)){
				currentCustomer = check1;
				break;
			}
		}
		if(currentCustomer == null){
			System.out.println("No user found");
			return null;
		}
		return currentCustomer;
	}
}
