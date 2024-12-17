package handling_scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Radio_Scenario {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dropdown =driver.findElement(By.id("//input[@id='autosuggest']"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(2);
		
		//s.selectByValue("Option 1");
		
		
		
		
		
		
//		List<WebElement> radio= driver.findElements(By.xpath("//input[@name='radioButton']"));
//		
//		for(int i =0; i<radio.size(); i++)
//		{
//			radio.get(i).click();
//			Thread.sleep(2000);
//		}
		
		//driver.findElement(By.xpath("//input[@value='radio3']")).click();
			
		//driver.close();
		
		
		
	}

}
