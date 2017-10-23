package com.techelevator.validation.model;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;


public class Registration {
	@NotBlank(message="First Name is required") @Length(max=20)   
	private String firstName;
	
	@NotBlank(message="Last Name is required") @Length(max=20) 
	private String lastName; 
	
	@NotBlank(message="Invalid Email") @Email
	private String email;
	
	
	private String confirmEmail;
	
	@NotBlank(message="Password is Required") @Length(min=8, message="Password must be at least 8 characters long") 
	private String password;
	
	
	private String confirmPassword;
	
	@NotBlank @Past 
	private Date birthDate; 
	
	@NotBlank @Range(min=1, max=10, message="Ticket quantity must be between 1 and 10")
	private Integer tickets;
	
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getTickets() {
		return tickets;
	}
	public void setTickets(Integer tickets) {
		this.tickets = tickets;
	}
	

}
