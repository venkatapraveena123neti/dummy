package com.cg.dto;

import java.time.LocalDate;

public class StudentDto {
	private int id;
	private String phoneNumber;
	private String email;
	private String age;
	private String name;
	private String gender;
	private String status = "Not Approved";
	private String city;
	private LocalDate dob;
	private String yearOfPass;
public String getYearOfPass() {
		return yearOfPass;
	}

	public void setYearOfPass(String yearOfPass) {
		this.yearOfPass = yearOfPass;
	}

private String collegeName;
	public int getId() {
		return id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender2) {
		this.gender = gender2;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}