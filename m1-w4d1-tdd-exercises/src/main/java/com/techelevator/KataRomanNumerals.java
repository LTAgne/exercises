package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataRomanNumerals {

	// LOOK UP LATER Map<String, String> spafon = new HashMap<String, String>(){ "a":"A", "b":"B"};
	
	Map<Integer, String> romanNumerals = new HashMap<Integer, String>()
	{
		{ 
			put(1, "I");
			put(2, "II");
			put(3, "III");
			put(4, "IV");
			put(5, "V");
			put(6, "VI");
			put(7, "VII");
			put(8, "VIII");
			put(9, "VIIII");
			put(10, "X");
			put(50, "L");
			put(100, "C");
			put(500, "D");
			put(1000, "M");
		}
	};
		
	public String convertToRomanNumeral(int number) {
		if (number == 
		return romanNumerals.get(number);	
	}
}
		
				
//				String stringVersion = Integer.toString(number);
//		String result = "";
////		if(stringVersion.length()==4){	
////		}else if (stringVersion.length()==3)
////		}else if (stringVersion.length()==2)
////		}else 
//			
//		if (stringVersion.length()==1 && number<5){
//			if (number<5){
//				for (int i=0; i<number; i++){
//				result += "I"; 
////			} else {
////				return "V";
////			}
//		}
//		
//		
////			for (int i=0; i<result.length(); i++){
////			result += "I"; 
////			}
////			}else if (number ==5){
////			return "V";
////		}
////		
//		return result;
//	}
//// convert to a string and see the length if statement for below 	
//}
//	}}
