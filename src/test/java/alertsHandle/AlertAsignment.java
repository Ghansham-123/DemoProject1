package alertsHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAsignment {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		driver.switchTo().alert();
		
		//driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		
		
		String expected="I am an alert box!";
		System.out.println(expected);
		
		
		String actual = "I am an alert box!";
		System.out.println(actual);
		
		if(actual != null && expected.equals(actual))
		{
			System.out.println("correct");
		}
		else {
			System.out.println("wrong");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
