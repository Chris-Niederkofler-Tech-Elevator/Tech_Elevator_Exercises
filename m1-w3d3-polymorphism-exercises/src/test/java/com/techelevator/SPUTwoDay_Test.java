package com.techelevator;

import org.junit.Before;
import org.junit.Test; 

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SPUTwoDay_Test { 

private SPUTwoDay ups2;

@Before
public void setUp() {
	ups2 = new SPUTwoDay();
}
@Test
public void does_two_day_provide_correct_shipping_cost_for_weight() {
	ups2.calculateRate(100, 32);
	
	Assert.assertEquals("Is the correct price attained", 160d, ups2.calculateRate(100, 32));
}

}
	        