package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int number) {
		
		String stringVersion = Integer.toString(number);
		
		if (number > 0 && number<=100){
			if (number % 3==0  && number % 5==0){
				return "FizzBuzz";
			}else if (number == 3 || number % 3 ==0 || stringVersion.contains("3")){
				return "Fizz";
			}else if (number == 5 || number % 5 == 0 || stringVersion.contains("5")){
				return "Buzz"; 
			}else {
			return Integer.toString(number);
			}
		} else return "";
		
	}
}

