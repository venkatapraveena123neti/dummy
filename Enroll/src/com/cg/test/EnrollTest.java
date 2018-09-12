package com.cg.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.pojo.LoginPojo;
import com.cg.util.DriverClose;
import com.cg.util.DriverUtil;

public class EnrollTest {
private WebDriver driver;
	
	private LoginPojo login;

	@Before
	public  void setUp() throws Exception
	{
		
		 driver=DriverUtil.driverInitialize("chrome");
		 driver.get("http://localhost:9043/Enroll/login.html");
		// driver.get("WebContent\\login.html");
		 login=new LoginPojo();
		 PageFactory.initElements(driver,login);
		
	}
  @After
	public void tearDown()  throws Exception
	{
		DriverClose.driverClose(driver);
	}
	@Test
	public void enrollTest() throws InterruptedException
	{
		login.setUserName("varun");
		Thread.sleep(2000);
		login.setRoles("SSE");
		Thread.sleep(2000);
		login.setCountrys("India");
		Thread.sleep(2000);
		login.setSubmitButton();
		Thread.sleep(2000);
		
	}

}
