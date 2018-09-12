package com.cg.program.lab4_1;

import java.util.Random;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		Account p=new Person("smith",20);
		p.setAccno(rand.nextLong());
		p.setBalence(2000);
		Account p1=new Person("kathy",20);
		p1.setAccno(rand.nextLong());
			p1.setBalence(3000);
p.deposit(2000);
p1.withdraw(2000);
System.out.println(p);
System.out.println(p1);

	}

}
