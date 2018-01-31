package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Employee_Test {
	
	private Employee eS;
	
	@Before
	public void Employee() {
		eS = new Employee(0, null, null, 0);
	}

	@Test
	public void AnnualSalary() {
		//Arrange
		eS.RaiseSalary(1);
		//Assert
		Assert.assertEquals(0, 0);
	}
	}
		
	




 

