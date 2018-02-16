package com.techelevator;

public class SPUTwoDay implements DeliveryDriver{
	
	
	
	
	
@Override
public Double calculateRate(double distance, double weight) {
	
	
	double twoDayRate = (weight * 5) * distance; double rate2 = (twoDayRate/ 100);
	return rate2;
}
	
	
}  

  
       