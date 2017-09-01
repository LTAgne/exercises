package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a series of decimal values (separated by spaces): ");
		String userInput = input.nextLine();      
		String [] decimalValues = userInput.split(" ");		// 
		
		double binary = 0;
		
		double [] decimalValuesDoubleVersion = new double [decimalValues.length];		
		
		for (int i=0 ; i>=0 ; i++){
			if (i%2==0){
				return 0; 
		
		for (int i=0 ; i<decimalValues.length ; i++ ){
			decimalValuesDoubleVersion[i] = Double.parseDouble(decimalValues[i]);
			binary = decimalValuesDoubleVersion[i] *//binary converion goes here;
			System.out.println(decimalValues[i] + " in binary is " + binary);

			}
		
		
		}
}
	}

}
/* int number = 25; 
 * string binNum = ""; 
 * while (number > 0) {
 * binNum = (number %2) + binNUm;  // if binNum is an empty string it just puts 1 in there the first time through
 * number = number/2'
 * }
 * System.out.println(binNum)
 * 
 * 11001
