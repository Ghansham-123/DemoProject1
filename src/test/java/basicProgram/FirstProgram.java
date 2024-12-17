package basicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new MicrosoftEdgeDriver();
		
		driver.get("https://open.spotify.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		
		
	}

}
