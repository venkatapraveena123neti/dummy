package com.cg.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


import com.cg.dto.StudentDto;
import com.cg.service.IStudentService;
import com.cg.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {
		IStudentService student = new StudentServiceImpl();
		StudentDto studentDto = new StudentDto();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 add student details\n 2 view student status\n 3 exit");
		int choice=0;
		do {
			System.out.println("enter choice ");
		choice = scanner.nextInt();
		switch (choice) {
		case 1: {
			
			System.out.println("enter name");
			String name = scanner.next();
			try
			{
				student.validatename(name);
			}
			catch (com.cg.studentproject.exception.StudentException e) {
    			// TODO Auto-generated catch block
    			System.out.println(e.getMessage());
    		}
			System.out.println("enter phone number");
			String  number= scanner.next();
			try
			{
				student.validatephnNum(number);
			}
			catch (com.cg.studentproject.exception.StudentException e) {
    			// TODO Auto-generated catch block
    			System.out.println(e.getMessage());
    		}
			System.out.println("enter mailid");
			String mailid = scanner.next();
			try
			{
				student.validatemail(mailid);
			}
			catch (com.cg.studentproject.exception.StudentException e) {
    			// TODO Auto-generated catch block
    			System.out.println(e.getMessage());
    		}
			System.out.println("enter age");
			String age = scanner.next();
			try
			{
				student.validateage(age);
			}
			catch (com.cg.studentproject.exception.StudentException e) {
    			// TODO Auto-generated catch block
    			System.out.println(e.getMessage());
    		}
			System.out.println("enter gender");
			//Character gender = scanner.next().charAt(0);
			 String gender=scanner.next().trim().toLowerCase();
			
			 try {
					 student.validategender(gender);
				 }
			 catch (com.cg.studentproject.exception.StudentException e) {
	    			// TODO Auto-generated catch block
	    			System.out.println(e.getMessage());
	    		}
			
			
			System.out.println("enter city");
			String city = scanner.next();
			System.out.println("enter Date of expected joining in the form dd/MM/yyyy ");
			DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			String date = scanner.next();
			LocalDate myDate = LocalDate.parse(date, formate);
             try
             {
            	 student.validateDate(myDate);
            	 
             }
             catch (com.cg.studentproject.exception.StudentException e) {
	    			// TODO Auto-generated catch block
	    			System.out.println(e.getMessage());
	    		}
			
			System.out.println("enter year of pass");
			String yop = scanner.next();
			//StudentDto studentDto = new StudentDto();
			studentDto.setAge(age);
		studentDto.setCity(city);
		studentDto.setEmail(mailid);
		studentDto.setGender(gender);
		studentDto.setName(name);
		studentDto.setPhoneNumber(number);
		studentDto.setDob(myDate);
		studentDto.setYearOfPass(yop);
			student.addStudentDetails(studentDto);
			
			break;
		}

		case 2: {
			System.out.println("enter id");
			int id = scanner.nextInt();
			StudentDto studentdetails = student.getStatus(id);
			if(studentdetails!=null) {
				System.out.println("Studentid="+studentdetails.getId()+"\nStudent Name="+studentdetails.getName()+"\nStatus="+studentdetails.getStatus()+"\ncollege name="+studentdetails.getCollegeName());
			}
			else {
			System.out.println("No College Assigned");
			}
			break;

		}
		case 3: {
			System.exit(1);
			scanner.close();
		}

		}
		}while (choice < 3);
			

	}

}
