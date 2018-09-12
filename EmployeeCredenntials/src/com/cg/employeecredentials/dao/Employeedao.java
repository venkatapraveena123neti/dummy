package com.cg.employeecredentials.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.cg.employeecredentials.dto.EmployeeDto;
import com.cg.employeecredentials.staticdb.Employeedetails;

public class Employeedao implements IEmployeeDao {
	Scanner scanner = new Scanner(System.in);

	@Override
	public ArrayList<EmployeeDto> getalldetails() {
		ArrayList<EmployeeDto> list = Employeedetails.getemployeedetails();

		return list;
	}

	@Override
	public EmployeeDto getemployee(int empId) {
		EmployeeDto dao = null;
		ArrayList<EmployeeDto> emp = Employeedetails.getemployeedetails();
		for (EmployeeDto employeeDto : emp) {
			if (employeeDto.getEmpId() == empId) {
				dao = employeeDto;
			}
		}
		return dao;
	}

	@Override
	public void addemployee(EmployeeDto dto) {
		Employeedetails.addEmployee(dto);
	}

	@Override
	public void editsalary(int empId, double sal) {
		ArrayList<EmployeeDto> empList = Employeedetails.getemployeedetails();
		EmployeeDto empModified = null;
		Iterator<EmployeeDto> it = empList.iterator();
		while (it.hasNext()) {
			EmployeeDto employeeDto = (EmployeeDto) it.next();
			if (employeeDto.getEmpId() == empId) {
				empModified = employeeDto;
				it.remove();
				break;
			}
		}
		empModified.setEmpSalary(sal);
		Employeedetails.addEmployee(empModified);
	}
}