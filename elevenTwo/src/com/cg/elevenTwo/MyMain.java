package com.cg.elevenTwo;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter string");
		String s= scanner.next();
		IStringSpace sp=(str)->{
			return str.replace("", " ").trim();
		};
		System.out.println(sp.space(s));

	}

}
