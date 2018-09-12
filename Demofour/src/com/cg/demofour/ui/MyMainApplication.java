package com.cg.demofour.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MyMainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee();
//Employee e1=new Employee();
e.hashCode();
//System.out.println(e.hashCode());
//System.out.println(e1.hashCode());
//System.out.println(e1.getClass());
//System.out.println(e1.toString());

e.setempid(1001);
e.setempname("varun");
e.setempsalary(999.00);
System.out.println(e);

Scanner s=new Scanner(System.in);

//System.out.println("enter no");
//a=s.nextInt();
//s.nextLine();
//System.out.println("enter name");
//b=s.nextLine();
String q="varun";
String r="puli";
String o="varun";
System.out.println(q.equals(o));
String t=q+r;
System.out.println(t);
System.out.println(q.concat("puli"));

System.out.println(q);
//System.out.println("no: "+a+" \nname"+b);
//System.out.println(e.toString());
Date d=new Date();
System.out.println(d);
LocalDate mydate=LocalDate.of(2017, Month.APRIL, 17);
System.out.println(mydate);
LocalDateTime mydate1=LocalDateTime.now();
System.out.println(mydate1);
ZonedDateTime z=ZonedDateTime.now();
System.out.println(z);
ZonedDateTime z1=ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
System.out.println(z1);
LocalDate Today=LocalDate.now();
LocalDate Today1=LocalDate.of(2014,Month.APRIL,14);
Period diff=Today1.until(Today);
System.out.println(diff);
System.out.println("Exp in no of years"+diff.getYears());
System.out.println("Exp in no of months"+diff.getMonths());
System.out.println("Exp in no of days"+diff.getDays());
DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
String date=s.next();
LocalDate date1=LocalDate.parse(date,format);
System.out.println(date1);
s.close();
	}

}
