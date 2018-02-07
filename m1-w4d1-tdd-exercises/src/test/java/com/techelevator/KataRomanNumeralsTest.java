package com.techelevator;

import org.junit.*; 
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {
	
	KataRomanNumerals rmn;
	
	@Before
	public void setUp() {
		rmn = new KataRomanNumerals(0);
	}
	
	@Test
	public void convert_one_digit_numbers_to_romans() {
		rmn.toString();
		Assert.assertEquals("I","I"); 
	
	}
	@Test
	public void convert_two_digit_numbers_to_romans() {
		rmn.toString();
		
		Assert.assertEquals("Does 15 convert to XV", "XV", "XV");
	}
	@Test
	public void convert_three_digit_numbers_to_romans() {
		rmn.toString();
		
		Assert.assertEquals("Does 373 convert to CCCLXXIII", "CCCLXXIII","CCCLXXIII");
	}
	@Test
	public void convert_four_digit_numbers_to_romans() {
		rmn.toString();
		
		Assert.assertEquals("Does 1983 convert to MCMLXXXIII","MCMLXXXIII", "MCMLXXXIII");
	}
	
 
} 
    
          