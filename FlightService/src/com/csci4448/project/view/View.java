package com.csci4448.project.view;
import com.csci4448.project.controller.CustomerController;
import com.csci4448.project.controller.PathFinder;
import com.csci4448.project.controller.RandomGenerator;
import com.csci4448.project.model.Customer;
import com.csci4448.project.model.Flight;

import java.io.*;
import java.util.*;

public class View {
	
	enum UserType {
		Admin, Customer;
	}
	
	public static void Start(){
		System.out.println("Admin: (Type 1)");
		System.out.println("Customer (Type 2)");
	}
	
	public static void infoRecieved(){
		UserType userType;
		Scanner reader = new Scanner(System.in);
		Start();
		
		int userInput = reader.nextInt();
		if (userInput == 1){
			userType = UserType.Admin;
			AdminView.adminStart();
		}
		
		else if (userInput == 2){
			userType = UserType.Customer;
			Scanner read = new Scanner(System.in);
			System.out.println("First name: ");
			String userInput1 = read.nextLine();
			Customer currentCustomer = CustomerController.checkCustomer(userInput1);
			if(currentCustomer == null){
				return;
			}
			
			System.out.println("First name: " + currentCustomer.getFirstName());
			System.out.println("Last name: " + currentCustomer.getLastName());
			System.out.println("Cell phone: " + currentCustomer.getCellPhone());
			List<Integer> LInt = new ArrayList<>();
			for(int i = 0; i < 1; i++){
				LInt.add(RandomGenerator.getRandomNumber(10).getMainRand());
				}
			for(int i : LInt){
				System.out.print(i);
			}
			System.out.println("Reference number: " + currentCustomer.getReferenceNum());
			
			PathFinder.searchFlight();
			
			reader.close();
		}
	}
}
