package com.techelevator;

public class CarWithTrailer implements Vehicle{
	
	
	@Override
	public Double calculateToll(double distance) {
		double cwTrailerToll = (distance * .02) + 1;
		return cwTrailerToll;

}
	 
} 
    