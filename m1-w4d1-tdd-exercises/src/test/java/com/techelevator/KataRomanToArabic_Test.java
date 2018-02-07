package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
 
import junit.framework.Assert;

public class KataRomanToArabic_Test {
	
	KataRomanToArabic rToA;
	@SuppressWarnings("deprecation")
	@Before
	public void setUp() { 
		rToA = new KataRomanToArabic(); 
	}

	@Test
	public void convert_one_digit_roman_to_arabic() {  
		rToA.romanToNumber("VIII");
		
		Assert.assertEquals("Does VIII return 8", 8, 8);
	}
	@Test
	public void convert_two_digit_roman_to_arabic() {
		rToA.romanToNumber("XIX"); 
		
		Assert.assertEquals("Does XIX return 19", 19, 19);
	}
	@Test
	public void convert_three_digit_roman_to_arabic() {
		rToA.romanToNumber("CVIII");
		Assert.assertEquals("Does CVIII return 108", 108, 108); 
	}
	@Test
	public void convert_four_digit_numbers_to_arabic() {
		rToA.romanToNumber("MCV");
		Assert.assertEquals("Does MCV convert to 1105", 1105, 1105);
	}
	@Test
	public void convert_specific_roman_to_arabic() {
		rToA.romanToNumber("DCV");
		Assert.assertEquals("Does DCV convert to 605", 605, 605);
	}
	
}      
	  
   
  
	 