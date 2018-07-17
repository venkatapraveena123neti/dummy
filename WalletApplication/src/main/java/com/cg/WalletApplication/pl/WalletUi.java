package com.cg.WalletApplication.pl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.cg.WalletApplication.Exception.BankException;
import com.cg.WalletApplication.Exception.IBankException;
import com.cg.WalletApplication.bean.Wallet;
import com.cg.WalletApplication.service.IWalletService;
import com.cg.WalletApplication.service.WalletServiceImpl;

public class WalletUi {

	public static void main(String[] args) {
		IWalletService iWalletService = new WalletServiceImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"1) Create Account \n 2) Show Balance \n 3) Deposit\n 4) Withdraw \n 5)Fund Transfer\n 6) Print Transactions\n 7) exit");
		int choice;
		do {
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				try {
					Wallet wallet = new Wallet();
					System.out.println("Enter Customer  Name");
					String name = scanner.next();
					iWalletService.checkName(name);
					wallet.setName(name);
					System.out.println("Enter Mobile Number");
					String mobileNumber = scanner.next();
					iWalletService.checkMobileNumber(mobileNumber);
					wallet.setMobileNumber(mobileNumber);
					System.out.println("Enter Password");
					String password = scanner.next();
					iWalletService.checkPassword(password);
					wallet.setPassword(password);
					System.out.println("Enter Email Id");
					String emailId = scanner.next();
					iWalletService.checkEmail(emailId);
					wallet.setEmailId(emailId);
					String result = iWalletService.addCustomer(wallet);
					if (result != null)
						System.out.println("Account created with Account Number " + result);
					else
						System.out.println("Account already exists");
				} catch (BankException bankException) {
					System.out.println(bankException.getMessage());
				}

				break;
			case 2:

				try {
					System.out.println("Enter your mobile number");
					String mobileNum = scanner.next();
					iWalletService.checkMobileNumber(mobileNum);
					System.out.println("Enter the password");
					String password = scanner.next();
					iWalletService.checkPassword(password);
					Wallet wallet = iWalletService.showBalance(mobileNum, password);
					if (wallet != null) {
						System.out.println("Available balance is " + wallet.getBalance());
					} else {
						System.out.println(IBankException.invalidDetails);
					}
				} catch (BankException bankException) {

					System.out.println(bankException.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Enter your mobile number");
					String mobileNum = scanner.next();
					iWalletService.checkMobileNumber(mobileNum);
					System.out.println("Enter the password");
					String password = scanner.next();
					iWalletService.checkPassword(password);
					Wallet wallet = iWalletService.check(mobileNum,password);
					if(wallet!=null)
					{
						System.out.println("Enter amount to deposit ");
						BigDecimal amount = scanner.nextBigDecimal();
					 iWalletService.deposit(wallet,amount);
					 System.out.println("Deposited");
					}
					else
					{
						System.out.println(IBankException.invalidDetails);
					}
				} catch (BankException bankException) {
					
					System.out.println(bankException.getMessage());
				}

				break;
			case 4:try {
				System.out.println("Enter your mobile number");
				String mobileNum = scanner.next();
				iWalletService.checkMobileNumber(mobileNum);
				System.out.println("Enter the password");
				String password = scanner.next();
				iWalletService.checkPassword(password);
				Wallet wallet = iWalletService.check(mobileNum,password);
				if(wallet!=null) {
					System.out.println("Enter the amount to withdraw");
					BigDecimal amount = scanner.nextBigDecimal();
					boolean result = iWalletService.withDraw(wallet,amount);
					if(result==true)
					{
						System.out.println("Amount is succesfully withdrawn and current balance is "+wallet.getBalance());
					}
					else
					{
						System.out.println(IBankException.insufficientFunds);
					}
				}else
					System.out.println(IBankException.invalidDetails);
			}catch(BankException bankException) {
				System.out.println(bankException.getMessage());
			}
				break;
			case 5:try {
				System.out.println("Enter Receivers mobile number ");
				String receiverMobile = scanner.next();
				iWalletService.checkMobileNumber(receiverMobile);
				boolean result = iWalletService.isFound(receiverMobile);
				if(result) {
					System.out.println("Enter sender mobile number");
					String senderMobile = scanner.next();
					iWalletService.checkMobileNumber(senderMobile);
					System.out.println("Enter senders password");
					String password = scanner.next();
					iWalletService.checkPassword(password);
					Wallet wallet = iWalletService.check(senderMobile,password);
					if(wallet!=null) {
						System.out.println("Enter the amount to transfer");
						BigDecimal amount = scanner.nextBigDecimal();
						boolean output = iWalletService.transfer(senderMobile,receiverMobile,amount);
						if(output==true)
						{
							System.out.println("Amount is succesfully withdrawn and current balance is "+wallet.getBalance());
						}
						else
						{
							System.out.println(IBankException.insufficientFunds);
						}
					
				}else
				{
					System.out.println(IBankException.mobileNumberException);
				}
				}
				
			}catch(BankException bankException) {
				System.out.println(bankException.getMessage());
			} catch (InterruptedException interruptedException) {
				System.out.println(interruptedException.getMessage());
			}
				break;
			case 6:try {
				System.out.println("Enter your mobile number");
				String mobileNum = scanner.next();
				iWalletService.checkMobileNumber(mobileNum);
				System.out.println("Enter the password");
				String password = scanner.next();
				iWalletService.checkPassword(password);
				Wallet wallet = iWalletService.check(mobileNum,password);
				if(wallet!=null) {
				TreeMap<LocalDateTime, String> transactions = wallet.getTransactions();
				for(Map.Entry<LocalDateTime, String> trans : transactions.entrySet()) {
					System.out.println(trans.getKey()+" @ " +trans.getValue());
				}
				}
				
			}catch(BankException bankException) {
				System.out.println(bankException.getMessage());
			}
				break;
			case 7:
				scanner.close();
				System.exit(0);

			}
		} while (choice < 7);
	}

}
