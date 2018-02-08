 package com.techelevator;
import java.util.*;
public class KataRomanToArabic{
	int value(char r) {
		//returns the value of roman symbol
		if(r == 'I')
			return 1;
		if(r == 'V')
			return 5; 
		if(r == 'X')
			return 10;  
		if(r == 'L')
			return 50;
		if(r == 'C')
			return 100; 
		if(r == 'D')
			return 500; 
		if(r == 'M')
			return 1000;
		return 0; 
		
		
	}
	//Find Arabic value of given Roman
	 int romanToNumber(String str) {
		int rToNum = 0;
		for( int i = 0; i < str.length(); i++) {
			//get value for char
			int r1 = value(str.charAt(i));
			//get value for char r [i+1]
			if(i+1 < str.length()) {
				int r2 = value(str.charAt(i+1));
				//compare both values
				if(r1 >= r2) {
					//if current roman is greater or equal to next
					rToNum = rToNum + r1;
				}
				else {
					rToNum = rToNum + r2 - r1;
					i++;//Value of current roman is less than the next roman
				}
					
			}  
			else {
				rToNum = rToNum + r1;    
				i++;
			} 
		}
		return rToNum;
	}
}
//	 //Driver Method
//	 public static void main(String args[]) {
//		 KataRomanToArabic rToA = new KataRomanToArabic();
//		 //Check if Inputs are Valid
//		 String str = "MCMIV";
//		 System.out.println("Arabic form of Roman Numeral" + " is " + rToA.romanToNumber(str));
//	 }
//	 }
//	  
// 
	 
 
  


	
	
		
	
		 
		 
	

	
	 
		
	
	
	 


