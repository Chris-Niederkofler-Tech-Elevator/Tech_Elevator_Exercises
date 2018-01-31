package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitTree_Test {

	//Things to test for
	//is correct result returned when the PickFruit method is called?
	//is it possible to pick more fruit than exists on the fruit tree?
	private FruitTree ft;
	
	
	@Before
	public void FruitTree() {
		ft = new FruitTree("Apple", 10);
	}
	@Test	 
	public void pickFruit() { 
		ft.PickFruit(4);
			//act 
			//assert
		Assert.assertTrue("If there is fruit to be picked", true);}
	@Test
	public void PickFruit() {
		
		ft.PickFruit(0);
		
		Assert.assertFalse("If there is no fruit to pick", false);
		
	}
		 
		 
	@Test 
	public void pieces_Of_Fruit_Left() {
		//Arrange
		
		//Act
		//Assert
		Assert.assertTrue("If pieces of fruit on tree is > 0", true);
			 
			
			  
	}
}	
		 
	
	  
	
	
	
	 


