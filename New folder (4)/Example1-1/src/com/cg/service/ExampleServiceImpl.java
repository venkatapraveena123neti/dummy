package com.cg.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.dao.ExampleDaoImpl;
import com.cg.dao.IExampleDao;
import com.cg.dto.ExampleDto;
import com.cg.exception.PatientException;

public class ExampleServiceImpl implements IExampleService {
	IExampleDao iExampleDao = new ExampleDaoImpl();

	@Override
	public void checkName(String name) throws PatientException {
		Pattern pattern = Pattern.compile("^[a-z A-Z .]{1,}$");
		Matcher matcher = pattern.matcher(name);
		if (!matcher.matches()) {
			throw new PatientException("Enter a valid name");

		}

	}

	@Override
	public void checkage(int age) throws PatientException {
		if (!(age > 1 && age <= 100)) {
			throw new PatientException("enter the valid age");
		}
	}

	@Override
	public void checkGender(char charAt) throws PatientException {
		Pattern pattern = Pattern.compile("^[M,m,F,f]$");
		Matcher matcher = pattern.matcher(Character.toString(charAt));
		if (!matcher.matches()) {
			throw new PatientException("Enter a valid gender");

		}

	}

	@Override
	public void checkDate(String date) throws PatientException {
		Pattern pattern = Pattern.compile("^dd/MM/yyyy$");
		Matcher matcher = pattern.matcher(date);
		if (!matcher.matches()) {
			throw new PatientException("Enter a valid date");

		}

	}

	@Override
	public boolean addPatient(ExampleDto dto) {
		boolean assigned = false;
		HashMap<String, String> doctDetails = iExampleDao.getDoctorDetails();
		if (doctDetails.containsKey(dto.getPdisease())) {
			int random = (int) Math.abs(Math.random() * 1000);
			dto.setPid(random);
			dto.setDoct(doctDetails.get(dto.getPdisease()));
			iExampleDao.addPatient(dto);
			System.out.println("generated patient id is " + random);
			assigned = true;
		}
		return assigned;

	}

	@Override
	public ExampleDto getDetails(int id) {
		ExampleDto patient = null ;
		HashMap<Integer, ExampleDto> patDetails = iExampleDao.getpatientDetails();
		if (patDetails.containsKey(id)) {
			patient = patDetails.get(id);
		}
return patient ;
			
	}

}
