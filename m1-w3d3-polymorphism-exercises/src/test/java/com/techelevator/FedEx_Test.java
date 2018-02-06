package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;



@SuppressWarnings("deprecation")
public class FedEx_Test { 

private FedEx fr;

@Before
public void setUp() {
	fr = new FedEx();
}
@Test
public void calculate_rate_for_distance_more_than_500_weight_less_than_48ounces() {
	fr.calculateRate(550, 40);
	
	Assert.assertEquals("Should calculate flat rate for distance travelled", 25d  , fr.calculateRate(550, 40));
}
@Test
public void calculate_rate_for_distance_more_than_500_weight_more_than_48_ounces() {
	fr.calculateRate(550, 60);
	
	Assert.assertEquals("Is rate correct for package" , 28d, fr.calculateRate(550, 60));
}
@Test
public void calculate_rate_for_weight_more_than_48ounces_distance_less_than_500() {
	fr.calculateRate(450, 60);
	
	Assert.assertEquals("Is rate correct for package", 23d, fr.calculateRate(450, 60));
}
@Test
public void calculate_rate_for_distance_less_than_500_and_less_than_48ounces() {
	fr.calculateRate(400, 32);
	
	Assert.assertEquals("Is rate correct for package", 20d, fr.calculateRate(400, 32));
}
	
   
    
 
}
