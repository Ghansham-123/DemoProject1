package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Second {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> x=driver.findElements(By.tagName("a"));
		
		// To find the count of the link
//		System.out.println(x.size());
//		
//		// To print all links
//		for(WebElement x1:x)
//		{
//			System.out.println(x1.getAttribute("href"));
//		}
		
		for(WebElement x1:x)
		{
			System.out.println(x1.getAttribute("href"));
		}
		
		
	}

}
