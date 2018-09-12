package com.cg.login.dao;

import java.util.HashMap;

import com.cg.login.dto.UserBean;
import com.cg.login.exception.IMyLoginExceptionMessages;
import com.cg.login.exception.MyLoginException;
import com.cg.login.staticdb.LoginDatabase;

public class LoginDaoImpl implements ILoginDao {

	@Override
	public String getLoginPassword(UserBean userBean) throws MyLoginException {
		String dbpassword = "-1";
		try {

			HashMap<String, String> db = LoginDatabase.getLoginDetails();
			dbpassword = db.get(userBean.getUserName());
		} catch (Exception exception) {
			throw new MyLoginException(IMyLoginExceptionMessages.ERROR);
		}
		return dbpassword;
	}

}
