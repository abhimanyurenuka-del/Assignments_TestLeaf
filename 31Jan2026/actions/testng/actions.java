package actions.testng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class actions {

	public static void main(String[] args) throws IOException {

		//ChromeOptions opt = new ChromeOptions();
				//opt.addArguments("--guest");

				ChromeOptions opt1 = new ChromeOptions();
				opt1.addArguments("--disable-notifications");
				
				ChromeDriver driver = new ChromeDriver(opt1);

				  driver.get("https://www.amazon.in/");
				  
				  driver.manage().window().maximize();
				  
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				  
				  WebElement cond = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
				  
				  Actions act = new Actions(driver);
				  
				  act.scrollToElement(cond).perform();
				  
				  String text = cond.getText();
				  System.out.println("The text is :"+text);
				  
				  File src = driver.getScreenshotAs(OutputType.FILE);
				  File dest = new File("./Screenshots/AmazonPage.png");
				  Files.copy(src, dest);
				  
				  
	}

	

	
	

}
