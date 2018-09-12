package com.cg.service.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cg.service.ILoginService;
import com.cg.service.LoginServiceImpl;

public class LoginServiceImplTest {
    @BeforeClass
    public static void beforeClass() {
    	System.out.println("before class");
    }
    @AfterClass
    public static void afterClass() {
    	System.out.println("after class");
    }
	@Before
	public void setUp() throws Exception{
		System.out.println("Before");
	}
	@After
	public void tata() throws Exception{
		System.out.println("after");
	}
	@Test
	public void testForBlankInputs() {
		ILoginService service = new LoginServiceImpl();
		boolean output = service.login("","");
		assertFalse(output);
	}
	@Test
	public void testForBlankUserName() {
		ILoginService service = new LoginServiceImpl();
		boolean output = service.login("","Admin");
		assertFalse(output);
	}
	@Test
	public void testForBlankPassword() {
		ILoginService service = new LoginServiceImpl();
		boolean output = service.login("Admin","");
		assertFalse(output);
	}
	@Ignore
	public void testForWrongInputLength() {
		ILoginService service = new LoginServiceImpl();
		boolean output = service.login("Adm","Ad");
		assertFalse(output);
	}
	@Test
	public void testForWrongInputs() {
		ILoginService service = new LoginServiceImpl();
		boolean output = service.login("bowbow","meowmeow");
		assertFalse(output);
	}
	@Test
	public void testForValidInputs() {
		ILoginService service = new LoginServiceImpl();
		boolean output = service.login("Admin","Admin");
		assertTrue(output);
	}
@Test(expected=NullPointerException.class)
public void testDisplayOutput() 
{
	ILoginService service = new LoginServiceImpl();
	String output = service.display("abcd");
	assertSame(output, service);
}
}
