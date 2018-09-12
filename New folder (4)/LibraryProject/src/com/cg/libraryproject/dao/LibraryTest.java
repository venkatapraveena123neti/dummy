package com.cg.libraryproject.dao;





import org.junit.Test;

import com.cg.libraryproject.exception.LibraryException;
import com.cg.libraryproject.service.ILibraryService;
import com.cg.libraryproject.service.LibraryServiceImpl;


public class LibraryTest {

	
	ILibraryService ilibraryservice=new LibraryServiceImpl();
	
	 @Test(expected=LibraryException.class)
     public void tetforwrongId() throws LibraryException
     {
		 ilibraryservice.payAmount("2017");
     }
	 
	 @Test()
     public void tetforcrctId() throws LibraryException
     {
		 ilibraryservice.payAmount("2010a");
     }
     
}
