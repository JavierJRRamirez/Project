package com.csci4448.project.view;
import com.csci4448.project.model.Customer;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class CustomerInfo {
	enum UserType {
		Admin, Customer;
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
				userType = UserType.Customer;
				Customer obj = new Customer();
				System.out.println(obj.getFirstName());				
				System.out.println(obj.getLastName());
				System.out.println(obj.getCellPhone());
				reader.close();
				System.out.println(obj.getReferenceNum());
				//System.out.println("A" + Customer.reservationLookup());
		}
	}
}
