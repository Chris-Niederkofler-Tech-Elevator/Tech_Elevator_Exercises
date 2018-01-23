package com.techelevator;
import java.util.Scanner;
/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//prompt user to make an input of length//
		
		System.out.println("Please enter a length.");
		
		String input = in.nextLine();
		
		int length = Integer.parseInt(input);
		
		
		System.out.println("Is the length in (m)eters or (f)eet?");
		
		String inputUnits = in.nextLine();
		
		String m = inputUnits;
		//declare meter variable and m to f calc//
		int mToF = (int)(length * 0.3048);
		//declaring foot variable and f to m calc//
		String f = inputUnits;
		int fToM = (int)(length * 3.2808399);
		
		if(m.equals("m")) {
			System.out.println(length + "m is " + mToF + "f");
			
		}
		if(f.equals("f")) {
			System.out.println(length + "f is " + fToM + "m");
			
			
			
		}
		
		
		
			
		}
		
		
		
	
		

	}


