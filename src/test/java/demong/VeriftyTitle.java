package demong;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class VeriftyTitle {
	
	@Test
	public void verifytitlefirst() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.canva.com/create/logos/?utm_source=google_sem&utm_medium=cpc&utm_campaign=in_en_web_seeding-product_canva_lower_acq_sign-ups_em&utm_term=logos&gad_source=1&gclid=CjwKCAiA0rW6BhAcEiwAQH28Ig18NvI-4g69yAA01di6kCQOaANh8lo5m7UaB8qhS8LJ4v5ZMD5gnRoCGyEQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement value = driver.findElement(By.xpath("//span[contains(text(),'Free logo maker')]"));
		
		boolean logo =value.isDisplayed();
		
		Assert.assertTrue(logo);		System.out.println("Valid ");
		
		
		
		
		
	}
	
}
