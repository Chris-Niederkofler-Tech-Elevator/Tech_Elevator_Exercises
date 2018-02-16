package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class PostalService_Test { 

private PostalService fc;  
  
@Before
public void setup() {
    fc = new PostalService();  
}
//Confirms has name


/*Checks if per mile rate is calculated correctly and that calculateRate returns correct
 * value 
 */

@Test
public void calculates_per_mile_rate_equal_to_or_less_than_two_ounces() {
    fc.calculateRate(200, 2);
    Assert.assertEquals("Should calculate per mile rate", 7d, fc.calculateRate(200, 2));
}
 
  
@Test
public void calculates_per_mile_rate_equal_to_less_or_than_eight_ounces() {
    fc.calculateRate(200, 8);
    Assert.assertEquals("Should calculate per mile rate", 8d, fc.calculateRate(200, 8));
}
     
@Test
public void calculates_per_mile_rate_equal_to_or_less_than_fifteen_ounces() {
    fc.calculateRate(200, 15);
    Assert.assertEquals("Should calculate per mile rate", 9.4, fc.calculateRate(200, 15));
}
 

@Test
public void calculates_per_mile_rate_equal_to_or_less_than_forty_eight_ounces() {
    fc.calculateRate(200, 48);
    Assert.assertEquals("Should calculate per mile rate", 39d, fc.calculateRate(200, 48));
}

   
@Test
public void calculates_per_mile_rate_equal_to_or_less_than_one_hundred_twenty_eight_ounces() {
    fc.calculateRate(200, 128);
    Assert.assertEquals("Should calculate per mile rate", 90d, fc.calculateRate(200, 128));
}
 

@Test
public void calculates_per_mile_rate_equal_to_or_greater_than_one_hundred_twenty_eight_ounces() {
    fc.calculateRate(200, 129);
    Assert.assertEquals("Should calculate per mile rate", 100d, fc.calculateRate(200, 129));
}
} 
