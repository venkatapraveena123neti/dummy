package com.cg.programs2_5;

public class Person {
private String First_Name;
public enum Gender{M,F};
private Gender gender;
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
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

private String Last_Name;


private long phone;
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public Person()
{

}
public Person( String First_Name,String Last_Name,Gender gender,long phone)
{
	this.First_Name=First_Name;
	this.Last_Name=Last_Name;
	this.gender=gender;
	this.phone=phone;
}
public void show()
{
	System.out.println("First Name: "+ First_Name +"\nLast Name "+ Last_Name + "\nGender: "+ gender+" \nPhone_Number "+ phone);
}

}
