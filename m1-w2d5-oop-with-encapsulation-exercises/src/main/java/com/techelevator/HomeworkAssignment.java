package com.techelevator;

public class HomeworkAssignment {
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getLetterGrade() {
		return letterGrade;
	}
	
	public  HomeworkAssignment(int possibleMarks) {
		 
		
		   if (totalMarks >= 90)
		      System.out.println("A");
		   else if (totalMarks >= 80) 
		      System.out.println("B");
		   else if (totalMarks >= 70) 
		     System.out.println("C");
		   else if (totalMarks >= 60)
		      System.out.println("D");
		   else 
		     System.out.println("F");
		  
	}
}
		 
		 
//			 if((totalMarks / possibleMarks) >= 90) {
//				 return 'A';
//			 }else if((totalMarks / possibleMarks) >= 80 && (totalMarks / possibleMarks) <= 89){
//				 return "B";
//			 }else if((totalMarks / possibleMarks) >= 70 && (totalMarks / possibleMarks) <= 79) {
//				 return "C";
//			 }else if((totalMarks / possibleMarks) >= 60 && (totalMarks / possibleMarks) <= 69) {
//				 return "D";
//			 }else 
//				 return "F";
//			 }
//			 
//			
//		}
	
	
	


