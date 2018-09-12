package com.cg.dao;

import java.util.HashMap;

import com.cg.dto.ExampleDto;

public class ExampleDaoImpl implements IExampleDao {
	public static HashMap<String, String> doctorDetails = null;
	public static HashMap<Integer, ExampleDto> patientDetails = null;
	static {
		doctorDetails = new HashMap<>();
		patientDetails = new HashMap<>();
		doctorDetails.put("A", "dr.avc");
		doctorDetails.put("B", "dr.avasfsfc");
		doctorDetails.put("C", "dr.sfnc");
		doctorDetails.put("D", "dr.asf");

	}

	@Override
	public HashMap<String, String> getDoctorDetails() {

		return doctorDetails;
	}

	@Override
	public void addPatient(ExampleDto dto) {
		patientDetails.put(dto.getPid(), dto);
		
	}

	@Override
	public HashMap<Integer, ExampleDto> getpatientDetails() {
		
		return patientDetails;
	}

}
