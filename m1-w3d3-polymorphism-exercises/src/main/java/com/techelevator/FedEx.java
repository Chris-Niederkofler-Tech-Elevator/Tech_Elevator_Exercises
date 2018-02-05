package com.techelevator;

public class FedEx implements DeliveryDriver {

	
	private double flatRate = 20;
	private double distanceMiles;
	private double weightLbs;
	
	@Override
	public Double calculateRate() {
		if(distanceMiles > 500 && weightLbs <= 3) {
			return (flatRate + 5);}
		else if (distanceMiles > 500 && weightLbs > 3) {
			return(flatRate + 8);}
		if(weightLbs > 3 && distanceMiles < 500) {
			return(flatRate + 3);}
		else {
			return flatRate;}
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
