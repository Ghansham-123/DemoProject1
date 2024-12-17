package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		
		System.out.println(driver.getTitle());
		System.out.println("URL :- "+driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
		System.out.println(uname.isDisplayed());
		System.out.println(uname.isEnabled());
		System.out.println(uname.isSelected());
		
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		System.out.println(pwd.isDisplayed());
		System.out.println(pwd.isEnabled());
		
		WebElement logo=driver.findElement(By.xpath("//img[@id='logo']"));
		System.out.println(logo.isDisplayed());
		System.out.println(logo.isEnabled());
		
		
		
		
		
		//String title = driver.getTitle();
		//System.out.println("Title:- "+title);
		
		//String Expected_title = "Youtube";
		//String Actual_title= driver.getTitle();
		
		//System.out.println(Expected_title.equalsIgnoreCase(Actual_title));
		
		
//		String title=driver.getTitle();
//		System.out.println("Title:- "+title);
//		
		//String url = driver.getCurrentUrl();
		//System.out.println("Url :- "+url);
//		
//		
//		WebElement un = driver.findElement(By.id("username"));
//		
//		un.click();
//		un.sendKeys("Ghansham");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.click();
//		pwd.sendKeys("123");
//		
//		WebElement login = driver.findElement(By.id("Login"));
//		login.click();
//		
//		driver.close();
//		
		
		
		
		
		
		
		
		
		
		
		

	}

}
