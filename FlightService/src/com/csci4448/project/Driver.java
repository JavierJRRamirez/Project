package com.csci4448.project;

import com.csci4448.project.controller.CustomerController;
import com.csci4448.project.controller.FlightController;
import com.csci4448.project.controller.RandomGenerator;

public class Driver {
	public static void main(String args[]) {
		CustomerController.runAllDay();
		//FlightController.flightRun();
		RandomGenerator.RandomMethod();
	}
}
