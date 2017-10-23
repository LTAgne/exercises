package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class NameOrderer {
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String orderSelection;
	private Map<String, String> orderStrings;
	
	
	public NameOrderer(String firstName, String middleInitial, String lastName, String order){
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.orderSelection = order;
		
		String firstMLast = "Ordered: " + lastName + "," + firstName; 
		String firstLast = "Ordered: " + firstName + lastName; 
		String lastFirstM = "Ordered: " + lastName + "," + firstName + "," + middleInitial;
		String lastFirst = "Ordered: " + lastName + "," + firstName;
		
		orderStrings = new HashMap<String, String>();
		orderStrings.put("firstMLast", firstMLast);
		orderStrings.put("firstLast", firstLast);
		orderStrings.put("lastFirstM", lastFirstM);
		orderStrings.put("lastFirst", lastFirst);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Map<String, String> getOrderStrings() {
		return orderStrings;
	}

	public void setOrderStrings(Map<String, String> nameOrderer) {
		this.orderStrings = nameOrderer;
	}

	public String getOrderSelection() {
		return orderSelection;
	}

	public void setOrderSelection(String orderSelection) {
		this.orderSelection = orderSelection;
	}
	
	
		
}
