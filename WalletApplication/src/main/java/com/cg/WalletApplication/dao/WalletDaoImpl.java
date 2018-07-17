package com.cg.WalletApplication.dao;

import java.util.TreeMap;

import com.cg.WalletApplication.bean.Wallet;

public class WalletDaoImpl implements IWalletDao{
public static TreeMap<String,Wallet> customerDetails=null; 
static{
	customerDetails=new TreeMap<String, Wallet>();
	
}
public TreeMap<String, Wallet> getDetails() {
	
	return customerDetails;
}
public String addCustomer(Wallet wallet) {
	customerDetails.put(wallet.getMobileNumber(), wallet);
	return wallet.getMobileNumber();
}
}
