package com.csci4448.project.view;
import java.util.*;

import com.csci4448.project.controller.CustomerController;
import com.csci4448.project.model.Checkout;

public class CheckoutView {
	enum UserType {
		Visa, MasterCard, Paypal, ApplePay;
	}
	public static void checkoutCust(List<Checkout> allCards){
		Scanner reader = new Scanner(System.in);
		System.out.println("Select payment method: ");
		System.out.println("Cards Available " + "Card Id");
		for(Checkout myCard : allCards){
			System.out.println(myCard.getCard() + "                  " + myCard.getId());
		}
		System.out.println("Enter card Id");
		int userInput = reader.nextInt();
		for(Checkout myCard : allCards){
			if(userInput == myCard.getId()){
				System.out.println("Selected: " + myCard.getCard());
			}
		}
		System.out.println("Agree to pay amount: Yes (Type 1) No (Type 2)");
		int userInput2 = reader.nextInt();
		if(userInput2 == 1){
			System.out.println("Flight Booked!");
		}
		if(userInput2 == 2){
			System.out.println("Flight cancelled :(");
			System.out.println(" ");
			CustomerController.runAllDay();
		}
	}
}
