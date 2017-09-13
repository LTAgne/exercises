package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

	 FruitTree sut;  
	
//	Things to look/test for
//	is the correct result returned when the PickFruit method is called? is it possible to pick more fruit than exists on the fruit tree?
	
	@Before
	public void setUp() throws Exception {
		sut = new FruitTree("Lemon", 10);  
	}

	
	@Test
	public void testPickingFewer() {
		// Arrange - 1st Step, find the edge cases (11, 9)
		
		// Act - 2nd Step
			boolean result = sut.pickFruit(9);	
		// Assert - 3rd Step  
		assertEquals(true, result);
		assertEquals(1,sut.getPiecesOfFruitLeft());
	}

	@Test
	public void testPickingAll() {
		// Arrange - 1st Step, find the edge cases (11, 9)
		
		// Act - 2nd Step
			boolean result = sut.pickFruit(10);	
		// Assert - 3rd Step  
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());
	
	}
	
	@Test
	public void testPickingMore() {
		// Arrange - 1st Step, find the edge cases (11, 9)
		
		// Act - 2nd Step
			boolean result = sut.pickFruit(11);	
		// Assert - 3rd Step  
		assertEquals(false, result);
		assertEquals(10, sut.getPiecesOfFruitLeft());
	
	}
	
	@Test
	public void testPickingAllinParts() {
		// Arrange - 1st Step, find the edge cases (11, 9)
		
		// Act - 2nd Step
			boolean result = sut.pickFruit(5);	
		// Assert - 3rd Step  
		assertEquals(true, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
	
		result = sut.pickFruit(5);	
  
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());
	}

	
	@Test
	public void testPickingMoreinParts() {
		// Arrange - 1st Step, find the edge cases (11, 9)
		
		// Act - 2nd Step
			boolean result = sut.pickFruit(5);	
		// Assert - 3rd Step  
		assertEquals(true, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
	
		result = sut.pickFruit(6);	
  
		assertEquals(false, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
	}


}
