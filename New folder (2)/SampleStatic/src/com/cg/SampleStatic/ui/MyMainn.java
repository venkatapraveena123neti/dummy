package com.cg.SampleStatic.ui;

public class MyMainn {
	static int dataa=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    System.out.println(dataa);
    getData();
    
	}


 public static void getData()
 {
	 System.out.println("In static");
	
 }
 static
 {
	 System.out.println("Hi Veena");
 }
 public  void showData()
 {
	 System.out.println("In non static");
	 getData();
	 System.out.println(dataa);
 }
 
}