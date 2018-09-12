package com.cg.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cg.dto.ExampleDto;

import com.cg.exception.PatientException;
import com.cg.service.ExampleServiceImpl;
import com.cg.service.IExampleService;

public class MyMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		IExampleService exampleService = new ExampleServiceImpl();
		System.out.println("1.Add \n2.view details \n3.Exit");

		int choice;
		do {
			choice = scanner.nextInt();
			switch (choice) {
			case 1:

				try {
					ExampleDto dto = new ExampleDto();
					System.out.println("ENter the p name");
					String name = scanner.next();
					exampleService.checkName(name);
					dto.setPname(name);
					System.out.println("enter the p age");
					int age = scanner.nextInt();
					exampleService.checkage(age);
					dto.setPage(age);
					System.out.println("enter the p weight");
					dto.setPweight(scanner.nextDouble());
					System.out.println("enter the p gender");
					char gender = scanner.next().charAt(0);
					exampleService.checkGender(gender);
					dto.setPgender(gender);
					System.out.println("enter the p disease");
					dto.setPdisease(scanner.next());

					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					System.out.println("Enter the p date of joining in dd/MM/yyyy");
					String date = scanner.next();

					LocalDate mydate = LocalDate.parse(date, format);
					dto.setDoc(mydate);
					if (exampleService.addPatient(dto))
						System.out.println("doctor available");
					else
						System.out.println("doctor not availble");

				} catch (PatientException e) {

				System.out.println(e.getMessage());
				}

				break;

			case 2: {
                System.out.println("enter the patient id ");
                int id = scanner.nextInt();
                ExampleDto patient = exampleService.getDetails(id);
                if(patient!=null) {
                	System.out.println(patient);
                }else {
                	System.out.println("Invalid id");
                }
			}
			case 3:
				scanner.close();
				System.exit(0);
				break;
			}
		} while (choice < 3);

	}
}
