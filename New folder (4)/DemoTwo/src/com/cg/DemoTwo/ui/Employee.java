package com.cg.DemoTwo.ui;

public class Employee {
	int empId;
	boolean empName;
	double empSal;
    public Employee()
    {
    	
    	
    }
    public Employee(int empId,boolean empName,double empSal)
    
    {
    	this.empId=empId;
    	this.empName=empName;
    	this.empSal=empSal;
    	
    	
    }
    public void printAllDetails()
    {
    	System.out.println(" "+empId+" "+empName+" "+empSal);
    }
}
