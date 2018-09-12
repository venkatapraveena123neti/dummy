package com.cg.program.lab3_1;

import java.util.Scanner;

public class Stringdemo {
	Scanner s=new Scanner(System.in);
public void add()
{
	
			StringBuffer string=new StringBuffer();
			string.append(s.nextLine());
	
	System.out.println(string.append(string)) ;
	
}

public void replace()
{
	
StringBuffer string=new StringBuffer();
string.append(s.nextLine());
	for(int i=0;i<string.length();i++)
	{
		if(i%2!=0)
			string.setCharAt(i,'#');
	}
	System.out.println(string) ;
	
}
public  void duplicate()
{
	StringBuffer string=new StringBuffer();
	string.append(s.nextLine());
	StringBuffer sb=new StringBuffer();
	boolean seen[]=new boolean[256];
	for(int i=0;i<string.length();i++)
	{
		char ch=string.charAt(i);
		if(!seen[ch])
		{
			seen[ch]=true;
			sb.append(ch);
		}
	}
	//sb.toString();
	System.out.println(sb) ;
	
	
}
public void upper()
{
	
StringBuffer string=new StringBuffer();
string.append(s.nextLine());
	for(int i=0;i<string.length();i++)
	{
		if(i%2!=0)
			string.setCharAt(i,Character.toUpperCase(string.charAt(i)));
	}
	System.out.println(string) ;
	
}
}

