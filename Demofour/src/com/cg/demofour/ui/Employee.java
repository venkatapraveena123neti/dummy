package com.cg.demofour.ui;

public class Employee {
	private int empid;
	private String empname;
	private double empsalary;
	public double getempsalary()
	{
		return empsalary;
	}
	public void setempsalary(double salary)
	{
		this.empsalary=salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	public int getempid()
	{
		return empid;
	}
public void setempid(int empid)
{
	this.empid=empid;
}
public String getempname()
{
	return empname;
	
}
public void setempname(String empname)
{
	this.empname=empname;
}
}
