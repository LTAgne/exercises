package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	// find edge cases
	// test for derived things - getFullName 
	// check that salary calculation works 
	
	Employee sut; 
	
	@Before
	public void setUp() throws Exception {
		sut = new Employee(123456, "Lauren", "Agne", 1000);
	}

	@Test
	public void testGetFullName() {
		
		String result = sut.FullName(); 
		
		assertEquals("Agne, Lauren", result);
	}
	
	@Test
	public void testRaiseSalary() {
		
		sut.raiseSalary(25);
		
		assertEquals(1250 ,sut.getAnnualSalary(), 0.01);
	}
	
	@Test
	public void testRaiseSalaryNoRaise() {
		
		sut.raiseSalary(0);
		
		assertEquals(1000 ,sut.getAnnualSalary(), 0.01);
	}
	
	
}
