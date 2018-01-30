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
		double score = ((double)totalMarks / (double)possibleMarks * 100);
		if (score >= 90) 
			   return "A";
		       else if (score >= 80)  
		     return "B";
		   else if (score >= 70) 
		     return "C";
		   else if (score >= 60) 
		      return "D";
		      return "F";
		 
	
	}
	public  HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
		  
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
	
	
	


