package com.cg.program.lab4_2;

public class SavingsAccount extends Account{
	final static long minbalance=1000;
	void withdraw(Account a,long amount)
	{
		if(a.balence>minbalance)
		{
			super.withdraw(amount);
		}
		
	}
}
