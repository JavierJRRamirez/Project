package com.csci4448.project.controller;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;

public class Flight {
	public LocalDate date;
	public LocalDateTime startTime;
	public LocalDateTime endTime;
	public int duration;
	public int flightNum;
	private float cost;
	private static List<Flight> flights;
	
	static {
		Flight flight = new Flight();
		flights.add(flight);
		System.out.println("242");
	}
	
	public static List<Flight> pathFinder(LocalDate date, LocalDateTime startTime, LocalDateTime endTime, int duration, float cost){
		
	}
	
}
