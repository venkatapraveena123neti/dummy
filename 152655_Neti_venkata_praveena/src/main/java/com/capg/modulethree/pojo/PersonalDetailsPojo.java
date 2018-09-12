package com.capg.modulethree.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetailsPojo {
	@FindBy(how=How.ID,id="txtFirstName")
	private WebElement firstName;
	
	public String getFirstName() {
		return firstName.getAttribute("value");
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public String getLastName() {
		return lastName.getAttribute("value");
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}

	public String getContactNo() {
		return contactNo.getAttribute("value");
	}

	public void setContactNo(String contactNo) {
		this.contactNo.clear(); 
		this.contactNo.sendKeys(contactNo);
	}

	public String getAddressOne() {
		return this.addressOne.getAttribute("value");
	}

	public void setAddressOne(String addressOne) {
		this.addressOne.sendKeys(addressOne);
	}

	
	

	public String getCity() {
		return new Select(this.city).getFirstSelectedOption().getText();
	}

	public void setCity(String city) {
		new Select(this.city).selectByVisibleText(city);
	}

	public String getState() {
		return new Select(this.state).getFirstSelectedOption().getText();
	}

	public void setState(String state) {
		new Select(this.state).selectByVisibleText(state);
	}

	

	@FindBy(how=How.ID,id="txtLastName")
	private WebElement lastName;
	
	@FindBy(how=How.ID,id="txtEmail")
	private WebElement email;

	@FindBy(how=How.ID, id="txtPhone")
	private WebElement contactNo;
	
	public String getAddressTwo() {
		return this.addressTwo.getAttribute("value");
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo.sendKeys(addressTwo);
	}



	@FindBy(how=How.ID,id="txtAddress1")
	private WebElement addressOne;
	
	@FindBy(how=How.ID,id="txtAddress2")
	private WebElement addressTwo;
	
	
	@FindBy(how=How.NAME,name="city")
	private WebElement city;
	@FindBy(how=How.NAME,name="state")
	private WebElement state;
	
	@FindBy(how=How.LINK_TEXT,linkText="Next")
	private WebElement nextLink;
	
	public void clickNextPageLink() {
		nextLink.click();
		
	}
}
