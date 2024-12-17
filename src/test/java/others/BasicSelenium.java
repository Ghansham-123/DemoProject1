package others;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.close();
		
		String expected_title="google";
		
		String actual_title=driver.getTitle();
		
		System.out.println(expected_title.equalsIgnoreCase(actual_title));
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
		
		
		
		
		
	}

}
