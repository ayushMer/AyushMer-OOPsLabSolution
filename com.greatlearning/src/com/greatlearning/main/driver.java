package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.models.employee;
import com.greatlearning.service.employeeService;

public class driver {

	public static void main(String[] args) {
		
		employeeService empService= new employeeService();
		Scanner sc=new Scanner(System.in);
	    boolean flag=true;
	    employee emp1=new employee("Ayush", "Mer", "");
	    int sel;
	    do{
	    	System.out.println("Please enter the department from the following");
	    	System.out.println("1. Technical");
	    	System.out.println("2. Admin");
	    	System.out.println("3. Human Resource");
	    	System.out.println("4. Legal");
	    	System.out.println();
	    	System.out.println("Press 5 to Exit");
	    	System.out.println();
	    	sel=1;
	    	sel=sc.nextInt();
	    	switch(sel){
	    	case 1:
	    	empService.emailCredGenerator("Technical",emp1);
	    	empService.displayRecord(emp1);
	    	break;
	    	
	    	case 2:
		    	empService.emailCredGenerator("Admin",emp1);
		    	empService.displayRecord(emp1);
		    	break;
		    	
	    	case 3:
		    	empService.emailCredGenerator("HumanResource",emp1);
		    	empService.displayRecord(emp1);
		    	break;
		    	
	    	case 4:
		    	empService.emailCredGenerator("Legal",emp1);
		    	empService.displayRecord(emp1);
		    	break;
	    	
		    	default :
		    		if(sel==5)
		    				{
		    				System.out.println("Exited successfully");
		    				flag=false;
		    				}
		    			else
		    				{
		    				System.out.println("Invalid choice,try again");
		    				flag=true;
		    				}
		    		break;
	    	}		
	    }while(flag==true);
	    	
		}
}
