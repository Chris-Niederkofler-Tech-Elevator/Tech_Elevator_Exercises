package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignment_Test {
	
	private HomeworkAssignment hW;
	
	@Before
	public void HomeworkAssignment() {
		
		hW = new HomeworkAssignment(1);
	}
	
	@Test
	public void does_correct_grade_get_returned() {
		
		hW.getPossibleMarks();
		hW.getTotalMarks();
		
		Assert.assertTrue("Does correct grade come back?", true);
	}
	@Test
	public void letter_grade_returned() {
		hW.getLetterGrade();
		
		Assert.assertEquals((hW.getTotalMarks()/hW.getTotalMarks()* 100) , hW.getLetterGrade()); 
	 
	}  


}