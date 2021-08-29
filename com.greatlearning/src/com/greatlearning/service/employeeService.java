package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.models.employee;

public class employeeService {
	Scanner sc=new Scanner(System.in);
	
	
	public void displayRecord(employee emp)
	{
		
		System.out.println("Dear "+emp.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email ---> "+emp.getEmail());
		System.out.println("Password ---> "+emp.getCredentials());
		System.out.println();
	}

	public void emailCredGenerator(String department, employee emp) {
		// TODO Auto-generated method stub
		emp.setDepartment(department);
		String email=emp.getFirstName()+emp.getLastName()+"."+department+"@"+emp.company+".com";
		emp.setEmail(email);
		
		credGenerator cred=new credGenerator();
		String generatedCred=cred.generatedCreds();
		emp.setCredentials(generatedCred);
	}

	public boolean blankEntry(String val) {
		// TODO Auto-generated method stub
		
		if(val.length()==0)
			return false;
		
		return true;
		
	}
	
}
