package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

	/* Check if on 
	 * Check if Off
	 * Turn on 
	 * turn off
	 * Raise Volume
	 * Lower Volume 
	 * Change Channel
	 * Get Current Channel
	 * Get Current Volume
	 */
	private Television tv;
	
	@Before
	public void setup() {
		tv = new Television();
	}
	
	@Test
	public void turn_tv_on() { 
		//Arrange
		//Act
		//Assert
		tv.TurnOn();
		Assert.assertTrue("TV is Off", tv.IsOn());
	}
	@Test
	public void turn_tv_off() {
		//Arrange
		tv.TurnOn();  
		//Act
		tv.TurnOff();
		//Assert
		Assert.assertFalse("TV is not off", tv.IsOn());
	}
	@Test
	public void change_channel_to_10() {
		//Arrange
		tv.TurnOn();
		//Act
		tv.ChangeChannel(10);
		//Assert
		Assert.assertEquals("Channel in not 10", 10, tv.getSelectedChannel());
	}
	@Test
	public void try_to_change_channel_when_tv_is_off() {
		//Arrange
		//Act
		tv.ChangeChannel(11);
		Assert.assertEquals("Channel changed whet it should not have been", 3, tv.getSelectedChannel());
	}
	@Test
	public void are_their_boundaries_on_volume() {
		//Arrange
		tv.TurnOn();
		//Act  
		tv.RaiseVolume();
		//Assert
		Assert.assertEquals("Try and Raise Volume to 11", 3 , tv.getCurrentVolume());
	}
	@Test
	public void does_volume_reset_when_turning_tv_on() {
		//Arrange
		tv.TurnOn();
		//Act
		tv.getCurrentVolume();
		//Arrange
		Assert.assertEquals("Turn on Tv and check current volume", 2 , tv.getCurrentVolume());
	} 
	@Test
	public void what_is_the_lower_boundary_of_volume() {
		//Arrange
		tv.TurnOn();
		//Act 
		tv.LowerVolume();
		//Assert
		Assert.assertEquals("Try and Lower Volume below zero", 1, tv.getCurrentVolume());
		} 
}  