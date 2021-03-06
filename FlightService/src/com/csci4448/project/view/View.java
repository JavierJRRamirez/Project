package com.csci4448.project.view;
import com.csci4448.project.controller.CustomerController;
import com.csci4448.project.controller.MementoSaveState;
import com.csci4448.project.controller.PathFinder;
import com.csci4448.project.model.Customer;
import com.csci4448.project.model.MementoState;

import java.util.*;

/**
 * This class contains the main options for the customer to display the customer information
 * if the customer is in the system and after proceeding into the searchFlight in the PathFinder
 * class which goes in FlightView. The option for when selecting the Admin or customer is also available
 * so they go into the appropriate method. This class also implements the Memento design 
 * pattern when the customer enter an unknown user by displaying what they entered previously.
 * @author javierramirez
 *
 */
public class View {
	
	static MementoState mementoPicked = new MementoState();
	static MementoSaveState mementoSave = new MementoSaveState();
	
	enum UserType {
		Admin, Customer;
	}
	
	/**
	 * This method is printing out the option for the user to choose between the 
	 * Admin or Customer.
	 */
	public static void Start(){
		System.out.println("Admin: (Type 1)");
		System.out.println("Customer: (Type 2)");
	}
	
	/**
	 * This method contains the main options for the customer and displays the
	 * information for the customer using the CustomerController class. This method also 
	 * contains the option to choose the admin and go into the AdminView class.
	 */
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
			System.out.println("Enter 'Javier' or 'Kyla' or 'John'");
			System.out.println("First name: ");
			String userInput1 = read.nextLine();
			Customer currentCustomer = CustomerController.checkCustomer(userInput1);
			if(currentCustomer == null){
				mementoPicked.setState(String.valueOf(userInput1));
				mementoSave.add(mementoPicked.saveStateToMemento());
				mementoPicked.getStateFromMemento(mementoSave.get(0));
				System.out.println("Option picked last time: " + mementoPicked.getState());
				System.out.println(" ");
				infoRecieved();
				return;
			}
			
			System.out.println("First name: " + currentCustomer.getFirstName());
			System.out.println("Last name: " + currentCustomer.getLastName());
			System.out.println("Cell phone: " + currentCustomer.getCellPhone());
			System.out.println("Reference number: " + currentCustomer.getReferenceNum());
			
			PathFinder.searchFlight();
			
			reader.close();
		}
		else {
			System.out.println("Choice not possble, enter valid number");
			System.out.println(" ");
			CustomerController.runAllDay();
		}
	}
}
