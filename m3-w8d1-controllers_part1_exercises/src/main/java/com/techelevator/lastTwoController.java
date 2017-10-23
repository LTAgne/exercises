package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class lastTwoController {

	@RequestMapping (path="/lastTwoInput", method=RequestMethod.GET)
	public String showFrom(){
		return "lastTwoInput";
	}
	
	
	@RequestMapping (path="/lastTwoResult", method=RequestMethod.GET)
	public String printLastTwo(@ModelAttribute LastTwo lastTwo, ModelMap modelHolder){
		modelHolder.put("Last1", lastTwo);
		return "lastTwoResult";
	}
}
