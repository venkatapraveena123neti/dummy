package com.cg.SampleStatic.ui;
import static java.lang.Math.*;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee.pf=10;
      System.out.println(" "+Employee.pf);
      
      Employee emp=new Employee();
      emp.empId=1000;
      System.out.println(" "+emp.empId+ " "+Employee.pf);
      
      Employee.pf=150;
      System.out.println(" "+emp.empId+" "+Employee.pf);
      
      emp.empId=20;
      System.out.println(" "+emp.empId+ " "+Employee.pf);
      
      
      Employee emp1=new Employee();
      emp1.empId=5500;
      System.out.println(" "+emp1.empId+ " "+Employee.pf);
      
      Employee emp2=new Employee();
      
      System.out.println(" "+emp2.empId+ " "+Employee.pf);
      
      emp2=emp;
      System.out.println(" "+emp2.empId+" "+Employee.pf);
      
      System.out.println(max(10,50));
	}

}
