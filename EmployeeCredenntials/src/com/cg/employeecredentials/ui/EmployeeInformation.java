package com.cg.employeecredentials.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.employeecredentials.dto.EmployeeDto;
import com.cg.employeecredentials.service.EmployeeService;
import com.cg.employeecredentials.service.IEmployeeService;

public class EmployeeInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		IEmployeeService emp = new EmployeeService();
		do {
			System.out.println(
					"enter choice\n 1 to get all employee details\n 2 to get particular employee details\n3 to add an employee to database\n4.to edit an employee from database\n 5.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				ArrayList<EmployeeDto> employees = emp.getalldetails();
				System.out.println(employees);
				break;
			}
			case 2: {
				System.out.println("enter empid");
				int empId = scanner.nextInt();
				EmployeeDto employee = emp.getemployee(empId);
				if (employee != null) {
					System.out.println(employee);

				} else {
					System.out.println("invalid data");
				}
				break;
			}
			case 3: {
				System.out.println("enter details");
				System.out.println("enter empid");
				int id = scanner.nextInt();
				System.out.println("enter empname");
				String name = scanner.next();
				System.out.println("enter empsalary");
				double salary = scanner.nextDouble();
				System.out.println("enter designation");
				String designation = scanner.next();
				EmployeeDto dto = new EmployeeDto();
				dto.setEmpId(id);
				dto.setEmpName(name);
				dto.setEmpSalary(salary);
				dto.setDesignation(designation);

				emp.addemployee(dto);

				ArrayList<EmployeeDto> employees = emp.getalldetails();
				System.out.println(employees);
				break;
			}
			case 4: {
				System.out.println("enter employeeId");
				int empId = scanner.nextInt();
				System.out.println("enter salary to be updated");
				double sal = scanner.nextDouble();
				emp.editsalary(empId, sal);
				EmployeeDto employees = emp.getemployee(empId);
				System.out.println(employees);
				break;
			}
			case 5:
				scanner.close();
				System.exit(1);
			default:
				System.out.println("internal error try again");
			}
		} while (true);
	}
}
