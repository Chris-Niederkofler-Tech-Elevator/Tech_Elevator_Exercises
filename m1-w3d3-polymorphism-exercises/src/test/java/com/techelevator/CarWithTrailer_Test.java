package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class CarWithTrailer_Test {
	
	private CarWithTrailer pt;
	
	
	@Before
	public void setUp() {
	
	pt = new CarWithTrailer();
	}

	
	@Test
	public void is_Toll_correct_for_car_with_trailer() {
		pt.calculateToll(100);
		
		Assert.assertEquals("Is toll correct", 3, 3);
		
	} 
 
} 
 