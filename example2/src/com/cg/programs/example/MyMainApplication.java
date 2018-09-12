package com.cg.programs.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MyMainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer,String> mymap=new HashMap<Integer, String>();
		mymap.put(10, "nani");
		mymap.put(1, "varun");
		
		mymap.put(3, "prabhas");
		System.out.println(mymap.get(2));
		System.out.println(mymap);
		System.out.println(mymap.keySet());
		System.out.println(mymap.values());
		Set<Integer> mydata=mymap.keySet();
		Set<Entry<Integer, String>> mydata1=mymap.entrySet();
		
		for(Integer keys:mymap.keySet())
		{
			System.out.println("keys are "+keys+" value is "+mymap.get(keys));
		}
		Iterator<Integer> i=mydata.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		Iterator<Entry<Integer, String>> i1=mydata1.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
	}

}
