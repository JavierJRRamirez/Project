package com.csci4448.project.model;

public class Checkout {
	String card;
	int id;
	
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
