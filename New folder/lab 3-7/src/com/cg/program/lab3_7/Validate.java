package com.cg.program.lab3_7;

import java.util.Scanner;

public class Validate {
public boolean Isvalid()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter username");
	String uname=s.nextLine();
	boolean b = false;
	if(uname.length()>=12)
	{
		int n=uname.length();
		String str1="_job";
		String str2=uname.substring(n-4, n);
	b=str1.equals(str2);
	}
	s.close();
	return b;
}
	public static void main(String[] args) {
		Validate v=new Validate();
		boolean a=v.Isvalid();
		System.out.println(a);
	}

}
