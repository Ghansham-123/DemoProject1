package handling_iframe;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		
		WebElement resizech = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		Actions a = new Actions(driver);
		a.dragAndDropBy(resizech, 100, 100).build().perform();		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
