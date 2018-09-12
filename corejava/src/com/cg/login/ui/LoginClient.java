package com.cg.login.ui;

import java.util.Scanner;

import com.cg.login.dto.UserBean;
import com.cg.login.exception.MyLoginException;
import com.cg.login.service.ILoginService;
import com.cg.login.service.LoginServiceImpl;

public class LoginClient {

	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter username");
		String username = scanner.nextLine();
		System.out.println("enter password");
		String password = scanner.nextLine();
		ILoginService service = new LoginServiceImpl();
		UserBean userBean = new UserBean();
		userBean.setUserName(username);
		userBean.setPassword(password);
		boolean result = service.validateLogin(userBean);
		if (result) {
boolean output=false;
try {
	output = service.verifyLogin(userBean);
} catch (MyLoginException e) {
	System.out.println(e.getMessage());
}
if (output) {
	System.out.println("Welcome "+username);
	
} else {
	System.out.println("Invalid login try again");

}} else {
System.out.println("Invalid login try again");
		}
		scanner.close();
	}

}
