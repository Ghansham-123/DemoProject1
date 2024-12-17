package handling_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_concet {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.name("mytext1")).sendKeys("Ghansham");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_2.html']")));
		driver.findElement(By.name("mytext2")).sendKeys("Rajendra");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(3);
		driver.findElement(By.name("mytext4")).sendKeys("Dalvi");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
		driver.findElement(By.name("mytext3")).sendKeys("Prasnn");
		//driver.switchTo().defaultContent();
		
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']")));
		driver.findElement(By.xpath("//div[@class='Od2TWd hYsg7c i9xfbb N2RpBe']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
