package com.techelevator;

public class Employee {
	//constants 
	
	// instance variables
	private int employeeId;
	private String firstName; 
	private String lastName; 
	private String department; 
	private double annualSalary;
	
	// constructors
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId; 
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.annualSalary = salary; 
	}
	
	// methods 
	public void raiseSalary(double percent){               //changes salary by that percentage
		annualSalary = annualSalary * (1.0 + (percent/100));
	}
	
	//derived attribute below - getter 
	
	public String getFullName(){
		return lastName + ", " + firstName; 
	}
	
	
	//auto getters and setters below
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public double getAnnualSalary() {
		return annualSalary;
	} 
	
	
}
