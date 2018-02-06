package com.techelevator;

public class SPU implements DeliveryDriver{

//	public String name "SPU Ground Shipping";
////	public String getName();
//	return name;
//}
	
	@Override
	public Double calculateRate(double distance, double weight) {
		
		
		double groundRate = (weight * 5) * distance; double rate = (groundRate/ 1000);
		return rate;
	}
		
		
	} 
   
	 
 
    
 