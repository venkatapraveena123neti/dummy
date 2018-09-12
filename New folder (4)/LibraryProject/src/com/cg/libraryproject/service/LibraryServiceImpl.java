package com.cg.libraryproject.service;

import java.util.HashMap;
import java.util.regex.Pattern;

import com.cg.libraryproject.dao.ILibraryDao;
import com.cg.libraryproject.dao.LibraryDaoImpl;
import com.cg.libraryproject.dto.MemberDetails;
import com.cg.libraryproject.exception.ILibraryException;
import com.cg.libraryproject.exception.LibraryException;

public class LibraryServiceImpl implements ILibraryService {
	ILibraryDao dao = new LibraryDaoImpl();

	@Override
	public MemberDetails viewDetails(String memberId) {
		// TODO Auto-generated method stub
		System.out.println("entered");
		if(!(Pattern.matches("[0-9a-zA-Z]+", memberId))) {
			try {
				throw new LibraryException(ILibraryException.ERROR1);
			} catch (LibraryException e) {
				System.out.println(e.getMessage());
			}
			}
		return dao.viewDetails(memberId);
	}

	@Override
	public void payAmount(String id) throws LibraryException {
		// TODO Auto-generated method stub
		if(Pattern.matches("[0-9a-zA-Z]+", id)) {
		dao.payAmount(id);
		}
		else {
			throw new LibraryException(ILibraryException.ERROR1);
		}
		
	}
	
	

	
	
	

}
