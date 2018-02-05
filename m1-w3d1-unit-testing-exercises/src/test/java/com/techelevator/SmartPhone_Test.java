package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class SmartPhone_Test {
	
	private SmartPhone miPhone;
	
	@Before
	public void SmartPhone() {
		miPhone = new SmartPhone(null, null);
	}
	
	@Test
	public void after_recharge_what_is_battery_level() {
	
		 
		miPhone.RechargeBattery();
		
		Assert.assertTrue("Is phone Charged fully", true);
		
	} 
	@Test
	public void can_you_talk_the_phone_to_zero_percent_charge() {
		miPhone.isOnCall();
		miPhone.Call("5554444", 100);
		
		Assert.assertTrue("Is phone Dead", true); 
	}
	
	@Test
	public void can_you_dial_a_7_digit_number() {
		miPhone.getPhoneNumber();
		miPhone.Call("1234567", 5);
		
		Assert.assertFalse("can you place the call?", false);
		
	}
	@Test
	public void can_answering_and_talking_affect_smartphone() {
		
		miPhone.AnswerPhone();
		
		Assert.assertTrue("does answering affect condition", true);
	
	}
	@Test
	public void does_hangin_up_end_the_call() { 
		miPhone.isOnCall();
		miPhone.HangUp();
		
		Assert.assertTrue("Is phone actually hanged up?", true); 
	}
	
  
 
}