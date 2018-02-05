package com.techelevator;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;



public class Airplane_Test { 
 
	private Airplane plane;
	
	@Before 
	public void Airplane() {
		plane = new Airplane(20, 20);
	}
	@Test
	public void booked_first_class_seats() {
		plane.getAvailableFirstClassSeats();
		plane.Reserve(true, 10);
		Assert.assertTrue("First Class Seats are available", true);
	}
	@Test
	public void no_first_class_seats_available() {
		plane.getAvailableFirstClassSeats();
		plane.Reserve(true, 21);
		Assert.assertFalse("No First Class Seats Available", false);
	}
	@Test 
	public void booking_coach_seats() {
		plane.getAvailableCoachSeats();
		plane.Reserve(false, 10);
		Assert.assertTrue("Coach seats available", true);
	}
	@Test
	public void no_coach_seats_available() {
		plane.getAvailableCoachSeats();
		plane.Reserve(false, 21);
		Assert.assertFalse("Sorry your plane is fully booked", false);
	}
	@Test
	public void count_after_booking_first_class() {
		plane.getAvailableFirstClassSeats();
		plane.Reserve(true, 5);
		Assert.assertEquals("Available First Class Seats", 5, plane.getAvailableFirstClassSeats());
	}
	 @Test
	 public void count_after_booking_coach_seats() {
		 plane.getAvailableCoachSeats();
		 plane.Reserve(false, 5); 
;
		 Assert.assertEquals("Available coach seats", 15, plane.getAvailableCoachSeats());
	 }
	  
		  
	 
	
	

	} 
	
	
 

