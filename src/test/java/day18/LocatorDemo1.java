package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//driver set up
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximize window 
		driver.manage().window().maximize();
		
		//open  application
		driver.get("http://www.automationpractice.pl/index.php");
		
		Thread.sleep(4000);
		
		WebElement search = driver.findElement(By.id("search_query_top"));
		search.sendKeys("T-Shirt");
		
		WebElement button = driver.findElement(By.name("submit_search"));
		button.click();
		
		Thread.sleep(3000);
		//Linked Text
		WebElement link = driver.findElement(By.linkText("Faded Short Sleeve T-shirts"));
		link.click();
		
//		WebElement link = driver.findElement(By.partialLinkText("Short Sleeve"));
//		link.click();
	
		
		
	}

}
