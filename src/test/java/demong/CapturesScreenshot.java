package demong;

import java.io.File;
import java.io.IOException;
import java.net.http.WebSocket;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CapturesScreenshot {
	
	@Test
	public void screenshot() throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.canva.com/create/logos/?utm_source=google_sem&utm_medium=cpc&utm_campaign=in_en_web_seeding-product_canva_lower_acq_sign-ups_em&utm_term=logos&gad_source=1&gclid=CjwKCAiA0rW6BhAcEiwAQH28Ig18NvI-4g69yAA01di6kCQOaANh8lo5m7UaB8qhS8LJ4v5ZMD5gnRoCGyEQAvD_BwE&gclsrc=aw.ds");
		
		driver.manage().window().maximize();
		
		//TakesScreenshot ts = (TakesScreenshot) driver;  //firstly create object of screenshot
		
		WebElement cp=driver.findElement(By.xpath("//section[@class='CYqfUq- jBzCspM bxEHwvY bnwifHM']"));
		
		
		File sourcefile=cp.getScreenshotAs(OutputType.FILE);   // capture in files
		File destinationfile= new File("C:\\Users\\ghansham\\Desktop\\New folder\\gg.png");  	//store in path
		
		FileUtils.copyFile(sourcefile, destinationfile);
		System.out.println("Captured.....");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
