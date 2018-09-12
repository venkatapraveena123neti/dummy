package com.cg.libraryproject.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.libraryproject.dto.MemberDetails;
import com.cg.libraryproject.exception.LibraryException;

public interface ILibraryService {
	public MemberDetails viewDetails(String memberId);
	public void payAmount(String id) throws LibraryException;
}
