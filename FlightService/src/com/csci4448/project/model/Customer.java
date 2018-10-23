package com.csci4448.project.model;
import java.util.Scanner;
import java.util.*;

public class Customer {
	private String firstName;
	private String lastName;
	private String cellPhone;
	private int referenceNum;
	
	public String getFirstName() {
		Scanner input = new Scanner(System.in);
		System.out.println("First name: ");
		firstName = input.nextLine();
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Last name: ");
		lastName = input.nextLine();
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCellPhone() {
		Scanner input = new Scanner(System.in);
		System.out.println("Cell Phone: ");
		cellPhone = input.nextLine();
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public int getReferenceNum() {
		System.out.println("A" + Customer.reservationLookup());
		return referenceNum;
	}
	public void setReferenceNum(int referenceNum) {
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
