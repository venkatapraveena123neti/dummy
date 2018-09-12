package com.cg.programs2_4;



public class personmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		person p=new person("varun","Puli",'m',Long.parseLong(args[0]));
		//long phone;
		//System.out.println("Enter phone number");
		//phone=s.nextLong();
		//p.setPhone(phone);
		p.show();
		//s.close();
	}

}
