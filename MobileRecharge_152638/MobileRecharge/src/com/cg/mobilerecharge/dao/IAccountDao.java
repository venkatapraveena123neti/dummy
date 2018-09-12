package com.cg.mobilerecharge.dao;

import com.cg.mobilerecharge.bean.Account;

public interface IAccountDao {

	public Account getAccountDetails(String mobileNo);

	public int rechargeAccount(String mobileNo, double rechargeAmount);
}
