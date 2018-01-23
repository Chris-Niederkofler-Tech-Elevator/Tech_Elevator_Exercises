package com.techelevator;
import java.util.Scanner;
/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Prompt user to enter a temperature//
		System.out.println("Please enter a temperature.");
		
		String input = in.nextLine();
		
		int temperature = Integer.parseInt(input);
		//Ask user to state whether temperature is in (C)elsius or (F)ahrenheit//
		
		System.out.println("Is the temperature in (C)elsius or (F)ahrenheit?");
		
		String tempUnits = in.nextLine();
		
		String c = tempUnits;
		
		//declare the unit celsius and proceed to calculation. //
		
		int cToF = (int)(temperature * 1.8 + 32);
		
		//declare the unit fahrenheit and proceed to calculation.//
		
		String f = tempUnits;
		//temp - 32 is in parentheses due to the order of operations in math//
		
		int fToC = (int)((temperature - 32)/ 1.8);
		
		if(c.equals("c")) {
			System.out.println(temperature + "c is " + cToF + "f");
		}
		if(f.equals("f")) {
			System.out.println(temperature + "f is " + fToC + "c");
		}
		}
	}



