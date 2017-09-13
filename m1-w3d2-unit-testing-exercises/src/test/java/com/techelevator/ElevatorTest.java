package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	
	
	//	unintended side effects when calling methods 
	// moving between floors when the doors are open 
	// going up past the ceiling
	// if the doors are open you shouldn't be able to move
	// find the edge cases - 
	// test for constructors to make sure everything is initialized 
	
	Elevator sut;  
	
	@Before
	public void setUp() throws Exception { 
		sut = new Elevator(2, 10); //(int shaftNumber, int totalNumberOfFloors)
		
	}
	

	@Test
	public void testGoingUp() {
		sut.goUp(3);
		assertEquals(3, sut.getCurrentLevel());
	}

	@Test
	public void testGoingUpToFar() {
		sut.goUp(11);
		assertEquals(1, sut.getCurrentLevel());
	}
	
	@Test
	public void testGoingDown() {
		int currentLevel = 10;
		sut.goDown(1);
		assertEquals(1, sut.getCurrentLevel());
	}
	
	@Test
	public void testGoingDownWrongInput() {
		sut.goDown(9);
		assertEquals(1, sut.getCurrentLevel());
	}
	
	@Test
	public void testConstructors() {
		assertEquals(2, sut.getShaftNumber());
		assertEquals(10, sut.getNumberOfLevels());
		assertEquals(1, sut.getCurrentLevel());
	}
	
	@Test
	public void testMovingWithDoorsOpen() {
		sut.openDoor();
		
		sut.goUp(4);
		assertEquals(1, sut.getCurrentLevel());
		
	}
	
}
