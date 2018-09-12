package com.cg.program.lab3_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Validation {
	void validate()
	{
		Scanner s=new Scanner(System.in);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("enter date of purchase in dd/mm/yyyy format");
		String str=s.nextLine();
		//System.out.println(str);
		LocalDate dop=LocalDate.parse(str, format);
		System.out.println("enter 1-Years\n 2-Months");
		int input=s.nextInt();
		switch(input)
		{
		
		case 1:
			System.out.println("enter no of years");
		long years=s.nextLong();
		LocalDate doe=dop.plusYears(years);
		//System.out.println(date1.plusYears(n));
		System.out.println(doe);
	break;
		case 2:
			System.out.println("enter no of months");
			long months=s.nextLong();
			LocalDate doe1=dop.plusMonths(months);
			//System.out.println(date1.plusYears(n));
			System.out.println(doe1);
		break;
		}
		s.close();
	}

}
