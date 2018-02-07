package com.techelevator;

public class KataRomanNumerals {
	
	private int number;
	public KataRomanNumerals(int number)
	{
		if(number > 3000) throw new IllegalArgumentException("RomanNumber only supports numbers up to 3000");
		this.number = number;}
	//Tells that Roman numbers only go up to 3000 because they couldn't count higher
	
	
	public KataRomanNumerals(String number) {
	 
	 this(Integer.parseInt(number));   
	}
	
	//Setting the value equivalents of numerical to Roman:
		public String toString() { 
		String result = "";
		 
		int thousands = this.number / 1000; 
		result += times(thousands, "M");
		
		int hundreds = this.number / 100 % 10;  
		result += times(hundreds, "C", "D", "M");
		
		int tens = this.number / 10 % 10;
		result += times(tens, "X", "L", "C"); 
		
		int ones = this.number % 10;   
		result += times(ones, "I", "V", "X");
		
		
		return result;
	}

	private String times(int number, String rNumeral) {
		
		String result = "";
		for(int i = 0; i < number; i++) { 
			result += rNumeral;
		} 
		return result;
		
	}
	private String times(int number, String onesChar, String fivesChar, String tensChar) {
		
		return tensChar;
	}
}  
 

