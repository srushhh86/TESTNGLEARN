package practice.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CreateContactTest {
	@BeforeSuite
	public void configBS()
	{
		System.out.println("exceute BS");
	}
	
	
	@BeforeClass
	public void configBC()
	{
		System.out.println("exceute BC");
	}
	
	@Test
	public void createContact()
	{
		System.out.println("execute createcontact");
	}
	
	@BeforeMethod
	public void configBM()
	{
		System.out.println("exceute BM");
	}
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("exceute AM");
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("exceute AC");
	}
	
	@AfterSuite
	public void configAS()
	{
		System.out.println("exceute AS");
	}
	

}
