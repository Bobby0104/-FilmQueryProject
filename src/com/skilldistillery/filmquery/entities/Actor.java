package com.skilldistillery.filmquery.entities;

public class Actor {
	
	private String firstName;
	private String lastName;
	
	public Actor() {
		super();
	}
	
	
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
	public Actor(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	@Override
	public String toString() {
		return "Actor [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
