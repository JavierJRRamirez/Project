package com.csci4448.project.model;

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
