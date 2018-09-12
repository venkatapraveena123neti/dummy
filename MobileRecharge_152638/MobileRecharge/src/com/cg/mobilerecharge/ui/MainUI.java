package com.cg.mobilerecharge.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.mobilerecharge.bean.Account;
import com.cg.mobilerecharge.exception.Accountexception;
import com.cg.mobilerecharge.exception.IAccountexception;
import com.cg.mobilerecharge.service.AccountServiceimpl;
import com.cg.mobilerecharge.service.IAccountService;

public class MainUI {

	static IAccountService service = new AccountServiceimpl();

	public static void main(String[] args) {

		Integer choice = null;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			do {
				pritntMenu();
				System.out.println("Enter Your Choice: ");
				String ch = bufferedReader.readLine();
				choice = Integer.parseInt(ch);
				switch (choice) {
				case 1:
					accountBalanceEnquiry(); //Calling accountBalanceEnquiry() Method
					break;
				case 2:
					rechargeAccount();//Calling rechargeAccount() Method
					break;
				case 3:
					exitSystem();//Calling exitSystem() Method
					break;
				default:
					System.out.println("Please enter correct choice. ");
					break;
				}
			} while (choice != 3);
		} catch (Exception exception) {
			try {
				/* - Description : Throwing Exception for Wrong inputs by User*/
				throw new Accountexception(IAccountexception.MESSAGE3);
			} catch (Accountexception accountexception3) {
				System.out.println(accountexception3.getMessage());
			}
		}

	}

	// ------------------------ Mobile Recharge Application
	// --------------------------
	/*******************************************************************************************************
	 * - Method Name : accountBalanceEnquiry
	 *  - Author : Vikash Kumar 
	 *  - Creation Date  : 11/07/2018 
	 *  - Description : User will ask about their remaining balance by  providing their mobile number
	 ********************************************************************************************************/

	private static void accountBalanceEnquiry() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Mobile Number: ");
		String mobileNo = scanner.next().trim();
		boolean validateMobileNumberResult = false;
		try {
			/* - Description : Validating Mobile Number*/
			validateMobileNumberResult = service.validateMobileNumber(mobileNo);
		} catch (Accountexception accountexception) {
			/* - Description : Printing Exception*/
			System.out.println(accountexception.getMessage());
		}
		if (validateMobileNumberResult) {
			/* - Description : Getting Account Details from Service Class by Passing  Mobile Number*/
			Account account = service.getAccountDetails(mobileNo);
			if (account != null) {
				System.out.println("\nYour Current Balance is Rs. " + account.getAccountbalance()+"\n");
			} else {
				System.out.println("\nGiven Account Id Does Not Exists.\n");
			}

		}
	}

	// ------------------------ Mobile Recharge Application
	// --------------------------
	/*******************************************************************************************************
	 * - Method Name : rechargeAccount
	 *  - Author : Vikash Kumar .
	 *  - Creation Date : 11/07/2018 
	 *  - Description : It consists of Recharging the user mobile number
	 ********************************************************************************************************/

	private static void rechargeAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Mobile Number: ");
		String mobileNo = scanner.next().trim();
		boolean validateMobileNumberResult = false;
		try {
			/* - Description : Validating Mobile Number*/
			validateMobileNumberResult = service.validateMobileNumber(mobileNo);
		} catch (Accountexception accountexception) {
			System.out.println(accountexception.getMessage());
		}
		if (validateMobileNumberResult) {
			/* - Description : Getting Account Details from Service Class by Passing  Mobile Number*/
			Account account = service.getAccountDetails(mobileNo);
			if (account != null) {
				System.out.println("Enter Recharge Amount: ");
				double rechargeAmount = scanner.nextDouble();
				boolean validateRechargeAmountResult = false;
				try {
					/* - Description : Validating Recharge Amount*/
					validateRechargeAmountResult = service.validateRechargeAmount(rechargeAmount);
				} catch (Accountexception accountexceptionn) {
					System.out.println(accountexceptionn.getMessage());
				}
				if (validateRechargeAmountResult) {
					/* - Description : Calling rechargeAccount() and Calculating the updated Balance*/
					int recharge = service.rechargeAccount(mobileNo, rechargeAmount);
					if (recharge != 0) {
						System.out.println("\nYour Account Recharged Successfully\n" + "Hello "
								+ account.getCustomerName() + " , Available Balance is Rs. " + recharge + "\n");
					}
				}
			} else {
				System.out.println("\nCannot Recharge Account as Given mobile No Does Not Exists.\n");
			}

		}
	}

	// ------------------------ Mobile Recharge Application
	// --------------------------
	/*******************************************************************************************************
	 * - Method Name : exitSystem
	 *  - Author : Vikash Kumar 
	 *- Creation Date : 11/07/2018
	 * - Description : The User will exits out of the system
	 ********************************************************************************************************/

	private static void exitSystem() {
		System.out.println("Thanks For Using Application...!!!");
		System.exit(0);

	}

	// ------------------------ Mobile Recharge Application
	// --------------------------
	/*******************************************************************************************************
	 * - Method Name : pritntMenu
	 *  - Author : Vikash Kumar 
	 * - Creation Date :  11/07/2018 
	 * - Description : It prints the Menu to the user for making the  selection.
	 ********************************************************************************************************/

	private static void pritntMenu() {
		System.out.println("-----MENU-----");
		System.out.println("===============");
		System.out.println("1) Account Balance Enquiry.");
		System.out.println("2) Recharge Account.");
		System.out.println("3) Exit.");
		System.out.println("--------------------------------------");
	}

}
