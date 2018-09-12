package com.cg.program.lab3_6;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Zoneid {
	public void timezone()
	{
		Scanner s=new Scanner(System.in);
				System.out.println("enter zone id");
				String str=s.nextLine();
				
				ZonedDateTime z=ZonedDateTime.now(ZoneId.of(str));
				System.out.println(z);
				s.close();
		
	}

}
