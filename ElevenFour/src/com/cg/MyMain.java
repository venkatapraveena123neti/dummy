package com.cg;

import java.util.function.BiFunction;

public class MyMain {

	public static void main(String[] args) {
		BiFunction<Integer, String, String> employee= new Employee()::view;
		
		System.out.println(employee.apply(101, "Sneha"));

	}

}
