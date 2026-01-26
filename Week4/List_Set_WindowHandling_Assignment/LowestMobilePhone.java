package list.set.window.assign;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowestMobilePhone {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phones");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> priceElements =  driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> prices = new ArrayList<>();
		
		for(WebElement price:priceElements)
		{
			String Text = price.getText().replace(",", "");
			if(!Text.isEmpty())
			{
				 prices.add(Integer.parseInt(Text));
			}
				
		}
		
		Collections.sort(prices);
		
		System.out.println("All Prices: "+prices);
		
		System.out.println("Lowest Price: "+prices.get(0));
		 
		driver.quit();
		

	}

}
