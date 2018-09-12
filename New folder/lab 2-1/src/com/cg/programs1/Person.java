package com.cg.programs1;

public class Person {

public String First_Name;
public  String Name;
public char Gender;
public int Age;
public float Weight;
public Person()
{
	
}
public Person(String First_Name, String Name,char Gender, int Age, float Weight)
{
	this.First_Name= First_Name;
	this.Name=Name;
	this.Gender=Gender;
	this.Age=Age;
	this.Weight=Weight;
}
public void show()
{
	System.out.println("First Name:"+ First_Name +"\nLast Name:"+ Name + "\nGender:"+ Gender + "\nAge:"+ Age +"\nWeight:"+ Weight);
}

}
