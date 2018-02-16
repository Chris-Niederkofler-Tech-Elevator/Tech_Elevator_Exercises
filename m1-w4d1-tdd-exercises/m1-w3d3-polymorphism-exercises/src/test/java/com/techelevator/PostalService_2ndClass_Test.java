package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
  
@SuppressWarnings("deprecation")
public class PostalService_2ndClass_Test {	

private PostalService_2ndClass sc;

	@Before  
	public void setup() {
	    sc = new PostalService_2ndClass();   
	}
	//Confirms has name


	/*Checks if per mile rate is calculated correctly and that calculateRate returns correct
	 * value 
	 */

	@Test
	public void calculates_per_mile_rate_equal_to_or_less_than_two_ounces() {
	    sc.calculateRate(200, 2);
	    Assert.assertEquals("Should calculate per mile rate", .7d, sc.calculateRate(200, 2));
	}
	 
	 
	@Test
	public void calculates_per_mile_rate_equal_to_less_or_than_eight_ounces() {
	    sc.calculateRate(200, 8);
	    Assert.assertEquals("Should calculate per mile rate", .8d, sc.calculateRate(200, 8));
	}
	     
	@Test
	public void calculates_per_mile_rate_equal_to_or_less_than_fifteen_ounces() {
	    sc.calculateRate(200, 15);
	    Assert.assertEquals("Should calculate per mile rate", .94, sc.calculateRate(200, 15));
	}
	  

	@Test
	public void calculates_per_mile_rate_equal_to_or_less_than_forty_eight_ounces() {
	    sc.calculateRate(200, 48);
	    Assert.assertEquals("Should calculate per mile rate", 3.9d, sc.calculateRate(200, 48));
	}

	   
	@Test
	public void calculates_per_mile_rate_equal_to_or_less_than_one_hundred_twenty_eight_ounces() {
	   sc.calculateRate(200, 128);
	    Assert.assertEquals("Should calculate per mile rate", 9.0d, sc.calculateRate(200, 128));
	}
	 

	@Test
	public void calculates_per_mile_rate_equal_to_or_greater_than_one_hundred_twenty_eight_ounces() {
	    sc.calculateRate(200, 129);
	    Assert.assertEquals("Should calculate per mile rate", 10.0d, sc.calculateRate(200, 129));
	}
	}


 
