package com.cg.program.lab4_2;

public class CurrentAccount extends Account {
int overdraftlimit=10000;
boolean  withdraw(Account a,long amount)
{
	if(amount>overdraftlimit)
		return true;
	else return false;
	
}
}
