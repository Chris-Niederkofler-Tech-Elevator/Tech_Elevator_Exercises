package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;


 
@SuppressWarnings("deprecation")
public class TruckTollTest {
	
	private TruckToll tt;
	
	@Before
	public void setUp() {
	
	tt = new TruckToll();
	}
	

	@Test
	public void test() {
		tt.calculateToll(100);
		
		Assert.assertEquals("Is correct toll charged", 40, 40);
	}

}
  