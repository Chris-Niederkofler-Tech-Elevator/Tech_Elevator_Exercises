package com.techelevator;
import java.util.Scanner;
/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//request user input//
		System.out.println("Enter a decimal number please.");
		//user input//
		
		String userInput = in.nextLine();
		int decimalValue = Integer.parseInt(userInput);
		//change over from decimal to binary//
		//i somehow can't figure out how to create the array to enter multiple values//
		//but this operation will take one value and convert to binary
		//my brain hurts//
		String binaryOutput = "";
		while(decimalValue >= 1) {
			if(decimalValue % 2 == 0) {
				binaryOutput = "0" + binaryOutput ;
			}else {
				binaryOutput ="1" + binaryOutput ;
			}
			decimalValue /= 2;
			}
		System.out.println(decimalValue + "in binary it is " + binaryOutput);
		}

	}


