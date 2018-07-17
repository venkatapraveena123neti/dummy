package com.cg.WalletApplication.dao;

import java.util.TreeMap;

import com.cg.WalletApplication.bean.Wallet;

public interface IWalletDao {

	TreeMap<String, Wallet> getDetails();

	String addCustomer(Wallet wallet);

}
