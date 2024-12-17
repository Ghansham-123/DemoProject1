package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
//		String title= driver.getTitle();
//		System.out.println("Title:- "+title);
//		
//		String url= driver.getCurrentUrl();
//		System.out.println("Url:- "+url);
//		
//		driver.navigate().to("https://www.google.com/search?q=whatsapp+web&rlz=1C1CHBF_enIN1128IN1128&oq=&gs_lcrp=EgZjaHJvbWUqCQgHEEUYOxjCAzIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAjGCcY6gIyDwgFEC4YJxjHARjqAhjRAzIMCAYQLhgnGOoCGOUEMgkIBxBFGDsYwgPSAQk4NzUyMWowajeoAgiwAgE&sourceid=chrome&ie=UTF-8");
//		
//		driver.navigate().refresh();
//		
//		driver.navigate().back();
		
//		WebElement username = driver.findElement(By.id("username"));
//		username.click();
		
		WebElement username = driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("Ghansham Dalvi");
		Thread.sleep(3000);
		
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.click();
		pwd.sendKeys("123");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		WebElement x2 = driver.findElement(By.linkText("Forgot Your Password?"));
		x2.click();
		
		WebElement un3 = driver.findElement(By.id("un"));
		un3.click();
		un3.sendKeys("Prasnn Dalvi");
		
		WebElement Contine = driver.findElement(By.id("continue"));
		Contine.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
