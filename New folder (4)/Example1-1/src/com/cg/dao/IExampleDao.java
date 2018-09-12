package com.cg.dao;

import java.util.HashMap;

import com.cg.dto.ExampleDto;

public interface IExampleDao {

	

	HashMap<String, String> getDoctorDetails();

	void addPatient(ExampleDto dto);

	HashMap<Integer, ExampleDto> getpatientDetails();

}
