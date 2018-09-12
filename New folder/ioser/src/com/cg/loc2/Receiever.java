package com.cg.loc2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.cg.loc1.Employee;

public class Receiever {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file=new   File("D:/fsf.txt");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee varun=(Employee) ois.readObject();
		System.out.println(" id: "+varun.getEmpid()+" name: "+varun.getEmpName()+" salary: "+varun.getEmpSalary()+" designation: "+varun.getDesignation());
		System.out.println(varun.hashCode());
		ois.close();
		fis.close();
		
		}

}
