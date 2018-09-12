package com.cg.DemoTen.ui;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.cg.DemoTen.dto.Product;

public class MyMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product proone=new Product();
		proone.setProdid(10001);
		proone.setProdname("lg");
		proone.setProdprice(1181.11);
		
		Product protwo=new Product();
		protwo.setProdid(10008);
		protwo.setProdname("lg");
		protwo.setProdprice(1181.11);
		
		Product prothree=new Product();
		prothree.setProdid(10011);
		prothree.setProdname("lg");
		prothree.setProdprice(1181.11);
	
		
		
		
     /* Map<Integer,String> myMap=new HashMap<>();
      myMap.put(1, "abcd");
      myMap.put(2,"life");
      myMap.put(3,"veena");
      */
		 Map<Integer,Product> myMap=new HashMap<>();
	      myMap.put(1, protwo);
	      myMap.put(3,prothree);
      System.out.println(myMap);
      System.out.println(myMap.keySet());//give all keys
      System.out.println(myMap.get(2));
      System.out.println(myMap.values());//all values
      System.out.println("____________________for loop_=====================");
      
      for(Integer keys:myMap.keySet())
      {
    	  System.out.println("Keys are:"+keys+"Values "+myMap.get(keys));
      }
      for(Integer keys:myMap.keySet())
      {
    	  System.out.println(myMap.get(keys).getProdid());
    	  System.out.println(myMap.get(keys).getProdname());
    	  System.out.println(myMap.get(keys).getProdprice());
    	  
      }
      System.out.println("____________________Iterator=====================");
      
    //  Iterator it=myMap.iterator(); error becoz map is not part of collection but list nd set are part of collection
      //convert to set wid help of keyset...keyset will only convert keys entryset will convert evrythng
      
      Set myData=myMap.entrySet();
      Iterator it=myData.iterator();
      
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
      System.out.println("============================");
      //Collections.sort(myMap);
      
   //    Set<Product> trgtset=new HashSet<>(myMap.values());
      Collection<Product> mySet=myMap.values();    
      //Set<Product> sett=new TreeSet<>(mySet);
      List<Product> myList=new LinkedList<>(mySet);
      Collections.sort(myList);
   
           /*   for(Product prod:myList)
              {
            	  System.out.println(prod.getProdid());
            	  System.out.println(prod.getProdname());
            	  System.out.println(prod.getProdprice());
              }

      */
         Iterator it1=myData.iterator();
      
      while(it1.hasNext())
      {
    	  System.out.println(it1.next());
      }
      Map mp=new HashMap<>();
      mp.put(null,null);
      mp.put(1, null);
      mp.put(2, null);
      mp.put(null,null);
      System.out.println(mp);
      //is same above snippet written with map mp=new HashTable<>()  it will giv nullpointer exception
      
	}

}
