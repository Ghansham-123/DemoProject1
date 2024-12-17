package demong;

import org.testng.annotations.Test;

public class First {
	
	@Test(groups = "Smoke")
	public void m1() {
		System.out.println("This is the basic code ");
	}
	
	@Test(groups = "Regression")
	public void m2()
	{
		System.out.println("Yes");
	}
	
	@Test(groups = "Smoke")
	public void m3() 
	{
		System.out.println("Yes Yess");
	}
	
	
	
	
	
	

}
