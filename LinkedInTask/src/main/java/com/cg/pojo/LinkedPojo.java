package com.cg.pojo;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LinkedPojo {

	
	@FindBy(how=How.ID,id="reg-firstname")
	private WebElement firstName;
	@FindBy(how=How.ID,id="reg-lastname")
	private WebElement lastName;
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord.sendKeys(passWord);
	}

	@FindBy(how=How.ID,id="reg-email")
	
	private WebElement email;
	
	@FindBy(how=How.ID,id="registration-submit")
    private WebElement joinNow;
	
	@FindBy(how=How.ID,id="reg-password")
	private WebElement passWord;
	 public void submitEvent()
		{
			joinNow.click();
		}
}
