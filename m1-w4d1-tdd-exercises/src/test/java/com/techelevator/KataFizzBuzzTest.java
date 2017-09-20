package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	KataFizzBuzz sut = new KataFizzBuzz();
	
	@Test
	public void test1(){
		assertEquals("1", sut.fizzBuzz(1));
	}

	@Test
	public void test3(){
		assertEquals("Fizz", sut.fizzBuzz(3));
	}

	@Test
	public void test5(){
		assertEquals("Buzz", sut.fizzBuzz(5));
	}

	@Test
	public void testMultiple3and5(){
		assertEquals("FizzBuzz", sut.fizzBuzz(15));
	}

	@Test
	public void testMoreThan100(){
		assertEquals("", sut.fizzBuzz(150));
	}
	
	@Test
	public void testLessThan1(){
		assertEquals("", sut.fizzBuzz(0));
	}
	
	@Test
	public void testRandomNumber(){
		assertEquals("", sut.fizzBuzz((int)Math.random()*10));
	}
	
	@Test
	public void testContains3(){
		assertEquals("Fizz", sut.fizzBuzz(23));
	}
	
	@Test
	public void testContains5(){
		assertEquals("Buzz", sut.fizzBuzz(52));
	}
}

