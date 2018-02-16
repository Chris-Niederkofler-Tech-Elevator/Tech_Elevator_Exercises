package com.techelevator;

public class TruckToll implements Vehicle{

	@Override
	public Double calculateToll(double distance) {
		
		double perMileRate = 0;
		double axels = 0;
		if(axels == 4) perMileRate = 40;
		else if(axels == 6) perMileRate = 45;
		else if(axels >= 8) perMileRate = 48;
		
		double rate = (perMileRate * distance) / 100;
		return rate;
	}
	

}
  