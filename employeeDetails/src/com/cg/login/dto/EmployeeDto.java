package com.cg.login.dto;

public class EmployeeDto {
private int empId;
private String empName;
private double empSalary;


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

public double getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}

public String getEmpDesignation() {
	return empDesignation;
}

public void setEmpDesignation(String empDesignation) {
	this.empDesignation = empDesignation;
}

public EmployeeDto(int empId, String empName, double empSalary, String empDesignation) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.empDesignation = empDesignation;
}

public EmployeeDto() {
	// TODO Auto-generated constructor stub
}

private String empDesignation;
}
