package practice.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFromExcel {

	@Test(dataProvider = "getData")
	public void getProductInfo(String brandname,String productName)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandname,Keys.ENTER);
		
		
		String xpath = "//span[contains(text(),'"+productName+"')]/ancestor::div[@class='puisg-col-inner']/descendant::span[@class='a-price-whole']";
	
	String productprice = driver.findElement(By.xpath(xpath)).getText();
	System.out.println(productprice);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objarr=new Object[2][2];
		
		objarr[0][0]="iphone";
		objarr[0][1]="iPhone Air 256 GB";
		
		objarr[1][0]="iphone";
		objarr[1][1]="iPhone 17 Pro Max 256 GB";
		
		
		
		
		return objarr;
	}



}
