package com.cg.programs3;

public class Person {
private String First_Name;
public String getFirst_Name() {
	return First_Name;
}
public void setFirst_Name(String first_Name) {
	First_Name = first_Name;
}
public String getLast_Name() {
	return Last_Name;
}
public void setLast_Name(String last_Name) {
	Last_Name = last_Name;
}
public char getGender() {
	return Gender;
}
public void setGender(char gender) {
	Gender = gender;
}
private String Last_Name;
private char Gender;
private long phone;
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}

public Person( String First_Name,String Last_Name,char Gender)
{
	this.First_Name=First_Name;
	this.Last_Name=Last_Name;
	this.Gender=Gender;
}
public void show()
{
	System.out.println("First Name: "+ First_Name +"\nLast Name "+ Last_Name + "\nGender: "+ Gender);
}

}
