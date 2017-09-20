package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataRomanNumeralsTest {

	KataRomanNumerals sut; 
	
	@Test
	public void test1(){
		sut = new KataRomanNumerals(); 
		assertEquals("I", sut.convertToRomanNumeral(1));
	}

	@Test
	public void testFour(){
		sut = new KataRomanNumerals(); 
		assertEquals("IV", sut.convertToRomanNumeral(4));
	}

	@Test
	public void testFive(){
		sut = new KataRomanNumerals(); 
		assertEquals("V", sut.convertToRomanNumeral(5));
	}

	@Test
	public void testSeven(){
		sut = new KataRomanNumerals(); 
		assertEquals("VII", sut.convertToRomanNumeral(7));
	}
	
	@Test
	public void test100(){
		sut = new KataRomanNumerals(); 
		assertEquals("C", sut.convertToRomanNumeral(100));
	}
	
	@Test
	public void test52(){
		sut = new KataRomanNumerals(); 
		assertEquals("LII", sut.convertToRomanNumeral(52));
	}
	
	
}
