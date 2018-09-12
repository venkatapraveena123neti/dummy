package com.cg.SampleStatic.ui;



enum Months {Jan(31),Feb(28),Mar(31),Apr(30);
	int day;
	Months(int d)
	{
		this.day=d;
	}
}
public class MyEnum {
	public static void main(String[] args)
	{
		Months mon=null;
		Gender gen=null;
		System.out.println(mon.Mar.day);
		System.out.println(gen.Male.g);
	}
	enum Gender{Male("male"), Female("female");
		String g;
		Gender(String g)
		{
			this.g=g;
		}
	}

}
