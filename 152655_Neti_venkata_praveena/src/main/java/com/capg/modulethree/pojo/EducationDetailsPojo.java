package com.capg.modulethree.pojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class EducationDetailsPojo {

	@FindBy(how=How.NAME,name="graduation")
	private WebElement graduation;
	
	@FindBy(how=How.ID,id="txtPercentage")
	private WebElement percentage;
	
	
	@FindBy(how=How.ID,id="txtPassYear")
	private WebElement passYear;
	@FindBy(how=How.ID,id="txtProjectName")
	private WebElement projectName;
	
	public String getGraduation() {
		return new Select(this.graduation).getFirstSelectedOption().getText();
	}
	public void setGraduation(String graduation) {
		new Select(this.graduation).selectByVisibleText(graduation);
	}
	public String getPercentage() {
		return this.percentage.getAttribute("value");
	}
	public void setPercentage(String percentage) {
		this.percentage.sendKeys(percentage);
	}
	public String getPassYear() {
		return this.passYear.getAttribute("value");
	}
	public void setPassYear(String passYear) {
		this.passYear.sendKeys(passYear);
	}
	public String getProjectName() {
		return this.projectName.getAttribute("value");
	}
	public void setProjectName(String projectName) {
		this.projectName.sendKeys(projectName);
	}
	public List<String> getTechnologies() {
		List<String> list=new ArrayList<String>();
		
		for(WebElement we: this.technologies)
		{
			if(we.isSelected())
			{
				list.add(we.getText());
			}
		}
		return list;
		
		
		
	}
	public void setTechnologies(String technologies) {
		for(WebElement tech:this.technologies)
		{
			if(tech.getAttribute("value").equals(technologies))
			{
				tech.click();
			}
		}
	}
	public String getOtherTech() {
		return this.otherTech.getAttribute("value");
	}
	public void setOtherTech(String otherTech) {
		this.otherTech.sendKeys(otherTech);
	}
	public WebElement getRegister() {
		return register;
	}
	public void setRegister(WebElement register) {
		this.register = register;
	}
	@FindBy(how=How.NAME,name="technologies")
	private List<WebElement> technologies;
	@FindBy(how=How.ID,id="txtOtherTechs")
	private WebElement otherTech;
	@FindBy(how=How.ID,id="btnRegister")
	private WebElement register;

	public void btnSubmit() {
		// TODO Auto-generated method stub
		register.click();
	}
}
