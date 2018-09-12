package com.cg.programs2_5;



import com.cg.programs2_5.Person.Gender;



public class PersonMain {

	public static void main(String[] args) {
		
	Person p=new Person("varun","Puli",Gender.M,Long.parseLong(args[0]));
		
		p.show();
		
	}

}

