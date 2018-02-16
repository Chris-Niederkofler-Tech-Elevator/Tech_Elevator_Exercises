package com.techelevator;

import java.util.Scanner;

public class MainDistributionHub{
	public static void main(String [] args){
	
	Scanner in = new Scanner(System.in);
	
	
	//User input weight of package
	System.out.println("Enter weight of package:");
	String weightInput = in.nextLine(); 
	int weight = Integer.parseInt(weightInput);
	 
	//Pound or Ounce input
	System.out.println("(P)ounds or (O)unces?");
	String lbOrOzInput = in.nextLine();
	if(lbOrOzInput.toUpperCase().equals("p")) {
		weight = (weight * 16);
	}
	
	//user distance input
	System.out.println("What distance is package travelling?");
	String distanceInput = in.nextLine();
	int distance = Integer.parseInt(distanceInput);
	
	DeliveryDriver[] deliveryDriver = new DeliveryDriver[] {new PostalService(), new PostalService_2ndClass(), new PostalService_3rdClass(), new FedEx(), new SPU(),
			new SPUTwoDay(), new SPUNextDay()};
	
	for(DeliveryDriver company: deliveryDriver) {
		System.out.println(" Delivery Method: " + company.getClass() + " / Cost $ " + company.calculateRate(distance, weight));
		
		
	}
	
	
	 
	
	
	
}	

}
