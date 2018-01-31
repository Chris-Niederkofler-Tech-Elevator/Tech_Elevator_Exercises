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
	public void count_of_available_first_class_seats(){
		//Arrange
		plane.getTotalFirstClassSeats();
		//Assert
		Assert.assertEquals("Is Count for seats accurate", 20, 20);
	} 
	
	}


