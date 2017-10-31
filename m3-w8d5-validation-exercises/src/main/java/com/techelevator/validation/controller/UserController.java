package com.techelevator.validation.controller;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String showRegistration(ModelMap modelHolder){
		if(! modelHolder.containsAttribute("registration")){
			modelHolder.put("registration", new Registration());
		}
		return "register";	
	}
	
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String processRegistration(@Valid @ModelAttribute("Registration") Registration registration, BindingResult result, 
			RedirectAttributes flash){
		
		flash.addFlashAttribute("registration", registration);
		
		if(result.hasErrors()){
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "registration", result);
			return "redirect:/register";
		}
		
		//this is where things happen for the registration
		 
		
		return "redirect:/regConfirmation";
	}

	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String showLogin(ModelMap modelHolder){
		if(! modelHolder.containsAttribute("login")){
			modelHolder.put("login", new Login());
		}
		return "login";	
	}

	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String processLogin(@Valid @ModelAttribute Login login, BindingResult result, 
			RedirectAttributes flash){
		
		flash.addFlashAttribute("login", login);
		
		if(result.hasErrors()){
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "login", result);
			return "redirect:/login";
		}
		
		//this is where things happen for the login
		 
		
		return "redirect:/confirmation";
	}

	@RequestMapping(path="/confirmation", method=RequestMethod.GET)
	public String showConfirmationPage(){
		return "/confirmation";
	}

}
