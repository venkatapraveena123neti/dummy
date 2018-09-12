package com.cg.mobilerecharge.service;

import com.cg.mobilerecharge.bean.Account;
import com.cg.mobilerecharge.dao.AccountDaoImpl;
import com.cg.mobilerecharge.dao.IAccountDao;
import com.cg.mobilerecharge.exception.Accountexception;
import com.cg.mobilerecharge.exception.IAccountexception;

public class AccountServiceimpl implements IAccountService {

	IAccountDao dao = null;

	public AccountServiceimpl() {
		dao = new AccountDaoImpl();
	}
	//------------------------   Mobile Recharge Application --------------------------
		/*******************************************************************************************************
		 - Method Name	:	getAccountDetails
		 - Input Parameters	:	mobileNo - String     
		 - Return Type		:	Account - Account
		 - Author			:	Vikash Kumar
		 - Creation Date	:	11/07/2018
		 - Description		:	Getting User Details from Saved Database In DAO Class
		 ********************************************************************************************************/
	@Override
	public Account getAccountDetails(String mobileNo) {
		return dao.getAccountDetails(mobileNo);
	}
	//------------------------   Mobile Recharge Application --------------------------
	/*******************************************************************************************************
	 - Method Name	:	rechargeAccount
	 - Input Parameters	:	mobileNo - String         rechargeAmount-double
	 - Return Type		:	output - int
	 - Author			:	Vikash Kumar
	 - Creation Date	:	11/07/2018
	 - Description		:	Recharge User Mobile Number If the static database have the mobileNo saved
	 ********************************************************************************************************/

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		return dao.rechargeAccount(mobileNo, rechargeAmount);
	}
	//------------------------   Mobile Recharge Application --------------------------
	/*******************************************************************************************************
		 - Method Name	:	validateMobileNumber
		 - Input Parameters	:	mobileNo - String
		 - Return Type		:	result - boolean
		 - Throws			:  	Accountexception
		 - Author			:  Vikash Kumar
		 - Creation Date	:	11/07/2018
		 - Description		:	It Validates the Mobile Number Input given by the User
		 ********************************************************************************************************/

	@Override
	public boolean validateMobileNumber(String mobileNo) throws Accountexception {
		boolean result = true;
		if (!(mobileNo.length() == 10 && mobileNo.matches("^[0-9]+$"))) {
			throw new Accountexception(IAccountexception.MESSAGE1);
		}
		return result;
	}
	//------------------------   Mobile Recharge Application --------------------------
	/*******************************************************************************************************
		 - Method Name	:	validateRechargeAmount
		 - Input Parameters	:	mobileNo - String
		 - Return Type		:	result - boolean
		 - Throws			:  	Accountexception
		 - Author			: Vikash Kumar
		 - Creation Date	:  11/07/2018
		 - Description		:	It Validates the Recharge Input given by the User
		 ********************************************************************************************************/

	@Override
	public boolean validateRechargeAmount(double rechargeAmount) throws Accountexception {
		boolean result = true;
		if (!(String.valueOf(rechargeAmount).trim().matches("^[0-9.]*$"))) {
			throw new Accountexception(IAccountexception.MESSAGE2);
		}
		return result;
	}
}
