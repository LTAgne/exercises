package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fibonacci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the fibonacci number: ");
		int number = input.nextInt();
		input.nextLine();
		
		String fibonacciResult = "0,1,1";
		
		int previous3 = 0; 
		int previous2 = 1;
		int previous1 = 1;
		int calculatedNumber = (previous1 + previous2);	
		
		System.out.print(fibonacciResult);
		
		for (int i=0; i<number; i++){
			if (calculatedNumber < number){
				calculatedNumber = (previous1 + previous2);	
				previous3 = previous2;
				previous2 = previous1;
				previous1 = calculatedNumber;
			if (calculatedNumber>= number){
				return;
			} 
			}
			}System.out.print("," + calculatedNumber);
			
		}
	
	}	
}
