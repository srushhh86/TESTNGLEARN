package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	@FindBy(linkText="Organizations")
	private WebElement orgLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactLink;
	
	@FindBy(linkText="More")
	private WebElement MoreLink;

	@FindBy(linkText="Campaigns")
	private WebElement Campaigns;
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminimage;
	
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutbtn;
	

	public WebElement getAdminimage() {
		return adminimage;
	}



	public WebElement getSignoutbtn() {
		return signoutbtn;
	}


	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	
	public WebElement getMoreLink() {
		return MoreLink;
	}



	public WebElement getCampaigns() {
		return Campaigns;
	}


	//business library

	public void navigateToCampaginPage()
	{
		Actions act=new Actions(driver);
		act.moveToElement(MoreLink).perform();
		Campaigns.click();
	}
	
	//logout actions
	
	public void logout()
	{
		Actions act=new Actions(driver);
		act.moveToElement(adminimage).perform();
		signoutbtn.click();
	}
	
	
	
	
	}
