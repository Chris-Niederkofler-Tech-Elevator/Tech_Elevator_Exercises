package com.techelevator;

public class CarToll implements Vehicle {

@Override


public Double calculateToll(double distance) {
	double tollRate = 0;	
	if(distance > 0) {
		tollRate = (distance * .02);
	
	
	}
	return tollRate;
}
}
	
 

		 
		   
	  
	 
	
	


