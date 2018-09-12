package com.cg.program.lab3_4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDate Today=LocalDate.now();
		Scanner s=new Scanner(System.in);
		//LocalDate Today1=LocalDate.of(2014,Month.APRIL,14);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date1=s.next();
		String date2=s.next();
		LocalDate Date1=LocalDate.parse(date1,format);
		LocalDate Date2=LocalDate.parse(date2,format);
		Period diff=Date1.until(Date2);
		//System.out.println(diff);
		
		System.out.println("Exp in no of years"+diff.getYears());
		System.out.println("Exp in no of months"+diff.getMonths());
		System.out.println("Exp in no of days"+diff.getDays());
		s.close();

	}

}
