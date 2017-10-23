package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OrderedNameController {
	
	@RequestMapping ({"/", "/orderedNameInput"})
	public String orderedNameInput (){
		return "orderedNameInput";
	}
	
	@RequestMapping ("/orderedNameResult")
	public String nameResult(@RequestParam String firstName, @RequestParam String middleInitial, @RequestParam String lastName, @RequestParam String orderSelection, ModelMap modelHolder){
		NameOrderer selectedOrder = new NameOrderer (firstName, middleInitial, lastName, orderSelection);
		modelHolder.put("order", selectedOrder);
		return "orderedNameResult";
	}
	
	
}
