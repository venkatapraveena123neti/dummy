package com.cg.demoone.ui;

public class MyMain {

	public static void main(String[] args) {
		int a,b;
		int []c= {1,2,3,5,6,7,8,9};
		Calculator c1=new Calculator();
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
			for(int i:c)
			{
				System.out.println(i);
			}
			for(int i=0;i<c.length;i++)
                 System.out.println(c[i]);
			int i=0;
			while(i<8)
			{
				System.out.println(c[i]);
				i++;
			}
		System.out.println("sum is "+c1.add(a,b)+ " difference is "+ c1.sub(a,b)+" multiplication is "+ c1.mul(a,b) +" division is "+ c1.div(a,b) );
	}

}
