package alertsHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		Thread.sleep(2000);
		
		//WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(0);
		
		
		WebElement sliderOne= driver.findElement(By.xpath("(//span[@tabindex='0'])[1]"));
		
		Actions a = new Actions(driver);
		a.dragAndDropBy(sliderOne, -50, 0).build().perform();
		
		WebElement slidertwo= driver.findElement(By.xpath("(//span[@tabindex='0'])[2]"));
		a.dragAndDropBy(slidertwo, -100, 0).build().perform();
		

		WebElement sliderthree= driver.findElement(By.xpath("(//span[@tabindex='0'])[3]"));
		a.dragAndDropBy(sliderthree, -50, 0).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
