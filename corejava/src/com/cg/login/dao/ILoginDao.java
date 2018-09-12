package com.cg.login.dao;

import com.cg.login.dto.UserBean;
import com.cg.login.exception.MyLoginException;

public interface ILoginDao {
public String getLoginPassword(UserBean userBean) throws MyLoginException;
}
