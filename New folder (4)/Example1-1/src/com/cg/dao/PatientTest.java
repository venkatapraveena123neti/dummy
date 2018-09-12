package com.cg.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



import java.util.HashMap;

import org.junit.Test;

import com.cg.dto.ExampleDto;

public class PatientTest {
	IExampleDao doctor = new ExampleDaoImpl();
	
@Test
public void testGetDoctorDetails()
{
	
	HashMap<String, String> docDetails = doctor.getDoctorDetails();
	assertEquals("dr.avc", docDetails.get("A"));
}
@Test
public void testGetPatientDetails()
{
	ExampleDto patient = new ExampleDto();
	patient.setPgender('m');
	patient.setPdisease("A");
	patient.setPname("abc");
	patient.setPage(20);
	
	doctor.addPatient(patient);
	HashMap<Integer, ExampleDto> docDetails = doctor.getpatientDetails();
	assertNotNull(docDetails);
}
	

}
