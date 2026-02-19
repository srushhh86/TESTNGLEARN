package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	WebDriver driver;
	
	public WebElement getCreateNewOrg() {
		return createNewOrg;
	}


	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createNewOrg;
	
	@FindBy(name="search_text")
	private WebElement searchfortext;
	
	@FindBy(id="bas_searchfield")
	private WebElement orgnamedropdown;
	
	@FindBy(name="submit")
	private WebElement searchbutton;
	
	public WebElement getSearchfortext() {
		return searchfortext;
	}

	public WebElement getOrgnamedropdown() {
		return orgnamedropdown;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public OrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
