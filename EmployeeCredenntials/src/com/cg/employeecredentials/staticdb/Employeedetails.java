package com.cg.employeecredentials.staticdb;

import java.util.ArrayList;

import com.cg.employeecredentials.dto.EmployeeDto;

public class Employeedetails {
	private static ArrayList<EmployeeDto> arraylist = null;
	static {
		arraylist = new ArrayList<>();
		EmployeeDto employee1 = new EmployeeDto();
		employee1.setEmpId(1);
		employee1.setEmpName("varun");
		employee1.setEmpSalary(2000.00);
		employee1.setDesignation("Analyst1");
		arraylist.add(employee1);
		EmployeeDto employee2 = new EmployeeDto();
		employee2.setEmpId(2);
		employee2.setEmpName("varun");
		employee2.setEmpSalary(2000.00);
		employee2.setDesignation("Analyst2");
		arraylist.add(employee2);
		EmployeeDto employee3 = new EmployeeDto();
		employee3.setEmpId(3);
		employee3.setEmpName("varun");
		employee3.setEmpSalary(2000.00);
		employee3.setDesignation("Analyst3");
		arraylist.add(employee3);
		EmployeeDto employee4 = new EmployeeDto();
		employee4.setEmpId(4);
		employee4.setEmpName("varun");
		employee4.setEmpSalary(2000.00);
		employee4.setDesignation("Analyst4");
		arraylist.add(employee4);
	}

	public static ArrayList<EmployeeDto> getemployeedetails() {
		return arraylist;
	}

	public static void addEmployee(EmployeeDto dto) {
		if (null != dto) {
			arraylist.add(dto);
		}
	}

}
