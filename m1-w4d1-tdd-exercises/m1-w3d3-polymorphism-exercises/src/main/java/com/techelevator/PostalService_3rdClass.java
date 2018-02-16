package com.techelevator;

public class PostalService_3rdClass implements DeliveryDriver {
	
	
	
//	private boolean thirdClass;
//	private int weightOunces;
//	private int weightLbs;
//	private int distanceMiles; 
//	
//	@Override
//	public Double calculateRate(double distance, double weight) {
//		while(thirdClass) {
//		if( weightOunces > 0 && weightOunces <= 2) { 
//			return(distanceMiles * .002);}
//			else if(weightOunces > 2 && weightOunces <= 8) {
//				return(distanceMiles * .0022);}
//			else if (weightOunces > 8 && weightOunces <= 15) {
//				return(distanceMiles * .0024);}
//			else if (weightLbs >= 1 && weightLbs <= 3) {
//				return(distanceMiles * .015);}
//			else if (weightLbs > 3 && weightLbs < 9) {
//				return(distanceMiles * .016);}
//			else if (weightLbs >= 9) {
//				return(distanceMiles * .017);
//			} 
//		}
//		return null;
//	}
//
//}
	
@Override
public Double calculateRate(double distance, double weight) {
double perMileRate = 0;
if (weight <= 2) perMileRate = 20; 
else if (weight <= 8) perMileRate = 22;
else if (weight <= 15) perMileRate = 24;
else if (weight <= 48) perMileRate = 150;
else if (weight <= 128) perMileRate = 160;
else perMileRate = 170;

    double rate = ((perMileRate * distance) / 10000);
    return rate;	
	 
 
}  
}   
  






