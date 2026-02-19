package practice.testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TakeDataProviderFromAmazon {
	
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
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{

		FileInputStream fis=new FileInputStream("/Users/srushtimarihal/Downloads/iphonedataprovider.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
				
		int rowcount = wb.getSheet("Sheet1").getLastRowNum();
		Object[][] objarr=new Object[rowcount][2];
		
		for(int i=0;i<rowcount;i++)
		{
			objarr[i][0]=wb.getSheet("Sheet1").getRow(i+1).getCell(0).getStringCellValue();

			objarr[i][1]=wb.getSheet("Sheet1").getRow(i+1).getCell(1).getStringCellValue();

		}
	
		
	
		
		
		
		return objarr;
	}

}
