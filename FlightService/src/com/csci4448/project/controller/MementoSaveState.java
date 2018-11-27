package com.csci4448.project.controller;

import java.util.ArrayList;
import java.util.List;

import com.csci4448.project.model.Memento;

/**
 * This class is used to restore the object state from Memento.
 * @author javierramirez
 *
 */
public class MementoSaveState {
	private List<Memento> listOfMemento = new ArrayList<Memento>();
	
	/**
	 * This method takes a state of an object to be restored and adds it to the 
	 * list listOfMemento.
	 * @param flightState	is the state of object to be restored.
	 */
	public void add(Memento flightState){
		listOfMemento.add(0, flightState);
	}
	/**
	 * This method gets an index to be restored.
	 * @param place is the index to retrieve the previous state.
	 * @return Memento
	 */
	public Memento get(int place){ 
		return listOfMemento.get(place);
	}
}
