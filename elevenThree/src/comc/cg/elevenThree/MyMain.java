package comc.cg.elevenThree;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		ILogin login=(uName,password)->{
			if(uName.equals("admin") && password.equals("admin"))
				return true;
				else
					return false;
			
		};
		
		
		
		
		Scanner scanner= new  Scanner(System.in);
		System.out.println("enter username");
		String uName=scanner.next();
		System.out.println("enter password");
		String password=scanner.next();
System.out.println(login.validate(uName, password));
	}
	

}
