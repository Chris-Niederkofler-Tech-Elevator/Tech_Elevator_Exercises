package com.techelevator.dog;

public class Dog {

	//
	// Write code here
	//
	private boolean sleeping;

	public boolean isSleeping() {
		return sleeping;
	}

		public String makeSound() {
		if(this.isSleeping() == true) {
			return "Zzzzz...";
		}else {
			return "Woof!";
		}
	}
	public void sleep() {
		sleeping = true;
	}
	public void wakeUp() {
		sleeping = false;
	}
}
