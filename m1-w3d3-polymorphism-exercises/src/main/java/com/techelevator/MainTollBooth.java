package com.techelevator;

import java.util.Scanner;
public class MainTollBooth {
	
	public static void main(String [] args){
		
		Scanner in = new Scanner(System.in);
		
		
		//User input distance travelled
		System.out.println("Enter distance travelled");
		String distanceInput = in.nextLine(); 
		int distance = Integer.parseInt(distanceInput);
		
		//Enter type of vehicle
		System.out.println("(C)ar, (T)ruck, (T)ank or (C)arWithTrailer ?");
		String typeOfVehicle = in.nextLine();
		if(typeOfVehicle.toUpperCase().equals("t")) {
			
		}
		
		Vehicle[] vehicle = new Vehicle[] {new CarToll(), new CarWithTrailer(), new TruckToll(), new TankToll()
		};
		
			for(Vehicle toll: vehicle) {
			System.out.println(" Type of Vehicle: " + toll.getClass() + toll.calculateToll(distance));
			}
	}
}
	
		
	


			
			
		
		
		
		 
		
		
		
		

	

 

