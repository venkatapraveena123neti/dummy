package com.cg.login.service;

import com.cg.login.dto.UserBean;
import com.cg.login.exception.MyLoginException;

public interface ILoginService {
public boolean validateLogin(UserBean userBean);
public boolean verifyLogin(UserBean userBean) throws MyLoginException;
}
