package com.cg.mobilerecharge.bean;

public class Account {
	/* - Description : Account attributes*/
	private String mobileNo;
	private String accountType;
	private String customerName;
	private double accountbalance;
	/* - Description : Non Parametrized Constructor*/
	public Account() {

	}
	/* - Description :  Parametrized Constructor*/
	public Account(String mobileNo, String accountType, String customerName, double accountbalance) {
		super();
		this.mobileNo = mobileNo;
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountbalance = accountbalance;
	}
	
	/* - Description :Getter & Setter for all attributes*/
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAccountbalance() {
		return accountbalance;
	}

	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}

}
