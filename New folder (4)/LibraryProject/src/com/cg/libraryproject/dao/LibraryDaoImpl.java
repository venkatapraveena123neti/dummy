package com.cg.libraryproject.dao;

import java.util.HashMap;

import java.util.Scanner;

import com.cg.libraryproject.dto.MemberDetails;

public class LibraryDaoImpl implements ILibraryDao{
  static HashMap<String,MemberDetails> details =  null;
  MemberDetails det = new MemberDetails();
	
	//public HashMap<String,MemberDetails> getDetails(){
  static {
	  details = new HashMap<>();
	MemberDetails mem = new MemberDetails();
	MemberDetails mem1 = new MemberDetails();
	MemberDetails mem2 = new MemberDetails();
	MemberDetails mem3 = new MemberDetails();
	
	mem.setMemberId("2010a");
	mem.setMemberName("veena");
	mem.setAmount(100.00);
	mem1.setMemberId("2011b");
	mem1.setMemberName("pavan");
	mem1.setAmount(200.00);
	mem2.setMemberId("2012c");
	mem2.setMemberName("lakshmi");
	mem2.setAmount(300.00);
	mem3.setMemberId("2013d");
	mem3.setMemberName("pavan");
	mem3.setAmount(400.00);
	
	details.put(mem.getMemberId(),mem);
	details.put(mem1.getMemberId(),mem1);
	details.put(mem2.getMemberId(),mem2);
	details.put(mem3.getMemberId(),mem3);
  }
	//return details;
	
	//}

	
	@Override
	public MemberDetails viewDetails(String memberId) {
		
		for (String iterable_element : details.keySet()) {
			if(iterable_element.equals(memberId));
			return details.get(memberId);
			
		}
		return null;
	}

	@Override
	public void payAmount(String memberId) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//System.out.println(memberId);
		
		
		if(details.containsKey(memberId))
		{
		for (String it : details.keySet()) {
			if(it.equals(memberId)) {
				System.out.println("enter deposit amount:");
				double amt = scan.nextDouble();
				det = details.get(it);
				String amount = String.valueOf(amt);
				if(amount.matches("\\d+.\\d{2}+")) 
				
				det.setAmount(amt+det.getAmount());
			}
			
		}
		}
	}
	
	
   

	
	
	

}
