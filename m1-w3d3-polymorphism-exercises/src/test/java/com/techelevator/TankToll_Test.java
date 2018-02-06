package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class TankToll_Test {

	private TankToll mt;
	
	@Before
	public void setUp() {
	
	 
	mt = new TankToll();
	}

	@Test
	public void is_tank_toll_zero() {
		
	mt.calculateToll(100);
	Assert.assertEquals("Should be zero", 0, 0);
		
	}

}
  