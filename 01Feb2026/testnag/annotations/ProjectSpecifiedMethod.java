package testnag.annotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecifiedMethod {
	
	public ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		
		String url="https://amazon.in";
		String username="renu";
		String password="Renu123";
		
		
		driver.get(url);
		driver.manage().window().maximize();
		
		System.out.println("Enter the URL");
		System.out.println("Enter the username");
        System.out.println("Enter the password");

	}
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
		System.out.println("Close the browser");
	}

}
