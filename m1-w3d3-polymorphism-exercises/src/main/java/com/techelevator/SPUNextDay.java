package com.techelevator;

public class SPUNextDay implements DeliveryDriver{
	
	
	
	
	
@Override
public Double calculateRate(double distance, double weight) {
	
	
	double nextDayRate = (weight * 75) * distance; double rate = (nextDayRate/ 1000);
	return rate;
}
	
	
} 

 
  