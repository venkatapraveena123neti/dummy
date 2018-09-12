package com.cg.program.lab3_2;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean b=false;
		String input=s.nextLine();
		
		
		for(int i=0;i<input.length()-1;i++)
		{
			
		if((input.charAt(i+1)-input.charAt(i))<0)
			{
			b=true;
				System.out.println("Negative");
				break;
			}
		}
		if(!b)
			System.out.println("positive");
		s.close();
			
	}

}
