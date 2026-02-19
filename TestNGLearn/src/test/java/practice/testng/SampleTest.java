package practice.testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SampleTest {
	@Test(dependsOnMethods = "test2")
	private void test1()
	{
		System.out.println("execute test");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("execute tes2");
		//return 0;
	}

}
