package com.cg.detaileddemo.ui;

import java.util.Scanner;

public class MyMainAplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printdetails();
		int choice=0;
		do {
			Scanner scr=new Scanner(System.in);
			System.out.println("ENTER CHOICE ");
			choice=scr.nextInt();
			switch(choice)
			{
			case 1:
				   System.out.println("enter product ID :  ");
				   int pID=scr.nextInt();
				   System.out.println("enter product Name :  ");
				   String pName=scr.next();
				   System.out.println("enter product price :  ");
				   double pPrice=scr.nextDouble();
				   
				   
		Product prod=new Product();
		prod.getProdID(pID);
		prod.getProdName(pName);
		prod.getProdPrice(pPrice);
		
				   
			}
		}while(choice!=5);

	}
	public static void printdetails()
	{
		System.out.println("1.enter choice ");
		System.out.println("2.enter product id");
		System.out.println("3.enter product name");
		System.out.println("4.enter product price");
		System.out.println("5.exit....");
		
	}

}
