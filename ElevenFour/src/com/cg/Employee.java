package com.cg;

public class Employee {
int empId;
String empName;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}


public String view(int empId, String empName)
{
	return "id is" +empId+ "name is"+empName;
	
	
}
}
