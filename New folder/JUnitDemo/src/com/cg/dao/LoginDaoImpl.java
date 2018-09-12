package com.cg.dao;

public class LoginDaoImpl implements ILoginDao {

	@Override
	public boolean login(String userName, String password) {
		boolean output = false;
		if(userName.equals("Admin") && password.equals("Admin")) {
			output = true;
		}
		return output;
	}

}
