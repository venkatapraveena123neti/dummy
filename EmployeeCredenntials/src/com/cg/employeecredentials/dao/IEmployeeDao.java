package com.cg.employeecredentials.dao;

import java.util.ArrayList;

import com.cg.employeecredentials.dto.EmployeeDto;

public interface IEmployeeDao {
	public ArrayList<EmployeeDto> getalldetails();
	public EmployeeDto getemployee(int empId);
	public void addemployee(EmployeeDto dto);
	public void editsalary(int empId,double sal);

}
