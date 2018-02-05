package com.techelevator;

public class PostalService implements DeliveryDriver {
	
	private boolean firstClass;
	private boolean secondClass;
	private boolean thirdClass;
	private double weightOunces;
	private double weightLbs;
	private double distanceMiles;
	

	@Override
	public Double calculateRate() {
		while(firstClass) {
		if( weightOunces > 0 && weightOunces <= 2) { 
			return(distanceMiles * .035);}
			else if(weightOunces > 2 && weightOunces <= 8) {
				return(distanceMiles * .040);}
			else if (weightOunces > 8 && weightOunces <= 15) {
				return(distanceMiles * .047);}
			else if (weightLbs >= 1 && weightLbs <= 3) { 
				return(distanceMiles * .195);}
			else if (weightLbs > 3 && weightLbs < 9) {
				return(distanceMiles * .45);}
			else if (weightLbs >= 9) {
				return(distanceMiles * .5);
				
		}
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
