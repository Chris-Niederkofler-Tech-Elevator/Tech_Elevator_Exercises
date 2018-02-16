package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SPU_Test { 

private SPU ups;

@Before
public void setUp() {
	ups = new SPU();
	
}
@Test
public void does_ground_class_provide_correct_shipping_cost_for_weight() {
	ups.calculateRate(100, 32);
	
	Assert.assertEquals("Is the correct price attained", 160d, ups.calculateRate(100, 32));
}
}    