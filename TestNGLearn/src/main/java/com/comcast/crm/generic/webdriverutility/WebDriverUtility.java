package com.comcast.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	public void waitForPageToLoad(WebDriver driver) // wait for that particular browser
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	public void maximizepage(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void minimizepage(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	public void fullscreenpage(WebDriver driver)
	{
		driver.manage().window().fullscreen();
	}
	
	public void refreshpage(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
	public void forwardpage(WebDriver driver)
	{
		driver.navigate().forward();	

	}
	
	public void backwordpage(WebDriver driver)
	{
		driver.navigate().back();
	}
	
	
	
	public void waitForElementPresent(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void switchNewBrowserTabWithTitle(WebDriver driver,String partialURL)
	{
		Set<String> win = driver.getWindowHandles();
		for(String id:win)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains(partialURL))
			{
				break;
			}
		}
	}
	
	
	public void switchNewBrowserTab(WebDriver driver,String partialURL)
	{
		Set<String> win = driver.getWindowHandles();
		for(String id:win)
		{
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains(partialURL))
			{
				break;
			}
		}
	}
	
	//overloaded methods in selenium framework
	public void switchtoFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchtoFrame(WebDriver driver,String nameID)
	{
		driver.switchTo().frame(nameID);
	
		
	}
	public void switchtoFrame(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	
	}
	
	
	public void selectElementbyVisibleText(WebElement element,String elementtosearch)
	{
		Select sel= new Select(element);
		sel.selectByVisibleText(elementtosearch);
	}
	
	
	
}
