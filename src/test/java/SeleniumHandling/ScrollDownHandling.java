package SeleniumHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownHandling {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.canva.com/create/logos/?utm_source=google_sem&utm_medium=cpc&utm_campaign=in_en_web_seeding-product_canva_lower_acq_sign-ups_em&utm_term=logos&gad_source=1&gclid=CjwKCAiA0rW6BhAcEiwAQH28Ig18NvI-4g69yAA01di6kCQOaANh8lo5m7UaB8qhS8LJ4v5ZMD5gnRoCGyEQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)",""); 
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-500)",""); 
		
		
		Actions a = new Actions(driver);
		
		WebElement mousehover1=driver.findElement(By.xpath("(//span[@class='_38oWvQ'])[1]"));
		a.moveToElement(mousehover1).build().perform();
		Thread.sleep(2000);
		
		WebElement mousehover2 =driver.findElement(By.xpath("(//span[@class='_38oWvQ'])[2]"));
		a.moveToElement(mousehover2).build().perform();
		
		WebElement salesclick= driver.findElement(By.xpath("//div[contains(text(),'Sales')]"));
		salesclick.click();
		

		
		
		
		
		
		
	}

}
