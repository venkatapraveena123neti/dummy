package com.cg.WalletApplication.bean;

import java.math.BigDecimal;

public class Wallet extends Customer{
	
	private BigDecimal balance=BigDecimal.valueOf(0.0);
	
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
