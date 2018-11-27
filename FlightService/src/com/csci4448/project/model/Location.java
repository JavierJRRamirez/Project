package com.csci4448.project.model;

/**
 * This class creates getters and setters for variables used in the PathFinder class and 
 * has a helper function to associate a city with an id.
 * @author javierramirez
 *
 */
public class Location {
	public String name;
	public int id;
	
	/**
	 * This is a helper function for the PathFinder class to associate a city with an id.
	 * @param name Is the city the user can choose from.
	 * @param id	Is the id associated with a city.
	 */
	public Location(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
