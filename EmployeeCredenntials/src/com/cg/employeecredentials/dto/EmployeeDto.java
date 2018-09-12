package com.cg.employeecredentials.dto;

public class EmployeeDto {
	private int empId;
	private double empSalary;
	private String empName;
	private String Designation;

	@Override
	public String toString() {
		return "Employeeinfo [empId=" + empId + ", empSalary=" + empSalary + ", empName=" + empName + ", Designation="
				+ Designation + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

}
