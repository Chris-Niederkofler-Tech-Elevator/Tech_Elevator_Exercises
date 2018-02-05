package com.techelevator;

public abstract class PostalService_3rdClass implements DeliveryDriver {
	
	
	
	private boolean thirdClass;
	private int weightOunces;
	private int weightLbs;
	private int distanceMiles;
	
	@Override
	public Double calculateRate() {
		while(thirdClass) {
		if( weightOunces > 0 && weightOunces <= 2) { 
			return(distanceMiles * .002);}
			else if(weightOunces > 2 && weightOunces <= 8) {
				return(distanceMiles * .0022);}
			else if (weightOunces > 8 && weightOunces <= 15) {
				return(distanceMiles * .0024);}
			else if (weightLbs >= 1 && weightLbs <= 3) {
				return(distanceMiles * .015);}
			else if (weightLbs > 3 && weightLbs < 9) {
				return(distanceMiles * .016);}
			else if (weightLbs >= 9) {
				return(distanceMiles * .017);
			}
		}
		return null;
	}

}
