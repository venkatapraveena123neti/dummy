package com.cg.LinkedInTask;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.capg.util.DriverUtil;
import com.cg.pojo.LinkedPojo;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LinkedStepDefinitionFile {

	@Test
	public void test() throws Throwable {
		
		GetWebsiteAddress();
		 GivenDetails();
		 RedirectToChild();
		 Thread.sleep(5000);
		 closed();
	}
	private WebDriver drivers;
	private LinkedPojo LinkedPojoBean;
	@Before
	public void driverInit() {

		drivers = DriverUtil.driverInitializer("chrome");
		LinkedPojoBean = new LinkedPojo();
		PageFactory.initElements(drivers, LinkedPojoBean);

	}

	@After
	public void closed() throws InterruptedException {
	
		DriverUtil.driverClose(drivers);
	}

	@Given("^GetWebsiteAddress$")
	public void GetWebsiteAddress() {
		drivers.get("https://www.linkedin.com/");
	}

	@When("GivenDetails$")
	public void GivenDetails() throws Throwable {

		LinkedPojoBean.setFirstName("veena");
		LinkedPojoBean.setPassWord("veena@123");
		LinkedPojoBean.setEmail("nvveena@gmail.com");
		LinkedPojoBean.setLastName("neti");
		
		//assertEquals("nvveena@gmail.com", LinkedPojoBean.getEmail());


	}

	@Then("^RedirectToChild$")
	public void RedirectToChild() throws InterruptedException {
		LinkedPojoBean.submitEvent();
		Thread.sleep(5000);
	   

	}
}
