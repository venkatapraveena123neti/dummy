package com.cg.service;

import java.time.LocalDate;

import com.cg.dto.StudentDto;
import com.cg.studentproject.exception.StudentException;

public interface IStudentService {

	public int addStudentDetails(StudentDto student);

	StudentDto getStatus(int id);

	public void validatename(String name) throws StudentException;

	public  void validatephnNum(String name) throws StudentException;

	public void validatemail(String name) throws StudentException;

	//public void validateage(int age) throws StudentException;

	public void validateage(String name) throws StudentException;

	public void validategender(String name) throws StudentException;

	public void validateDate(LocalDate myDate) throws StudentException;

	//pvoid validateage(String name) throws StudentException;

}
