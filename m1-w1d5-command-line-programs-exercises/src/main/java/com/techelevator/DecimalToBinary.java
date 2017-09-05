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
		Scanner input = new Scanner(System.in);{
			System.out.print("Enter a series of decimal values (space-separated): ");
			String userInput = input.nextLine();      
			String [] decimalValues = userInput.split(" ");			
			
			int [] decimalValuesIntVersion = new int [decimalValues.length];		
			
			for (int i=0 ; i<decimalValues.length ; i++ ){
				decimalValuesIntVersion[i] = Integer.parseInt(decimalValues[i]);
				
				String binaryResult = "";
				
				int number = decimalValuesIntVersion[i]; {
					while (number > 0){
						binaryResult = (number%2) + binaryResult; 
						number = (number/2);		

					} System.out.println(decimalValues[i] + " in binary is " + binaryResult);
			
				}	
			}
		}
	}
}
			
			
			
			/*______________________			
		System.out.print("Enter a series of decimal values (separated by spaces): ");
		String userInput = input.nextLine(); 
		String [] userInputString = userInput.split(" ");	 // user input[] split
			
		int [] userInputIntVersion = new int [userInputString.length];	 // new [] made
		
		String resultBinaryNumber = "";
		int startingNumber = 0;
		
		for (int i = 0; i<userInputIntVersion.length; i++){
			userInputIntVersion[i] = Integer.parseInt(userInputString[i]);  
				// userInput[] made into Int version from String version
			for (int b = 0; b< userInputIntVersion.length; b++){
				startingNumber = userInputIntVersion[b];
				int number = userInputIntVersion[b]; 
				while (number<0){
					resultBinaryNumber = ( number % 2 ) + resultBinaryNumber;
					number = number/2;		
					
		}
		
			} System.out.print(resultBinaryNumber);
		} System.out.println (startingNumber + " in binary is " +  resultBinaryNumber);
		} 
	}
}
			
/*__________________		
		System.out.print("Enter a series of decimal values (separated by spaces): ");
		String userInput = input.nextLine(); 
		String [] userInputString = userInput.split(" ");	 // user input[] split
		
		int [] userInputIntVersion = new int [userInputString.length];	 // new [] made
		
		int i = 0; 
		
		for (i = 0; i<userInputIntVersion.length; i++){
			userInputIntVersion[i] = Integer.parseInt(userInputString[i]);  
				// userInput[] made into Int version from String version
		}
		
		String binNum = "";  // user string that holds Binary number declared 
		
		for (i =0; i<userInputIntVersion.length-1; i++){
			int number = userInputIntVersion[i]; 
				while (number > 0) {
				binNum = (number %2) + binNum;  
				number = number/2;
				} 
		} System.out.println (userInputString[i] + " in binary is " +  binNum);
			 // message of second? number given is printed with binary of first - why?
									
		}	
	}
}
	
	___________________ */
		 	
		
	
	
		
	/*	System.out.print("Enter a series of decimal values (separated by spaces): ");
		String userInput = input.nextLine();      
		String [] decimalNumbers = userInput.split(" ");	 
		
		String binNum = ""; 
		double [] decimalNumbersDoubleVersion = new double [decimalNumbers.length];		
		
		double number = 0;
		
		  		double number = userInputIntVersion[i]; {
			
				while (number > 0){
					binaryNumber = (number%2) + binaryNumber; 
					number = (number/2);
		while (number > 0) {
		 binNum = (number %2) + binNUm;  // if binNum is an empty string it just puts 1 in there the first time through
		 number = number/2;
		  }
		  System.out.println(binNum)
		
		
		  double binary = 0;
		
		 for (int i=0 ; i>=0 ; i++){
			if (i%2==0){
				return 0; 
	
	
	

	/* int number = 25; 
	  
	  string binNum = ""; 
	  
	  while (number > 0) {
	  binNum = (number %2) + binNUm;  // if binNum is an empty string it just puts 1 in there the first time through
	  number = number/2;
	  }
	  System.out.println(binNum)
	  
	  11001 */

