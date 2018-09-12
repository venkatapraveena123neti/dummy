package com.cg.login.staticdb;

import java.util.ArrayList;
import com.cg.login.dto.EmployeeDto;

public class LoginDatabase {
	private static ArrayList<EmployeeDto> arraylist = null;

	static {
		arraylist = new ArrayList<>();
	}

	public static ArrayList<EmployeeDto> getEmployeeDetails() {
		// arraylist.add(new EmployeeDto(1,"varun",20000.0,"Analyast"));
		// arraylist.add(new EmployeeDto(2,"vinod",33000.0,"Analyast"));
		// arraylist.add(new EmployeeDto(3,"suraj",33000.0,"Analyast"));
		// arraylist.add(new EmployeeDto(4,"uday",20000.0,"Analyast"));
		EmployeeDto employee1 = new EmployeeDto();
		employee1.setEmpId(1);
		employee1.setEmpName("varun");
		employee1.setEmpSalary(2000.00);
		employee1.setEmpDesignation("Analyst");
		arraylist.add(employee1);
		EmployeeDto employee2 = new EmployeeDto();
		employee2.setEmpId(2);
		employee2.setEmpName("varun");
		employee2.setEmpSalary(2000.00);
		employee2.setEmpDesignation("Analyst");
		arraylist.add(employee2);
		EmployeeDto employee3 = new EmployeeDto();
		employee3.setEmpId(3);
		employee3.setEmpName("varun");
		employee3.setEmpSalary(2000.00);
		employee3.setEmpDesignation("Analyst");
		arraylist.add(employee3);
		EmployeeDto employee4 = new EmployeeDto();
		employee4.setEmpId(4);
		employee4.setEmpName("varun");
		employee4.setEmpSalary(2000.00);
		employee4.setEmpDesignation("Analyst");
		arraylist.add(employee4);
		return arraylist;

	}
}
