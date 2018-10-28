package com.csci4448.project.model;
import java.util.Scanner;
import java.util.*;

public class Customer {
	private String firstName;
	private String lastName;
	private String cellPhone;
	private String referenceNum;
	
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
