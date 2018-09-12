package com.cg.dao;

import java.util.Map;

import com.cg.dto.StudentDto;

public interface IStudentDao {
	public int addStudentDetails(StudentDto student);
	public Map<String, String> getCollegeDetails() ;
	public StudentDto getStatus(int id);
}