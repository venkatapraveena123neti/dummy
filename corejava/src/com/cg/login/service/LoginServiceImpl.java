package com.cg.login.service;

import com.cg.login.dao.ILoginDao;
import com.cg.login.dao.LoginDaoImpl;
import com.cg.login.dto.UserBean;
import com.cg.login.exception.MyLoginException;

public class LoginServiceImpl implements ILoginService {
	private ILoginDao dao;
	public LoginServiceImpl() {
dao=new LoginDaoImpl();
	}

	@Override
	public boolean validateLogin(UserBean userBean) {
		boolean result = false;
		if (userBean.getUserName().trim().length() > 4 && userBean.getPassword().trim().length() > 4) {
			result = true;
		}
		return result;
	}

	@Override
	public boolean verifyLogin(UserBean userBean)throws MyLoginException{
		boolean output = false;
		String dbPassword=dao.getLoginPassword(userBean);
		if (userBean.getPassword().equals(dbPassword)) {
			output=true;

		}
		return output;
	}

}
