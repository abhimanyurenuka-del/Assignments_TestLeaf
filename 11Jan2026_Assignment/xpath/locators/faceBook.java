package xpath.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceBook {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
				
		driver.findElement(By.name("firstname")).sendKeys("Ren");
		
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		
		Select day=new Select (driver.findElement(By.id("day")));
        day.selectByVisibleText("25");
        
        Select month=new Select (driver.findElement(By.id("month")));
        month.selectByVisibleText("May");
        
        Select year=new Select (driver.findElement(By.id("year")));
        year.selectByVisibleText("1995");
        
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
        driver.findElement(By.name("reg_email__")).sendKeys("6261115745");
        
        driver.findElement(By.id("password_step_input")).sendKeys("Renu@1996");
        
        driver.findElement(By.name("websubmit")).click();
        
	}

}
