package com.techelevator.calculator;

public class Calculator {

	//
	// Write code here
	//
	private int currentValue;

	public int getCurrentValue() { 
		return currentValue;
	}
	public int add(int addend) {
		return this.currentValue += addend;
	}
	
	
	public int multiply(int multiplier) {
		return this.currentValue *= multiplier;
	
}
	public int subtract(int subtrahend) {
		return this.currentValue -= subtrahend;
		
	}
	public int power(int exponent) {
		currentValue = (int) Math.pow((double)currentValue, (double)exponent);
		return currentValue;
		
	}
	public void reset() {
		currentValue = 0;
}
}
	

