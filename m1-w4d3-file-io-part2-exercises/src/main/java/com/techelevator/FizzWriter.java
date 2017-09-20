package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {

		File fizzBuzzResult = new File ("FizzBuzz.txt");
		int number = 1;
		String stringVersion = Integer.toString(number);
		
		try (				
				PrintWriter writeFizzBuzz = new PrintWriter(fizzBuzzResult)
			){ while(number > 0 && number<=300){
				if (number % 3==0  && number % 5==0){
					writeFizzBuzz.println("FizzBuzz");
					number ++;
				}else if (number == 3 || number % 3 ==0 || stringVersion.contains("3")){
					writeFizzBuzz.println("Fizz");
					number ++;
				}else if (number == 5 || number % 5 == 0 || stringVersion.contains("5")){
					writeFizzBuzz.println("Buzz");
					number ++;
				}else {
					writeFizzBuzz.println( Integer.toString(number));
					number ++;
				}
			}
			}catch (FileNotFoundException e) {
				e.printStackTrace(); 
				System.exit(1);	
		}
	}
}
		
