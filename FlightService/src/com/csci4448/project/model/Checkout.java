package com.csci4448.project.model;

/**
 * This class creates getters and setters for card and id
 * and has a helper function to associate each card with an id. 
 * @author javierramirez
 *
 */
public class Checkout {
	public String card;
	public int id;
	
	/**
	 * @param card	The first parameter is the name of the card.
	 * @param id	The second parameter is the id associated with the card.
	 */
	public Checkout(String card, int id){
		super();
		this.card = card;
		this.id = id;
	}
	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
