package com.cg.service;

import java.time.LocalDate;
import java.util.Map;
import java.util.regex.Pattern;

import com.cg.dao.IStudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.dto.StudentDto;
import com.cg.studentproject.exception.IStudentException;
import com.cg.studentproject.exception.StudentException;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao;

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public int addStudentDetails(StudentDto student) {
		
		int result = -1;
	
		Map<String, String> collegeDetails = dao.getCollegeDetails();
		if (collegeDetails.containsKey(student.getCity())) {
			int generatedId =(int)( Math.abs( Math.random() * 100000));
			System.out.println(" "+generatedId);
			student.setId(generatedId);
			student.setStatus("Approved");
		
			if (dao.addStudentDetails(student)==0) {
				//System.out.println(student.getId());
				result = generatedId;
				System.out.println(" "+generatedId);
			}
               
		}
		else {
			int generatedId =(int)( Math.abs( Math.random() * 100000));
			System.out.println(" "+generatedId);
			student.setId(generatedId);
			student.setStatus(" Not Approved");
		
			if (dao.addStudentDetails(student)==0) {
				//System.out.println(student.getId());
				result = generatedId;
				System.out.println(" "+generatedId);
			}
		}
	
		return result;
	}

	@Override
	public StudentDto getStatus(int id) {
		return  dao.getStatus(id);
	}

	@Override
	public void validatename(String name) throws StudentException {
		// TODO Auto-generated method stub
		
		if(!(Pattern.matches("[A-Z]{1}[a-zA-Z]+", name)))
				{
			          throw new StudentException(IStudentException.ERROR1);
				}
	
	}
	

	@Override
	public void validatephnNum(String name) throws StudentException {
		// TODO Auto-generated method stub
	
		if(!(Pattern.matches("[7-9]{1}[0-9]{9}", name)))
				{
			          throw new StudentException(IStudentException.ERROR3);
				}
		
	}

	@Override
	public void validatemail(String name) throws StudentException {
		// TODO Auto-generated method stub
		if(!(Pattern.matches("[a-z]+@gmail.com", name)))
		{
	          throw new StudentException(IStudentException.ERROR4);
		}
		
	}

	@Override
	public void validateage(String name) throws StudentException {
		// TODO Auto-generated method stub
		if(!(Pattern.matches("[0-9]{2}", name)))
		{
	          throw new StudentException(IStudentException.ERROR5);
		}
	
	}

	

	@Override
	public void validategender(String name) throws StudentException {
		// TODO Auto-generated method stub
		 if(!("male".equals(name)|| "female".equals(name))) 
		 {
			 throw new StudentException(IStudentException.ERROR6);
		 }
		
	}

	@Override
	public void validateDate(LocalDate myDate) throws StudentException {
		// TODO Auto-generated method stub
		/*
		   String name=.next().trim();
		 
		    Pattern pattern=Pattern.compile("[a-zA-Z]+");
		    		Matcher matcher=pattern.matcher(myDate);
		    if(matcher.matches())
		    {
		    	System.out.println("success");
		    }
		    else
		    {
		    	 throw new StudentException(IStudentException.ERROR2);
		    }*/
		LocalDate today=LocalDate.now();
		
		   if(myDate.compareTo(today)<0) {
			   System.out.println("please enter date after today's date");
			   throw new StudentException(IStudentException.ERROR2);
		   }
		
		}

	}

