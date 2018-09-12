package com.cg.programs1;

public class MyMain {

	public static void main(String[] args) {
	Person p=new Person();
	p.First_Name=args[0];
	p.Name=args[1];
	p.Gender=args[2].charAt(0);
	p.Age=Integer.parseInt(args[3]);
	p.Weight=Float.parseFloat(args[4]);
	p.show();
	
	

	}

}
