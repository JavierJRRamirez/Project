package com.csci4448.project.controller;

import java.util.ArrayList;
import java.util.List;
import com.csci4448.project.model.Checkout;
import com.csci4448.project.view.CheckoutView;


/**
 * This class has two methods chooseCard that creates card with an
 * assigned id and searchCard is deployed in the CheckoutView class
 * so the user can choose a card from the available list of cards.
 * 
 * @author javierramirez
 *
 */
public class CheckoutController {
	
	private static List<Checkout> myCard;
	
	/**
	 * This adds a list of cards and an associated id
	 * to myCard to use in checkoutView.
	 * @return	List<Checkout>
	 */
	public static List<Checkout> chooseCard(){
		return myCard;
	}
	static {
		myCard = new ArrayList<Checkout>();
		
		myCard.add(new Checkout("Visa", 1));
		myCard.add(new Checkout("Master Card", 2));
		myCard.add(new Checkout("PayPal", 3));
		myCard.add(new Checkout("Apple Pay", 4));
	}
	
	
	/**
	 * Method is called when user enter the option to
	 * choose a card in the CheckoutView class.
	 */
	public static void searchCard(){
		CheckoutView.checkoutCust(myCard);
	}
	

}
