package com.cg.program.lab4_1;

public class Account {
	public void deposit(long l)
	{
		this.balence+=l;
	}
	public void withdraw(long l)
	{
		this.balence-=l;
	}
	public double balance() {
		return balence;
	}
long accno;

public long getAccno() {
	return accno;
}
public void setAccno(long accno) {
	this.accno = accno;
}
public double getBalence() {
	return balence;
}
public void setBalence(double balence) {
	this.balence = balence;
}
/*public Person getAccHolder() {
	return accHolder;
}
public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}*/
double balence;
//Person accHolder;
}
