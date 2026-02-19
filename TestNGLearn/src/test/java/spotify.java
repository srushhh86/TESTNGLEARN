import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spotify {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://open.spotify.com/artist/3eDT9fwXKuHWFvgZaaYC5v");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='search' and @placeholder='What do you want to play?']")).sendKeys("Arijit singh");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,600)");
		
		
		driver.findElement(By.xpath("(//span[text()='Arijit Singh'])[1]")).click();
		
		
		js.executeScript("window.scrollBy(0,1000)");
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class=\"e-91000-text encore-text-body-medium encore-internal-color-text-base lkqOvzjBxm0err2b standalone-ellipsis-one-line\"]"));
	
		for(WebElement e:ele)
		{
			System.out.println(e.getText());
		}
	}

}
