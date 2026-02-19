package practice.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DependsOnTest {
	
	@Test(groups="smoke")
	public void createcontact()
	{
		String Url=System.getProperty("url","http:google.com");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		
		System.out.println(Url);
		System.out.println(browser+"\t"+username+"\t"+password);
		System.out.println("execute contact");
	//	System.out.println(1/0);
	}
	
	@Test(dependsOnMethods = "createcontact",groups="smoke")
	public void modifycontactTest()
	{
		System.out.println("modifycontact contact");
	}
	
	@Test(dependsOnMethods = "modifycontactTest",groups="smoke")
	public void deleteContactTest()
	{
		System.out.println("deleteContact contact");
	}
	


}
