package com.cg.employeecredentials.service;

import java.util.ArrayList;

import com.cg.employeecredentials.dao.Employeedao;
import com.cg.employeecredentials.dao.IEmployeeDao;
import com.cg.employeecredentials.dto.EmployeeDto;

public class EmployeeService implements IEmployeeService {
	IEmployeeDao emp = null;

	public EmployeeService() {
		emp = new Employeedao();
	}

	@Override
	public ArrayList<EmployeeDto> getalldetails() {
		// TODO Auto-generated method stub
		return emp.getalldetails();
	}

	@Override
	public EmployeeDto getemployee(int empId) {
		// TODO Auto-generated method stub
		return emp.getemployee(empId);
	}

	@Override
	public void addemployee(EmployeeDto dto) {
		emp.addemployee(dto);
	}

	@Override
	public void editsalary(int empId, double sal) {
		// TODO Auto-generated method stub
		emp.editsalary(empId, sal);
	}

}
