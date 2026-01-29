package xpath.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createAccount {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/.");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'crmsfa')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//driver.findElement(By.className("selected")).click();----------why this classname locator is not located properly
		
		driver.findElement(By.id("accountName")).sendKeys("Renuka");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		driver.findElement(By.id("numberEmployees")).sendKeys("30");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
		
		
		
		

	}

}
