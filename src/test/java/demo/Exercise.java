package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement un = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		un.click();
		un.sendKeys("Vijaya");
		Thread.sleep(3000);
		
		driver.findElement(By.name("//input[@name='password']")).sendKeys("123");
		
		driver.findElement(By.linkText("Login")).click();
		
		

	}

}
