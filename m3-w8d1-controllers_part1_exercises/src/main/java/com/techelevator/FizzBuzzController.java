package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class FizzBuzzController {

	@RequestMapping (path="/fizzBuzz", method=RequestMethod.GET)
	public String showFrom(){
		return "fizzBuzzRevisitedInput";
	}
	
	@RequestMapping (path="/fizzBuzzResult", method=RequestMethod.GET)
	public String printFizzBuzz(@ModelAttribute fizzBuzzOrderer fizzBuzz, ModelMap modelHolder){
		modelHolder.put("fizzBuzzResult", fizzBuzz);
		return "fizzBuzzResult";
	}
}
