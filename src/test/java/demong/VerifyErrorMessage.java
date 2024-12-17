package demong;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessage {
	
	
	@Test
	public void errorhandling() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//System.out.println(driver.getTitle());
		
		//String exptitle="Login | Salesforce";
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ghansham");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
		driver.findElement(By.id("Login")).click();
		
		String expectederror = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		String actualerror = driver.findElement(By.id("error")).getText();
		
		Assert.assertEquals(expectederror, actualerror);
		System.out.println("Passesd.....");
		
		
		
		
		
		
		//driver.quit();
	}

}
