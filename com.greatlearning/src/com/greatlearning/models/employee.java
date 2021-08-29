package com.greatlearning.models;

public class employee {
	
	private String firstName;
	private String lastName;
	private String department;
	private String credentials;
	private String email;
	public final String company="abc";

	public employee(String firstName,String lastName,String department) {
		// TODO Auto-generated constructor stub
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=department;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCredentials() {
		return credentials;
	}

	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
}
