package com.cg.pojo;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPojo {
	

@FindBy(how=How.ID,using="text1")
private WebElement userName;
@FindBy(how=How.NAME,using="role")
private List<WebElement> role;
@FindBy(how=How.ID,using="country")
private WebElement country;
@FindBy(how=How.ID,using="button1")
private WebElement loginButton;

public String getUserName() {
	return userName.getText();
}
public void setUserName(String string) {
	this.userName.sendKeys(string);
}
/*public String getRole() {
	return roles.getAttribute("value");
}
public void setRole(String role) {
	new Select(this.roles).selectByValue(role);
}
public WebElement getCountry() {
	return countrys;
}
public void setCountry(String country) {
	new Select(countrys).selectByValue(country);
}
public String getCountry() {
	return new Select(this.countrys).getFirstSelectedOption().getText();
}
public void setCountry(String country) {
	new Select(this.countrys).selectByVisibleText(country);
}*/

public void setSubmitButton() {
	loginButton.click();
}

public String getRoles() {
	String str = null;
	for (WebElement webElement : role) {
		if (webElement.isSelected()) {
			str = webElement.getAttribute("value");
		}
	}
	return str;
}
public void setRoles(String roles) {
	//this.roles = roles;

	
	for(WebElement web:role)
	{
		if(web.getAttribute("value").equals(roles))
			web.click();
		/*if(web.toString())
		System.out.println(web.getLocation());*/
	}
	/*for(WebElement web:role) {
		if(web.getCssValue(roles) != null) {
			web.click();
		}
	}*/
	
}
public String getCountrys() {
	return new Select(this.country).getFirstSelectedOption().getText();
}
public void setCountrys(String countrys) {
	//this.countrys = countrys;
	/*for(WebElement web:countrys)
	{
		web.
	}*/
	Select drpCountry = new Select(country);
	drpCountry.selectByVisibleText(countrys);
	
}
public void setClearButton() {
	clearButton.click();
}
@FindBy(how=How.ID,using="button2")
private WebElement clearButton;

}
