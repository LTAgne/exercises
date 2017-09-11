package com.techelevator;

public class Elevator {

	private int currentFloor = 1; 
	private int numberOfFloors; 
	private boolean doorOpen = false;

	
	public Elevator(int totalNumberOffloors){
		this.numberOfFloors = totalNumberOffloors; 
	}
	
	public void openDoor(){
		doorOpen = true; 
	}
	
	public void closeDoor(){
		doorOpen = false; 
	}
	
	public void goUp(int desiredFloor){
		if ((doorOpen == false) && ((desiredFloor <= numberOfFloors) && desiredFloor> currentFloor)){
			currentFloor = desiredFloor; 
		}
	}
	
	public void goDown(int desiredFloor){
		if ((doorOpen == false) && ((desiredFloor >= 1) && desiredFloor< currentFloor)){
			currentFloor = desiredFloor; 
		}
	}
	
	// auto getters 
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	
	public boolean isDoorOpen() {
		return doorOpen;
	} 
}
