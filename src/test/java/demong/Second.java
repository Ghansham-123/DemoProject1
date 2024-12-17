package demong;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Second {
	
	@BeforeMethod
	public void enter()
	{
		System.out.println("Enter the Url");
	}
	
	@AfterMethod
	public void aftermethodo() 
	{
		System.out.println("After the url");
	}
	
	@BeforeSuite
	public void beforesuite() 
	{
		System.out.println("Top");
	}
	
	
	@BeforeClass
	public void classmethod() 
	{
		System.out.println("YEs");
	}
	
	@AfterClass
	public void afterclasss() 
	{
		System.out.println("No");
	}
	
	@Test
	public void launch()
	{
		System.out.println("Main MEthod");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
