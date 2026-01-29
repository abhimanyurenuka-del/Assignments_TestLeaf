package xpath.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class createLead {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options .addArguments("--guest");

    ChromeDriver driver = new ChromeDriver(options);
    
    driver.get("http://leaftaps.com/opentaps/.");
    
    driver.get("http://leaftaps.com/opentaps/.");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.xpath("//a[contains(@href,'crmsfa')]")).click();
	
		
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Renu");
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Renu");
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
	
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testleaf Trainer");
	
	driver.findElement(By.name("submitButton")).click();
	
	driver.close();
	}

}
