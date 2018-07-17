package com.cg.WalletApplication.bean;

import java.time.LocalDateTime;
import java.util.TreeMap;

public class Customer {
	private String mobileNumber;
	private String name;
	
	private String password;
	private String EmailId;
	public  TreeMap<LocalDateTime, String> transactions = new TreeMap<LocalDateTime, String>();

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public TreeMap<LocalDateTime, String> getTransactions() {
		return transactions;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
