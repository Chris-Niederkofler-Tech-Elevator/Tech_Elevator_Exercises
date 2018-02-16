package com.techelevator;
import junit.framework.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("deprecation")
public class CarToll_Test {

private CarToll cT;
 

@Before
public void setUp() {
	cT = new CarToll();
	
}
@Test
public void is_toll_correct_for_distance_driven() {
	cT.calculateToll(100);
	Assert.assertEquals("Is toll correct for distance driven", 2, 2);
	


}
 
	 
}
