package com.cg.libraryproject.dao;

import java.util.HashMap;

import com.cg.libraryproject.dto.MemberDetails;

public interface ILibraryDao {
	public MemberDetails viewDetails(String memberId);
	public void payAmount(String memberId);

}
