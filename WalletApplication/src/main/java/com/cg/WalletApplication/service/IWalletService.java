package com.cg.WalletApplication.service;

import java.math.BigDecimal;

import com.cg.WalletApplication.Exception.BankException;
import com.cg.WalletApplication.bean.Wallet;

public interface IWalletService {


	void checkName(String name) throws BankException;

	void checkMobileNumber(String mobileNumber) throws BankException;

	void checkPassword(String password) throws BankException;

	void checkEmail(String emailId) throws BankException;

	String addCustomer(Wallet wallet);

	Wallet showBalance(String mobileNum, String password);

	Wallet check(String mobileNum, String password);

	void deposit(Wallet wallet, BigDecimal amount);

	boolean withDraw(Wallet wallet, BigDecimal amount);

	boolean isFound(String receiverMobile);

	boolean transfer(String senderMobile, String receiverMobile, BigDecimal amount) throws InterruptedException;

}
