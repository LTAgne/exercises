package com.techelevator;

public class HomeworkAssignment {
	//constants 
	
	// instance variables
	private int totalMarks; 
	private int possibleMarks; 
	private String submitterName;
	
	// constructors
	public HomeworkAssignment(int possibleMarks){
		this.possibleMarks = possibleMarks;
	}
	
	// methods 
	
	
	//derived 
	public String getLetterGrade(){             
		double grade = (double)totalMarks/possibleMarks;
		
		if (grade >= .90){ 
			return "A";}
		else if (grade <= .89 && grade >= .80){
			return "B";}
		else if (grade <= .79 && grade >= .70){
			return "C";}
		else if (grade <= .69 && grade >= .60){
			return "D";}
		else {
			return "F";
		}
	}
		
	
	//auto getters setters below 
	public int getTotalMarks() {                             //getter total mark 
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {               //setter totalmark 
		this.totalMarks = totalMarks;
	}
	public String getSubmitterName() {                            //getter submitter name 
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {         //setter submitter name 
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() {                         //getter possible mark 
		return possibleMarks;
	} 

}
