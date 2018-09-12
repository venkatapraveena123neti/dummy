package com.cg.employeecredentials.service;

import java.util.ArrayList;

import com.cg.employeecredentials.dto.EmployeeDto;

public interface IEmployeeService {
	public ArrayList<EmployeeDto> getalldetails();
	public EmployeeDto getemployee(int empId);
	public void addemployee(EmployeeDto dto);
	public void editsalary(int empId,double sal);
	

}
