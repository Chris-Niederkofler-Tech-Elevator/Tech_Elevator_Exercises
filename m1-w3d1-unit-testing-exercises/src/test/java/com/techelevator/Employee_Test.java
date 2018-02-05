package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Employee_Test {
	
	private Employee salary;
	
	@Before
	public void Employee() {
		salary = new Employee(1234	,"Chris","Needles", 20000);
	
	}
	
	
	@Test
	public void is_annual_salary_correct_after_raise() {
		salary.getAnnualSalary();
		salary.RaiseSalary(10);
		
		Assert.assertEquals("Raise salary by 10 percent", 22000, salary.getAnnualSalary(), 0);
		
	}
}  
	 
		   
	 
   



   

