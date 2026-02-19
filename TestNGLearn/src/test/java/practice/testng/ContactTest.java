package practice.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ContactTest {
	@Test(priority = 1)
	public void createcontact()
	{
		System.out.println("execute contact");
	}
	
	@Test(priority = 2)
	public void modifycontactTest()
	{
		System.out.println("modifycontact contact");
	}
	
	@Test(priority = 3)
	public void deleteContactTest()
	{
		System.out.println("deleteContact contact");
	}
	

}
