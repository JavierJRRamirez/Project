package com.csci4448.project.view;
import com.csci4448.project.model.Customer;

import java.io.*;
import java.util.*;

public class CustomerInfo {
	private static List<Customer> customers;
	
	enum UserType {
		Admin, Customer;
	}
	
	static {
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
		customer1.setReferenceNum();
		customers.add(customer2);
		
		Customer customer3 = new Customer();
		customer3.setFirstName("john");
		customer3.setLastName("lawyer");
		customer3.setCellPhone("951-435-798");
		customer1.setReferenceNum();
		customers.add(customer3);
	}
	
	public static void main(String args[]) {
		UserType userType;
		Scanner reader = new Scanner(System.in);
		System.out.println("Admin: (Type 1)");
		System.out.println("Customer (Type 2)");
		int userInput = reader.nextInt();
		//reader.close();
		
		if (userInput == 1){
			userType = UserType.Admin;
			System.out.println("Check vacancy of a flight: (Type 1)");
			System.out.println("Search for a client: (Type 2)");
		}
		else if (userInput == 2){
			Customer currentCustomer = null;
			userType = UserType.Customer;
			Scanner read = new Scanner(System.in);
			System.out.println("First name: ");
			String userInput1 = read.nextLine();
			for(Customer check1 : customers){
				if(check1.getFirstName().equals(userInput1)){
					currentCustomer = check1;
					break;
				}
			}
			if(currentCustomer == null){
				System.out.println("No user found");
				return;
			}
			System.out.println("First name: " + currentCustomer.getFirstName());
			System.out.println("Last name: " + currentCustomer.getLastName());
			System.out.println("Cell phone: " + currentCustomer.getCellPhone());
			System.out.println("Reference number: " + currentCustomer.getReferenceNum());
			reader.close();
			//System.out.println(obj.getReferenceNum());
			//System.out.println("A" + Customer.reservationLookup());
		}
	}
}
