package com.cucumber.CucumberTest;

import org.junit.Test;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 


public class Logintest { 
   WebDriver driver = null; 
	@Test
	public void test() throws Throwable
	{
		openBrowser();
		i_have_open_the_browser();
		i_open_Login_website();
		login_button_should_exits();
	}
   @Given("^I have open the browser$") 
   public void openBrowser() { 
      driver = new ChromeDriver(); 
   } 
	
   @Given("^I have open the browser$")
   public void i_have_open_the_browser() throws Throwable {
	   driver.navigate().to("http://localhost:7890/TestMe/login.html"); 
   }

   @When("^I open Login website$")
   public void i_open_Login_website() throws Throwable {
    System.out.println("I Opended");   
   }

   @Then("^Login button should exits$")
   public void login_button_should_exits() throws Throwable {
	   if(driver.findElement(By.id("submit")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
	      driver.close();     
   }


}