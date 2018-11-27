package com.csci4448.project.model;

/**
 * MementoState uses Memento by creating and storing the states in Memento objects.
 * @author javierramirez
 *
 */
public class MementoState {
	private String flightState;
	
	public void setState(String flightState){
		this.flightState = flightState;
	}
	public String getState(){
		return flightState;
	}
	public Memento saveStateToMemento(){
		return new Memento(flightState);
	}
	public void getStateFromMemento(Memento memento){
		flightState = memento.getState();
	}
}
