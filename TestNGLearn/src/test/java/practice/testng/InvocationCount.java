package practice.testng;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test
	public void createcontact()
	{
		System.out.println("execute contact");
	//	System.out.println(1/0);
	}
	
	@Test(invocationCount = 10)
	public void modifycontactTest()
	{
		System.out.println("modifycontact contact");
	}
	
	@Test(enabled = false)
	public void deleteContactTest()
	{
		System.out.println("deleteContact contact");
	}
	


}
