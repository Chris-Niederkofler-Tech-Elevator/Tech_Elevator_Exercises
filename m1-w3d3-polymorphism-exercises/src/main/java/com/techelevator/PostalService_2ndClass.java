package com.techelevator;

public abstract class PostalService_2ndClass implements DeliveryDriver {
	private boolean secondClass;
	private int weightOunces;
	private int weightLbs;
	private int distanceMiles;
	
	@Override
	public Double calculateRate() {
		while(secondClass) {
			if( weightOunces > 0 && weightOunces <= 2) { 
				return(distanceMiles * .0035);}
				else if(weightOunces > 2 && weightOunces <= 8) {
					return(distanceMiles * .004);}
				else if (weightOunces > 8 && weightOunces <= 15) {
					return(distanceMiles * .0047);}
				else if (weightLbs >= 1 && weightLbs <= 3) {
					return(distanceMiles * .0195);}
				else if (weightLbs > 3 && weightLbs < 9) {
					return(distanceMiles * .045);}
				else if (weightLbs >= 9) {
					return(distanceMiles * .05);
					
			}
			}
		return null;

}
}
