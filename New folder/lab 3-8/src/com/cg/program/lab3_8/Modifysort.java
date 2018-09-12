package com.cg.program.lab3_8;

import java.util.Scanner;

public class Modifysort {

public int n;

public String s[] ;

public void input()

{

Scanner scr=new Scanner(System.in);

System.out.println("enter no of elements:\n");

n=scr.nextInt();

s=new String[n];

for(int i=0;i<n;i++)

{

System.out.println("enter string :");

s[i]=scr.next();

}

scr.close();

}

public void sort()

{

for(int i=0;i<n-1;i++)

{

for(int j=1;j<n;j++)

{

if((s[i].charAt(0))>(s[j].charAt(0)))

{

String temp=s[i];

s[i]=s[j];

s[j]=temp;

}

}

}

}

public void changetoupper()

{

if(n%2==1)

{

for(int i=0;i<((n/2)+1);i++)

{

s[i]=s[i].toUpperCase();

}

}

else

{

for(int i=0;i<((n/2));i++)

{

s[i]=s[i].toUpperCase();

}

}

}

public void print()

{

for(int i=0;i<n;i++)

{

System.out.println(s[i]);

}

}

}