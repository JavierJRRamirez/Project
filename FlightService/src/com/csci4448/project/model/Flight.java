package com.csci4448.project.model;

/**
 * This class creates getter and setter for the variables in Flight and has a helper function
 * Flight that holds information for a flight that is used in the FlightController class.
 * @author javierramirez
 *
 */
public class Flight {
	public  String date;
	public String startTime;
	public String endTime;
	public int duration;
	public String flightNum;
	public int seatsAvailable;
	public int seatsTaken;
	private double cost;
	public String info;
	public int id;
	
	
	/**
	 * This is a helper function that create appropriate variables for flights and 
	 * give each an id so the user can choose from the available flights in the FlightController class.
	 * @param startTime	Is the start time for a flight.
	 * @param endTime	Is the end time for a flight.
	 * @param duration	Anticipated time the flight will takes off and arrive to the destination.
	 * @param seatsAvailable	The amount of seats available on a flight.
	 * @param seatsTaken	The seats that are taken on a particular flight.
	 * @param flightNum	The flight number for a flight.
	 * @param cost	The cost for a flight.
	 * @param id	The id associated with a flight so the user can choose a flight with the assigned information.
	 */
	public Flight(String startTime, String endTime, int duration, int seatsAvailable, int seatsTaken, String flightNum, double cost, int id) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.duration = duration;
		this.seatsAvailable = seatsAvailable;
		this.seatsTaken = seatsTaken;
		this.flightNum = flightNum;
		this.cost = cost;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeatsTaken() {
		return seatsTaken;
	}
	public void setSeatsTaken(int seatsTaken) {
		this.seatsTaken = seatsTaken;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

}
