package handling_scenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Handle {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");	
		
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.linkText("GUI Elements"));
		link.click();
		
		driver.findElement(By.id("name")).sendKeys("Ghansham");
		driver.findElement(By.id("email")).sendKeys("ghanshamdalvi@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9922429514");
		driver.findElement(By.id("textarea")).sendKeys("At Post Nimgaon");
		Thread.sleep(2000);
		
		//Radio-Button
		WebElement gender =driver.findElement(By.id("male"));
		gender.isSelected();
		gender.click();
		gender.isSelected();
		
		//Check-Box
		List<WebElement> check =driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i<check.size(); i++)
		{
			check.get(i).click();
			//Thread.sleep(2000);
		}
		
		//Drop-Down 
		WebElement country =driver.findElement(By.xpath("//select[@id='country']"));
		
		Select s = new Select(country);
		
		//s.selectByValue("india");
		s.selectByVisibleText("Canada");
		
		List<WebElement> option =s.getOptions();
		System.out.println("To Print All options in dropdown:- "+option.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
