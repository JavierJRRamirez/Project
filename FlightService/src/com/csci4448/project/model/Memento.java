package com.csci4448.project.model;

/**
 * This class has the state of the object that is going to be restored.
 * @author javierramirez
 *
 */
public class Memento {
	private String flightState;
	
	public Memento(String flightState){
		this.flightState = flightState;
	}
	public String getState() {
		return flightState;
	}
}
