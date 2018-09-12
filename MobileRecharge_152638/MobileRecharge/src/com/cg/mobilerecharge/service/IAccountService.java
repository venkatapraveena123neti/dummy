package com.cg.mobilerecharge.service;

import com.cg.mobilerecharge.bean.Account;
import com.cg.mobilerecharge.exception.Accountexception;

public interface IAccountService {

	public Account getAccountDetails(String mobileNo);

	public int rechargeAccount(String mobileNo, double rechargeAmount);

	public boolean validateMobileNumber(String mobileNo) throws Accountexception;

	public boolean validateRechargeAmount(double rechargeAmount) throws Accountexception;
}
