package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.dto.StudentDto;

public class StudentDaoImpl implements IStudentDao {
	public static HashMap<String, String> collegeDetails = null;
	public static HashMap<Integer, StudentDto> studentDetails = null;
	static {
		studentDetails = new HashMap<>();
		collegeDetails = new HashMap<>();
		collegeDetails.put("delhi", "IIT-D");
		collegeDetails.put("hyderabad", "IIT-H");
		collegeDetails.put("chennai", "IIT-M");
		collegeDetails.put("bombay", "IIT-B");
		collegeDetails.put("banglore", "IISC");
	}


	@Override
	public int addStudentDetails(StudentDto student) {
		//System.out.println(collegeDetails);
		student.setCollegeName(collegeDetails.get(student.getCity()));
		 if(studentDetails.put(student.getId(),student) != null)
			 return 1;
		 else
			 return 0;
	}

	@Override
	public Map<String, String> getCollegeDetails() {
		return collegeDetails;
	}

	@Override
	public StudentDto getStatus(int id) {
		// TODO Auto-generated method stub
		return studentDetails.get(id);
	}
	
}
