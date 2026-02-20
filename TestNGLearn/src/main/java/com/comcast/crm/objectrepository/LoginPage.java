package com.comcast.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{ 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement username;
	
	

	@FindBy(name="user_password")
	private WebElement password;
	
// using findall //autohealing
	@FindAll({@FindBy(id="submitButton"),@FindBy(xpath = "(//input[@value='Login'])[2]")})
	private WebElement loginbutton1;
	
	
	@FindBys({@FindBy(id="submitButton"),@FindBy(xpath = "(//input[@value='Login'])[2]")})
	private WebElement loginbutton;

	
	
	//actions
	
	public void logintoPage(String user,String pass)
	{
			username.sendKeys(user);
		password.sendKeys(pass);
		loginbutton.click();
	}

	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
