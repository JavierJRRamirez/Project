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
			customer1.setReferenceNum();
			customers.add(customer1);
		
			Customer customer2 = new Customer();
			customer2.setFirstName("Kyla");
			customer2.setLastName("Warner");
			customer2.setCellPhone("719-629-9328");
			customer2.setReferenceNum();
			customers.add(customer2);
		
			Customer customer3 = new Customer();
			customer3.setFirstName("John");
			customer3.setLastName("Lawyer");
			customer3.setCellPhone("951-435-798");
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
