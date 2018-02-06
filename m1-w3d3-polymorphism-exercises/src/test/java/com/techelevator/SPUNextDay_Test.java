package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class SPUNextDay_Test { 

private SPUNextDay upsNext;

@Before
public void setUp() {
	upsNext = new SPUNextDay();
}
@Test
public void does_two_day_provide_correct_shipping_cost_for_weight() {
	upsNext.calculateRate(100, 32);
		
	Assert.assertEquals("Is the correct price attained", 240d, upsNext.calculateRate(100, 32));
}

}
		        


 