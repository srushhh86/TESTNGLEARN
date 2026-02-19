package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test2 {
	
	@Test(dataProvider = "getData")
	public void createContactTest(String firstname,String lastname,long phone)
	{
		System.out.println("firstname : "+firstname +" , lastname : "+ lastname +" , phone : "+ phone);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] objarr=new Object[3][3];
		
		objarr[0][0]="deepak";
		objarr[0][1]="hr";
		objarr[0][2]=9448679574l;
		
		
		objarr[1][0]="sham";
		objarr[1][1]="rh";
		objarr[1][2]=94486795878l;
		
		objarr[2][0]="john";
		objarr[2][1]="smith";
		objarr[2][2]=94486795984l;
		
		return objarr;
		
 	}

}
