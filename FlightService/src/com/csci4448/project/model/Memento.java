package com.csci4448.project.model;

import com.csci4448.project.controller.MementoController;

public class Memento {
	private String flightState;
	
	public void setState(String flightState){
		this.flightState = flightState;
	}
	public String getState(){
		return flightState;
	}
	public MementoController saveStateToMemento(){
		return new MementoController(flightState);
	}
	public void getStateFromMemento(MementoController memento){
		flightState = memento.getState();
	}
}
