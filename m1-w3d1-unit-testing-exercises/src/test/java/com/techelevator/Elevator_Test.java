package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Elevator_Test {

	private Elevator darthVator;
	
	@Before
	public void Elevator() { 
		darthVator = new Elevator(1, 10);
	}
	
	@Test
	public void can_DarthVator_go_up_to_eleven() {
		darthVator.CloseDoor();
		darthVator.goUp(11);
		
		Assert.assertTrue("DarthVator cannot go up past the number of floors", true);
	}
	@Test
	public void can_DarthVator_move_when_door_open() {
		darthVator.OpenDoor();
		darthVator.goUp(3);
		
		Assert.assertFalse("can it move with door open", false);
		
	} 
	@Test
	public void can_Darth_move_when_door_is_open() {
		darthVator.isDoorOpen(); 
		darthVator.goDown(5);
		
		Assert.assertEquals(darthVator.getCurrentLevel(), 1);
		
		   
	}  
	    
	
	   
	 
	}  


  

 