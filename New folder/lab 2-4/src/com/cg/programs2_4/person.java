package com.cg.programs2_4;

public class person {
private String First_Name;
private String Last_Name;
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

private char Gender;
private long Phonenumber;

public person()
{

}
public person( String First_Name,String Last_Name,char Gender,long Phonenumber )
{
	this.First_Name=First_Name;
	this.Last_Name=Last_Name;
	this.Gender=Gender;
	this.Phonenumber=Phonenumber;
}
public void show()
{
	System.out.println("First Name: "+ First_Name +"\nLast Name "+ Last_Name + "\nGender: "+ Gender+ "\nPhone number"+Phonenumber);
}
public long getPhonenumber() {
	return Phonenumber;
}
public void setPhonenumber(long phonenumber) {
	Phonenumber = phonenumber;
}

}
