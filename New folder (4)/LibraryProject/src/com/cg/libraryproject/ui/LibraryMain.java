package com.cg.libraryproject.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.cg.libraryproject.dao.ILibraryDao;
import com.cg.libraryproject.dto.MemberDetails;
import com.cg.libraryproject.exception.LibraryException;
import com.cg.libraryproject.service.ILibraryService;
import com.cg.libraryproject.service.LibraryServiceImpl;

public class LibraryMain {

	public static void main(String[] args) throws LibraryException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		ILibraryService service = new LibraryServiceImpl();
		MemberDetails dto = new MemberDetails();
		System.out.println("1.view all details");
		System.out.println("2.pay amount");
		System.out.println("3.exit");
		int choice=0;
	
		do {
			System.out.println("enter your choice");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("enter id");
				String id = scanner.next();
				
				
				dto = service.viewDetails(id);
				if(dto == null) {
					System.out.println("not fiound");
				}
				else {
					System.out.println(dto.getMemberId());
					System.out.println(dto.getMemberName());
					System.out.println(dto.getAmount());
					if(dto.getAmount() < 0) {
						System.out.println("money not sufficient..pay fine");
					}
					else {
						System.out.println("money is suffcient");
					}
				}
				
				
				break;
			}
			case 2:
				System.out.println("enter id");
				String id = scanner.next();
				service.payAmount(id);
				break;
			
			case 3:
			    System.exit(0); 
			    break;
			}		
		}while(choice<=3);

	}

}
