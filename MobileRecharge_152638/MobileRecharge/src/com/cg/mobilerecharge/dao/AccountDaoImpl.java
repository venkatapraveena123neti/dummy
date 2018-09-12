package com.cg.mobilerecharge.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mobilerecharge.bean.Account;

public class AccountDaoImpl implements IAccountDao {
	/* - Description :Declaring Map which acts like static database*/
	private static Map<String, Account> accountEntryMap = null;
	static {
		accountEntryMap = new HashMap<>();
		Account account1 = new Account("9852993617", "Monthly", "Vikash Kumar", 100.00);
		Account account2 = new Account("8210403625", "Yearly", "Vishnu Kumar", 200.00);
		Account account3 = new Account("9512364789", "Quartely", "Vivek Singh", 300.00);
		Account account4 = new Account("7532156984", "Monthly", "Ajay Kumar", 400.00);
		Account account5 = new Account("7412589635", "Yearly", "Rahul Vikash", 500.00);
		/* - Description :Putting all person values to the Map*/
		accountEntryMap.put(account1.getMobileNo(), account1);
		accountEntryMap.put(account2.getMobileNo(), account2);
		accountEntryMap.put(account3.getMobileNo(), account3);
		accountEntryMap.put(account4.getMobileNo(), account4);
		accountEntryMap.put(account5.getMobileNo(), account5);

	}
	//------------------------   Mobile Recharge Application --------------------------
	/*******************************************************************************************************
	 - Method Name	:	getAccountDetails
	 - Input Parameters	:	mobileNo - String     
	 - Return Type		:	Account - Account
	 - Author			:	Vikash Kumar
	 - Creation Date	:	11/07/2018
	 - Description		:	Getting User Details from Saved Database
	 ********************************************************************************************************/
	@Override
	public Account getAccountDetails(String mobileNo) {
		return accountEntryMap.get(mobileNo);
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
		int output = 0;
		Account account = accountEntryMap.get(mobileNo);
		if (account != null) {
			/* - Description :Setting the updated Balance to the Account Class*/
			double updatedBalance = account.getAccountbalance() + rechargeAmount;
			account.setAccountbalance(updatedBalance);
			output = (int) updatedBalance;
		}
		return output;
	}

}
