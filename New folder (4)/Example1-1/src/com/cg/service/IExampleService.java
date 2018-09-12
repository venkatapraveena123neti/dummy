package com.cg.service;

import com.cg.dto.ExampleDto;
import com.cg.exception.PatientException;

public interface IExampleService {

	void checkName(String name) throws PatientException;

	void checkage(int age) throws PatientException;

	

	void checkGender(char charAt) throws PatientException;

	void checkDate(String date) throws PatientException;

	boolean addPatient(ExampleDto dto);

	ExampleDto getDetails(int id);

}
