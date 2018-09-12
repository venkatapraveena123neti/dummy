package com.cg.elevenOne;

public class MyMain {
	public static void main(String[] args) {

		IPower power = (int a, int b) -> {int c= (int) Math.pow(a, b);System.out.println(c); return c;};
		power.computeTest(2, 2);
		
		}
		
	}

