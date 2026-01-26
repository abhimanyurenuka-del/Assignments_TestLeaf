package list.set.window.assign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcFlights {

	public static void main(String[] args) {

ChromeDriver driver = new ChromeDriver();

  driver.get("https://www.irctc.co.in/");
  
  driver.manage().window().maximize();
  
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  
  driver.findElement(By.xpath("//button[text()='OK']")).click();
  
  driver.findElement(By.xpath("//Label[text()='FLIGHTS']")).click();
  
  Set<String> alladdress = driver.getWindowHandles();
  
  List<String>  alladdre = new ArrayList<>(alladdress);
  
  String childAddress = alladdre.get(1);
  String parentAdd = alladdre.get(0);
 
  
  driver.switchTo().window(childAddress);
  
  String childTitle = driver.getTitle();
  System.out.println("Title is :"+childTitle);
  
  driver.switchTo().window(parentAdd);
  driver.close();
  driver.switchTo().window(childAddress);
  
 
  
  
  

  
 

	}

}
