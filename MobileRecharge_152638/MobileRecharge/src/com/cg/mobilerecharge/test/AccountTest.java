package com.cg.mobilerecharge.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.mobilerecharge.dao.AccountDaoImpl;
import com.cg.mobilerecharge.dao.IAccountDao;

;

public class AccountTest {

	IAccountDao dao = new AccountDaoImpl();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Testing Starts...");
	}

	@AfterClass
	public static void setUpAfterClass() throws Exception {
		System.out.println("Testing Ends...");
	}

	@Test
	public void testRechargeAccountForNullMobileNumber() {
		assertNotNull(dao.rechargeAccount("", 100));
	}

	@Test
	public void testRechargeAccountForValidValues() {
		int result = dao.rechargeAccount("9852993617", 200);
		assertEquals(300, result);

	}

	@Test
	public void testRechargeAccountForInvalidMobileNumber() {
		int result = dao.rechargeAccount("1236985471", 200);
		assertNotSame(300, result);
	}

}
