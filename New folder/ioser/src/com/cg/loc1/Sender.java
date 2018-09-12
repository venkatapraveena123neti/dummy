package com.cg.loc1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {

	public static void main(String[] args) throws IOException {
	Employee employee=new Employee();
	employee.setEmpid(1);
	employee.setEmpName("varun");
	employee.setEmpSalary((double) 20000);
	employee.setDesignation("manager");
	System.out.println(employee.hashCode());
	File file =new File("D:/fsf.txt");
	FileOutputStream fos=new FileOutputStream(file);
ObjectOutputStream objectOutputStream=new ObjectOutputStream(fos);
objectOutputStream.writeObject(employee);
objectOutputStream.close();
fos.close();
System.out.println("done");

	}

}
