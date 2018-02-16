package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PostalService_3rdClass_Test {	 

private PostalService_3rdClass tc;

	@Before 
	public void setup() {
	    tc = new PostalService_3rdClass();   
	}
	//Confirms has name


	/*Checks if per mile rate is calculated correctly and that calculateRate returns correct
	 * value 
	 */

	@Test
	public void calculates_per_mile_rate_equal_to_or_less_than_two_ounces() {
	    tc.calculateRate(200, 2);
	    Assert.assertEquals("Should calculate per mile rate", .4d, tc.calculateRate(200, 2));
	}
	 
	  
	@Test
	public void calculates_per_mile_rate_equal_to_less_or_than_eight_ounces() {
	    tc.calculateRate(200, 8);
	    Assert.assertEquals("Should calculate per mile rate", .44d, tc.calculateRate(200, 8));
	}
	      
	@Test
	public void calculates_per_mile_rate_equal_to_or_less_than_fifteen_ounces() {
	    tc.calculateRate(200, 15);
	    Assert.assertEquals("Should calculate per mile rate", .48, tc.calculateRate(200, 15));
	}
	  

	@Test
	public void calculates_per_mile_rate_equal_to_or_less_than_forty_eight_ounces() {
	    tc.calculateRate(200, 48);
	    Assert.assertEquals("Should calculate per mile rate", 3d, tc.calculateRate(200, 48));
	}

	   
	@Test
	public void calculates_per_mile_rate_equal_to_or_less_than_one_hundred_twenty_eight_ounces() {
	   tc.calculateRate(200, 128);
	    Assert.assertEquals("Should calculate per mile rate", 3.2d, tc.calculateRate(200, 128));
	}
	 

	@Test
	public void calculates_per_mile_rate_equal_to_or_greater_than_one_hundred_twenty_eight_ounces() {
	    tc.calculateRate(200, 129);
	    Assert.assertEquals("Should calculate per mile rate", 3.4d, tc.calculateRate(200, 129));
	}
	}

 
 