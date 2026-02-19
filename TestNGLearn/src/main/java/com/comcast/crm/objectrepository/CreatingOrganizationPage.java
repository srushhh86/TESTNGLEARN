package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingOrganizationPage {
	WebDriver driver;
	public CreatingOrganizationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="accountname")
	private WebElement orgnametextfield;
	
	@FindBy(name="ship_street")
	private WebElement shippingaddress;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	
	@FindBy(name="industry")
	private WebElement industry;
	
	@FindBy(name="accounttype")
	private WebElement industrytype;
	

	
	public WebElement getIndustry() {
		return industry;
	}


	public WebElement getIndustrytype() {
		return industrytype;
	}


	public WebElement getOrgnametextfield() {
		return orgnametextfield;
	}


	public WebElement getShippingaddress() {
		return shippingaddress;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	
	
	//actions
	public void createOrg(String orgname,String shipaddres)
	{
		orgnametextfield.sendKeys(orgname);
		shippingaddress.sendKeys(shipaddres);
		savebtn.click();
	}
	
	
	public void createorgWithIndustryType(String orgname,String indus,String type,String shipaddres)
	{
		orgnametextfield.sendKeys(orgname);
		Select sel=new Select(industry);
		sel.selectByVisibleText(indus);
		
		Select sel1=new Select(industrytype);
		sel1.selectByVisibleText(type);
		
		
		shippingaddress.sendKeys(shipaddres);
		savebtn.click();
	}
	
	
	
	
	

}
