package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.*;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("Varun");
		l.add("vamshi");
		l.add("vinod");
		//System.out.println(l);
		for(String s:l)
		{
		System.out.println(s);
		}
		Iterator<String> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
List<Integer> l1=new Vector<>();
l1.add(1);
l1.add(2);l1.add(3);l1.add(4);l1.add(5);l1.add(6);l1.add(7);
for(int s:l1)
{
System.out.println(s);
}
System.out.println("fd");
Iterator i1=l1.iterator();
while(i1.hasNext())
{
	System.out.println(i1.next());
}
LinkedList l2=new LinkedList<>();
l2.add(1);
l2.add(2);l2.add(3);l2.add(4);l2.add(5);l2.add(6);l2.add(7);
for(Object s:l2)
{
System.out.println(s);
}
System.out.println("fd");
Iterator i2=l2.iterator();
while(i2.hasNext())
{
	System.out.println(i2.next());
}
	}

}
