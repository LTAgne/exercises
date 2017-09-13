package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {

	HomeworkAssignment sut;
	
	@Before
	public void setUp() throws Exception {
		// @Before becomes part of the arrange that every method will use
		sut = new HomeworkAssignment(100);  
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLetterGradeAHigh() {
		// Arrange - 1st Step 
		sut.setTotalMarks(100);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("A", grade);  // what we expect is first and what we actually got is second 
	}
	
	@Test
	public void testLetterGradeALow() {
		// Arrange - 1st Step 
		sut.setTotalMarks(90);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("A", grade);  // what we expect is first and what we actually got is second 
	}
	
	@Test
	public void testLetterGradeBHigh() {
		// Arrange - 1st Step 
		sut.setTotalMarks(89);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("B", grade);  // what we expect is first and what we actually got is second 
	}
	
	@Test
	public void testLetterGradeBLow() {
		// Arrange - 1st Step 
		sut.setTotalMarks(80);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("B", grade);  // what we expect is first and what we actually got is second 
	}
	
	@Test
	public void testLetterGradeCHigh() {
		// Arrange - 1st Step 
		sut.setTotalMarks(79);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("C", grade);  // what we expect is first and what we actually got is second 
	}
	
	@Test
	public void testLetterGradeCLow() {
		// Arrange - 1st Step 
		sut.setTotalMarks(70);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("C", grade);  // what we expect is first and what we actually got is second 
	}
	
	@Test
	public void testLetterGradeDHigh() {
		// Arrange - 1st Step 
		sut.setTotalMarks(69);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("D", grade);  // what we expect is first and what we actually got is second 
	}
	
	@Test
	public void testLetterGradeDLow() {
		// Arrange - 1st Step 
		sut.setTotalMarks(60);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("D", grade);  // what we expect is first and what we actually got is second 
	}
	
	@Test
	public void testLetterGradeFHigh() {
		// Arrange - 1st Step 
		sut.setTotalMarks(59);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("F", grade);  // what we expect is first and what we actually got is second 
	}
	
	@Test
	public void testLetterGradeFLow() {
		// Arrange - 1st Step 
		sut.setTotalMarks(10);
		
		// Act - 2nd Step
		String grade = sut.getLetterGrade(); 
		
		// Assert - 3rd Step  
		assertEquals("F", grade);  // what we expect is first and what we actually got is second 
	}
}
