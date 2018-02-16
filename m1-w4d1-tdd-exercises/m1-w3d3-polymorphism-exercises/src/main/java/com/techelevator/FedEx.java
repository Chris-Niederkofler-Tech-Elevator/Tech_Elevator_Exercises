package com.techelevator;

public class FedEx implements DeliveryDriver {
 
	

	
	@Override
	public Double calculateRate(double distance, double weight) {
		
		double flatRate = 20;
		if(distance > 500 && weight <= 48) flatRate = 25;
		else if(distance > 500 && weight > 48) flatRate = 28;
		else if(weight > 48 && distance < 500) flatRate = 23; 
		else flatRate = 20;
		
		double newRate = flatRate;
		return newRate;
		  
		  
	  
 
    
} 

}
