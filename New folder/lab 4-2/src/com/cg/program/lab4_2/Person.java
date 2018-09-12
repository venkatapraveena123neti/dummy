package com.cg.program.lab4_2;

public class Person extends Account {
	private String name;
	private int age;
	
	public Person(String string, int i) {
		this.name=string;
		this.age=i;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", accno=" + accno + ", balence=" + balence +  "]";
	}

	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
