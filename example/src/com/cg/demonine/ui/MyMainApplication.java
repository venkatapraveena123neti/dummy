package com.cg.demonine.ui;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.cg.demonine.dto.Product;

public class MyMainApplication implements Comparator<Product> {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p=new Product();
p.setProdid(1095);
p.setProdName("lg");
p.setProdPrice(2000);
Product p1=new Product();
p1.setProdid(1052);
p1.setProdName("mi");
p1.setProdPrice(5000);
Product p2=new Product();
p2.setProdid(1083);
p2.setProdName("sony");
p2.setProdPrice(1000);
List<Product> l=new LinkedList<>();
l.add(p);
l.add(p1);
l.add(p2);
Map<Integer,Product> mymap=new HashMap<Integer, Product>();
mymap.put(1, p);
mymap.put(2, p1);
mymap.put(3, p2);
Set<?> set=mymap.entrySet();
Iterator<?> i=set.iterator();


while(i.hasNext())
{
System.out.println(i.next());
}


for(Integer i1:mymap.keySet())
{
	System.out.println(mymap.get(i1).getProdid()+" "+mymap.get(i1).getProdName()+" "+mymap.get(i1).getProdPrice());
}
Collection<Product> myset=mymap.values();
Set<Product> mylist=new TreeSet<Product>(myset);
//Collections.sort(mylist);
for(Product prod:mylist)
{
	System.out.println("poductid"+prod.getProdid()+"product name"+prod.getProdName()+"prod price"+prod.getProdPrice());
}

//}


//System.out.println(myma);
	}

	
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}
