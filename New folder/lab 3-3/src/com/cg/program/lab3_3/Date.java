package com.cg.program.lab3_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {
	public static void main(String args[])
	{
		LocalDate Today=LocalDate.now();
		Scanner s=new Scanner(System.in);
		//LocalDate Today1=LocalDate.of(2014,Month.APRIL,14);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date=s.next();
		LocalDate date1=LocalDate.parse(date,format);
		Period diff=Today.until(date1);
		System.out.println(diff);
		
		System.out.println("Exp in no of years"+diff.getYears());
		System.out.println("Exp in no of months"+diff.getMonths());
		System.out.println("Exp in no of days"+diff.getDays());
		s.close();
		System.out.println(date1);
		//System.out.println(new String("ho") instanceof String);
	}

}
