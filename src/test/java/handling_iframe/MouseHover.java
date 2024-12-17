package handling_iframe;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		
		WebElement norway = driver.findElement(By.xpath("//div[contains(text(),'Norway')]"));
		WebElement oslo= driver.findElement(By.xpath("(//div[contains(text(),'Oslo')])[2]"));
		
		Actions a = new Actions(driver);
		
		//a.dragAndDrop(oslo, norway).build().perform();
		a.clickAndHold(oslo).moveToElement(norway).release().build().perform();
		
		WebElement stock= driver.findElement(By.xpath("(//div[contains(text(),'Stockholm')])[2]"));
		WebElement sweaden = driver.findElement(By.xpath("(//div[contains(text(),'Sweden')])"));
		
		a.clickAndHold(stock).moveToElement(sweaden).release().build().perform();
		
		WebElement washington = driver.findElement(By.xpath("(//div[contains(text(),'Washington')])[2]"));
		WebElement us = driver.findElement(By.xpath("//div[contains(text(),'United States')]"));
		
		a.dragAndDrop(washington, us).build().perform();
		//a.clickAndHold(washington).moveToElement(us).release().build().perform();
		
		WebElement mardin = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		
		a.dragAndDrop(mardin, spain).build().perform();
		
		WebElement copenhagan = driver.findElement(By.cssSelector("div[id='box4']"));
		WebElement denmark = driver.findElement(By.cssSelector("div[id='box104']"));
		
		a.clickAndHold(copenhagan).moveToElement(denmark).release().build().perform();
		
		
		WebElement rome = driver.findElement(By.xpath("(//div[contains(text(),'Rome')])[2]"));
		WebElement Italy = driver.findElement(By.xpath("//div[contains(text(),'Italy')]"));
		
		a.clickAndHold(rome).moveToElement(Italy).release().build().perform();
		
		WebElement seowl = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement southKorea = driver.findElement(By.xpath("//div[contains(text(),'South Korea')]"));
		
		a.dragAndDrop(seowl, southKorea).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
