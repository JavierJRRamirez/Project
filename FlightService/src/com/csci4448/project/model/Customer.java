package com.csci4448.project.model;
import java.util.*;

/**
 * This class creates getters and setters for all the variable used in 
 * different classes. Also, has a random generator function that is made for the customer.
 * @author javierramirez
 *
 */
public class Customer {
	private String firstName;
	private String lastName;
	private String cellPhone;
	private String referenceNum;
	private String startLoc;
	private String endLoc;
	private String startTime;
	private String endTime;
	private String flightDuration;
	private String flightNumber;
	private float cost;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getStartLoc() {
		return startLoc;
	}
	public void setStartLoc(String startLoc) {
		this.startLoc = startLoc;
	}
	public String getEndLoc() {
		return endLoc;
	}
	public void setEndLoc(String endLoc) {
		this.endLoc = endLoc;
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
	public String getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCellPhone() {

		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getReferenceNum() {
		return referenceNum;
	}
	public void setReferenceNum() {
		String referenceNum = "A" + Customer.reservationLookup();
		this.referenceNum = referenceNum;
	}
	
	/**
	 * This is a random generator function that creates a
	 * reference number for the customer.
	 * @return String 
	 */
	public static String reservationLookup(){
		
		String airLines = "ACFI";
		String airNum = "0123456789";
		String numFlight = "";
		String airAbrev = "";
		
		Random random = new Random();
		int ranLength = 1+random.nextInt(1);
		for(int j = 0; j < ranLength; j++){
			char c = (airLines).charAt(random.nextInt(4));
			airAbrev+=c;
		}
		
		int numLength = 2+random.nextInt(1);
		for(int k = 0; k < numLength; k++){
			char c = (airNum).charAt(random.nextInt(10));
			numFlight+=c;
		}

		return airAbrev + numFlight;
	}
}
