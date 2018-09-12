package com.capg.modulethree;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.capg.modulethree.pojo.EducationDetailsPojo;
import com.capg.modulethree.pojo.PersonalDetailsPojo;
import com.capg.modulethree.util.DriverUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonalDetailsStepDefinitionFile {

	private WebDriver driver;
	private PersonalDetailsPojo personalDetailsPojo;
	private EducationDetailsPojo educationDetailsPojo;
Logger log=Logger.getLogger(PersonalDetailsStepDefinitionFile.class);

	@Test
	public void test() throws Throwable {
		user_is_one_Personal_Details_page();
		
		user_click_next_link_without_entering_Firstname();
		please_fill_the_First_Name_should_display();
		Thread.sleep(1000);
		user_click_next_link_without_entering_Lastname();
		please_fill_the_Last_Name_should_display();
		Thread.sleep(1000);
		user_click_next_link_without_entering_email();
		please_fill_the_Email_should_display();
		Thread.sleep(1000);
		user_clicks_next_link_with_invalid_email_id();
		please_enter_valid_Email_Id_should_display();
		Thread.sleep(1000);
		user_click_next_link_without_entering_Conctactno();
		please_fill_the_Contact_No_should_display();
		Thread.sleep(1000);
		user_clicks_next_link_with_invalid_contact_no();
		please_enter_valid_Contact_no_should_display();
		Thread.sleep(1000);
		user_click_next_link_without_entering_addresslineone();
		please_fill_the_address_line_one_should_display();
		Thread.sleep(1000);
		user_click_next_link_without_entering_addressline_two();
		please_fill_the_address_line_two_should_display();
		Thread.sleep(1000);
		user_click_next_link_without_selecting_city();
		please_select_city_should_display();
		Thread.sleep(1000);
		user_click_next_link_without_selecting_state();
		please_select_state_should_display();
		Thread.sleep(1000);
		 user_click_next_link_after_entering_valid_details();
		 
		 personal_details_are_validated_and_accepted_successfully_should_display_navigate_to_page();
		 Thread.sleep(1000);
		 user_click_makepayment_link_without_entering_graduation();
			please_Select_Graduation_should_display();
			Thread.sleep(1000);
			user_click_makepayment_link_without_entering_percentage();
			Thread.sleep(1000);
			please_fill_Percentage_detail_should_display();
			Thread.sleep(1000);
			user_click_makepayment_link_without_entering_passing_year();
			Thread.sleep(1000);
			please_fill_Passing_Year_should_display();
			Thread.sleep(1000);
			user_clicks_makepayment_link_without_entering_project_name();
			Thread.sleep(1000);
			 please_fill_Project_Name_should_display();
			 Thread.sleep(1000);
			 user_click_makepayment_link_without_selecting_technologies_used();
			 Thread.sleep(1000);
			 please_Select_Technologies_Used_should_display();
			 Thread.sleep(1000);
			 user_clicks_makepayment_link_without_entering_other_technologies();
			 please_fill_other_Technologies_Used_should_display();
			 user_click_makepayment_link_after_entering_valid_details();
			 your_Registration_Has_succesfully_done_Plz_check_you_registerd_email_for_account_activation_link_should_display_navigate_to_page();
	}

	@Before
	public void driverInit() {
		driver = DriverUtil.driverInitializer("chrome");
		personalDetailsPojo = new PersonalDetailsPojo();
		PageFactory.initElements(driver, personalDetailsPojo);
	}

	@After
	public void driverClosed() {
		DriverUtil.driverClose(driver);
	}

	@Given("^User is one Personal Details page$")
	public void user_is_one_Personal_Details_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver.get("D:\\BDD_Selenium\\152655_Neti_venkata_praveena\\Web\\PersonalDetails.html");
	}

	@When("^title is not matching with expected title$")
	public void title_is_not_matching_with_expected_title() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		log.info(driver.getTitle());
		
	}

	@Then("^test should stop execution$")
	public void test_should_stop_execution() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("^user click next link without entering Firstname$")
	public void user_click_next_link_without_entering_Firstname() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		log.info(driver.getTitle());
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please fill the First Name", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the First Name' should display$")
	public void please_fill_the_First_Name_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setFirstName("veena");
	}

	@When("^user click next link without entering Lastname$")
	public void user_click_next_link_without_entering_Lastname() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please fill the Last Name", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the Last Name' should display$")
	public void please_fill_the_Last_Name_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setLastName("neti");
	}

	@When("^user click next link without entering email$")
	public void user_click_next_link_without_entering_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please fill the Email", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the Email' should display$")
	public void please_fill_the_Email_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setEmail("nveenagmail.com");
	}

	@When("^user clicks next link with invalid email id$")
	public void user_clicks_next_link_with_invalid_email_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please enter valid Email Id.", driver.switchTo().alert().getText());
	}

	@Then("^'Please enter valid Email Id\\.' should display$")
	public void please_enter_valid_Email_Id_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setEmail("nveena@gmail.com");
	}

	@When("^user click next link without entering Conctactno$")
	public void user_click_next_link_without_entering_Conctactno() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please fill the Contact No.", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the Contact No\\.' should display$")
	public void please_fill_the_Contact_No_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setContactNo("98574555");
	}

	@When("^user clicks next link with invalid contact no\\.$")
	public void user_clicks_next_link_with_invalid_contact_no() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please enter valid Contact no.", driver.switchTo().alert().getText());
	}

	@Then("^'Please enter valid Contact no\\.' should display$")
	public void please_enter_valid_Contact_no_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setContactNo("9494242544");
	}

	
	@When("^user click next link without entering addresslineone$")
	public void user_click_next_link_without_entering_addresslineone() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please fill the address line 1", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the address line one' should display$")
	public void please_fill_the_address_line_one_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setAddressOne("Nizampet");
	}

	@When("^user click next link without entering addressline two$")
	public void user_click_next_link_without_entering_addressline_two() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please fill the address line 2", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill the address line two' should display$")
	public void please_fill_the_address_line_two_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setAddressTwo("Vertex Lake view Road");
	}

	@When("^user click next link without selecting city$")
	public void user_click_next_link_without_selecting_city() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please select city", driver.switchTo().alert().getText());
	}

	@Then("^'Please select city' should display$")
	public void please_select_city_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setCity("Hyderabad");
	}

	@When("^user click next link without selecting state$")
	public void user_click_next_link_without_selecting_state() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		assertEquals("Please select state", driver.switchTo().alert().getText());
	}

	@Then("^'Please select state' should display$")
	public void please_select_state_should_display() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		personalDetailsPojo.setState("Telangana");
	}

	@When("^user click next link after entering valid details$")
	public void user_click_next_link_after_entering_valid_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		personalDetailsPojo.clickNextPageLink();
		
	}

	@Then("^'Personal details are validated and accepted successfully\\.' should display navigate to page$")
	public void personal_details_are_validated_and_accepted_successfully_should_display_navigate_to_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
	}
	
		

	

	@When("^title of the page doesnt match$")
	public void title_of_the_page_doesnt_match() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^test stops execution$")
	public void test_stops_execution() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user click makepayment link without entering graduation$")
	public void user_click_makepayment_link_without_entering_graduation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		educationDetailsPojo=new EducationDetailsPojo();
		PageFactory.initElements(driver, educationDetailsPojo);
		educationDetailsPojo.btnSubmit();
		assertEquals("Please Select Graduation", driver.switchTo().alert().getText());
	}

	@Then("^'Please Select Graduation' should display$")
	public void please_Select_Graduation_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		educationDetailsPojo.setGraduation("BTech");
	}

	@When("^user click makepayment link without entering percentage$")
	public void user_click_makepayment_link_without_entering_percentage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		educationDetailsPojo.btnSubmit();
		assertEquals("Please fill Percentage detail", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill Percentage detail' should display$")
	public void please_fill_Percentage_detail_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		educationDetailsPojo.setPercentage("78");
	}

	@When("^user click makepayment link without entering passing year$")
	public void user_click_makepayment_link_without_entering_passing_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		educationDetailsPojo.btnSubmit();
		assertEquals("Please fill Passing Year", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill Passing Year' should display$")
	public void please_fill_Passing_Year_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		educationDetailsPojo.setPassYear("2018");
	}

	@When("^user clicks makepayment link without entering project name$")
	public void user_clicks_makepayment_link_without_entering_project_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		educationDetailsPojo.btnSubmit();
		assertEquals("Please fill Project Name", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill Project Name' should display$")
	public void please_fill_Project_Name_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		educationDetailsPojo.setProjectName("Android");
	}

	@When("^user click makepayment link without selecting technologies used$")
	public void user_click_makepayment_link_without_selecting_technologies_used() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		educationDetailsPojo.btnSubmit();
		assertEquals("Please Select Technologies Used", driver.switchTo().alert().getText());
	}

	@Then("^'Please Select Technologies Used' should display$")
	public void please_Select_Technologies_Used_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		educationDetailsPojo.setTechnologies("Java");
		educationDetailsPojo.setTechnologies(".Net");
	}

	@When("^user clicks makepayment link without entering other technologies$")
	public void user_clicks_makepayment_link_without_entering_other_technologies() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		educationDetailsPojo.btnSubmit();
		//assertEquals("Please fill other Technologies Used", driver.switchTo().alert().getText());
	}

	@Then("^'Please fill other Technologies Used' should display$")
	public void please_fill_other_Technologies_Used_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
		//educationDetailsPojo.setOtherTech("Cloud");
	}

	@When("^user click makepayment link after entering valid details$")
	public void user_click_makepayment_link_after_entering_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		educationDetailsPojo.btnSubmit();
	}

	@Then("^'Your Registration Has succesfully done Plz check you registerd email for account activation link !!!' should display navigate to page$")
	public void your_Registration_Has_succesfully_done_Plz_check_you_registerd_email_for_account_activation_link_should_display_navigate_to_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.switchTo().alert().dismiss();
	}

	}


