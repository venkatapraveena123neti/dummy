package com.cg.WalletApplication.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.WalletApplication.Exception.BankException;
import com.cg.WalletApplication.Exception.IBankException;
import com.cg.WalletApplication.bean.Wallet;
import com.cg.WalletApplication.dao.IWalletDao;
import com.cg.WalletApplication.dao.WalletDaoImpl;

public class WalletServiceImpl implements IWalletService{
	static IWalletDao iWalletDao=new WalletDaoImpl();
	public static TreeMap<String,Wallet> customerDetails=null; 
	static{
		customerDetails=iWalletDao.getDetails();
		
	}
	public void checkName(String name) throws BankException {
	Pattern pattern=Pattern.compile("[a-zA-Z]{1,}");
	Matcher matcher=pattern.matcher(name);
	if(!(matcher.matches()))
	{
		throw new BankException(IBankException.nameException);
	}
	}

	public void checkMobileNumber(String mobileNumber) throws BankException {
		
		Pattern pattern=Pattern.compile("[7-9]{1}[0-9]{9}");
		Matcher matcher=pattern.matcher(mobileNumber);
		if(!(matcher.matches()))
		{
			throw new BankException(IBankException.mobileNumberException);
		}
		}

	public void checkPassword(String password) throws BankException {
		Pattern pattern=Pattern.compile(".*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*"
				+ "");
		Matcher matcher=pattern.matcher(password);
		if(!(matcher.matches()))
		{
			throw new BankException(IBankException.passwordException);
		}
		
	}

	public void checkEmail(String emailId) throws BankException {
		Pattern pattern=Pattern.compile("[a-z]{1}[a-z0-9._]{1,}@[a-zA-Z0-9]{1,}.com");
		Matcher matcher=pattern.matcher(emailId);
		if(!(matcher.matches()))
		{
			throw new BankException(IBankException.emailIdException);
		}
		
	}

	public String addCustomer(Wallet wallet) {
		String result=null;
	if(!customerDetails.containsKey(wallet.getMobileNumber()))
	{
		return iWalletDao.addCustomer(wallet);
	}
		
	return result;
	}

	public Wallet showBalance(String mobileNum, String password) {
		Wallet result = null;
		if(customerDetails.containsKey(mobileNum))
		{
			if(customerDetails.get(mobileNum).getPassword().equals(password))
			{
				result = customerDetails.get(mobileNum);
			}
		}
			return result;
	}

	public Wallet check(String mobileNum, String password) {
		Wallet result = null;
		if(customerDetails.containsKey(mobileNum))
		{
			if(customerDetails.get(mobileNum).getPassword().equals(password))
			{
				result = customerDetails.get(mobileNum);
			}
		}
			return result;
	}

	public void deposit(Wallet wallet, BigDecimal amount) {
		
		wallet.setBalance(wallet.getBalance().add(amount));
		wallet.transactions.put(LocalDateTime.now(), "Credited " + amount);
		
	}

	public boolean withDraw(Wallet wallet, BigDecimal amount) {
		boolean result = false;
		if(wallet.getBalance().subtract(amount).compareTo(BigDecimal.valueOf(0.0))>=0){
			wallet.setBalance(wallet.getBalance().subtract(amount));
			result = true;
			wallet.transactions.put(LocalDateTime.now(), "Debited " + amount);
		}
		return result;
	}

	public boolean isFound(String receiverMobile) {
		boolean result = false;
		if(customerDetails.containsKey(receiverMobile)) {
			result= true;
			
		}
		return result;
	}

	public boolean transfer(String senderMobile, String receiverMobile, BigDecimal amount) throws InterruptedException {
		boolean result = false;
		if(customerDetails.get(senderMobile).getBalance().subtract(amount).compareTo(BigDecimal.valueOf(0.0))>=0)
		{
			Wallet sender = customerDetails.get(senderMobile);
			sender.setBalance(sender.getBalance().subtract(amount));
			sender.transactions.put(LocalDateTime.now(), "Debited " + amount + " to " + receiverMobile);
			Wallet receiver = customerDetails.get(receiverMobile);
			Thread.sleep(100);
			receiver.setBalance(receiver.getBalance().add(amount));
			receiver.transactions.put(LocalDateTime.now(), "Credited " + amount + " from " + senderMobile);
			result = true;
		}
		return result;
	}

	



	}


