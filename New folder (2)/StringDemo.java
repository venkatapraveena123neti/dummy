package com.cg.programs7;

import java.util.ArrayList;
import java.util.Scanner;

public class StringDemo {
	public ArrayList<String> c=new ArrayList<String>();
	
public  void alternate(String a,String b)
{
	String replace="";
	
	for(int i=0;i<a.length();i++)
	{
		char ch=a.charAt(i);
		if(i%2==0)
		{
		replace+=ch;	
		}
		else
			replace+=b;
	}
	c.add(replace);
}
public  void lastoccurance(String a,String b)
{
	int count=0;
	int lastIndex=a.length();
	while(lastIndex!=-1)
	{
		lastIndex=a.lastIndexOf(b, lastIndex);
		
		if(lastIndex!=-1)
		{
			
			count++;
			//System.out.println(count);
			lastIndex=lastIndex-b.length();
		}
	}
	//System.out.println(a.replaceFirst(b, ""));
	if(count>=2)
	{
		
		int index=a.lastIndexOf(b);
		//System.out.println(index);
		c.add(a.substring(0, index));
	}
	else
		c.add(a+b);
}
public  void delfirstoccurance(String a,String b)
{
	int count=0;
	int lastIndex=0;
	while(lastIndex!=-1)
	{
		lastIndex=a.indexOf(b, lastIndex);
		if(lastIndex!=-1)
		{
			
			count++;
			//System.out.println(count);
			lastIndex=lastIndex+b.length();
		}
	}
	//System.out.println(a.replaceFirst(b, ""));
	if(count>=2)
	{
		c.add(a.replaceFirst(b, ""));
	}
	else
		c.add(a);
}
public  void twohalves(String a,String b)
{
	int length=b.length();
	String string=b.substring(0, length/2)+a+b.substring((length/2), length);
	c.add(string);
}
public void contains(String a,String b)
{
	String contains="";
	boolean flag=false;
	for(int i=0;i<a.length();i++)
	{
		//char ch=b.charAt(i);
		flag=false;
		for(int j=0;j<b.length();j++)
		{
			if(a.charAt(i)==b.charAt(j))
			{
				contains+="*";
	        flag = true;
			}
			
		}
		if(flag==false)
		{
			
				contains+=(a.charAt(i));
	}
	}
	c.add(contains);

}
public void display()
{
	System.out.println(c);
}
	public static void main(String[] args) {
		
		StringDemo temp=new StringDemo();
		String a,b;
		System.out.println("enter two strings");
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		b=s.nextLine();
		temp.alternate(a, b);
		temp.lastoccurance(a, b);
		temp.delfirstoccurance(a, b);
		temp.twohalves(a, b);
		temp.contains(a, b);
		temp.display();
		s.close();
	}
	
}
