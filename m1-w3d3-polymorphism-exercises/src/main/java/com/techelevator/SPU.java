package com.techelevator;

public class SPU implements DeliveryDriver{

	
	private double weightLbs;
	private double distanceMiles;
	private boolean groundClass;
	private boolean businessClass;
	private boolean nextDay;
	
	@Override
	public Double calculateRate() {
		if(groundClass) {
			return((weightLbs * .0050) * distanceMiles);}
		else if(businessClass) {
			return((weightLbs * .05) * distanceMiles);}
		else if(nextDay) {
			return((weightLbs * .075) * distanceMiles);
		}
		return null;
	}

	@Override
	public double getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
