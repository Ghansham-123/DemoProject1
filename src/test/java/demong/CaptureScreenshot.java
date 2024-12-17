package demong;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {
	
	@Test
	public void screenshot() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		
		WebElement sc=driver.findElement(By.xpath("//img[@title='Show details for $25 Virtual Gift Card']"));
		
		File source= sc.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\ghansham\\Desktop\\New folder\\ssssss.png");
		
		FileUtils.copyFile(source, destination);
		System.out.println("Passes");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
