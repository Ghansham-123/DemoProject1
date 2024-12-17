package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_One {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement un = driver.findElement(By.id("email"));
		un.click();
		un.sendKeys("ghanshamdalvi1998@gmail.com");
		Thread.sleep(3000);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		pwd.click();
		pwd.sendKeys("Pass@123");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
		String s = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(s);
		
		String s1= driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).getAttribute("value");
		System.out.println(s1);
	}

}
