package handling_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.unipune.ac.in/");
		
		Thread.sleep(1000);
		
		WebElement about = driver.findElement(By.xpath("//span[@id='stUI5_txt']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(about).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
