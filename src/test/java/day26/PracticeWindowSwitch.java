 package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeWindowSwitch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class=\"wikipedia-search-input\"]")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();
		
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		driver.findElement(By.xpath("//a[text()='Selenium in biology']")).click();
		driver.findElement(By.xpath("//a[text()='Selenium (software)']")).click();
		driver.findElement(By.xpath("//a[text()='Selenium disulfide']")).click();
		driver.findElement(By.xpath("//a[text()='Selenium dioxide']")).click();
       
       Set<String> windowId = driver.getWindowHandles(); 
         for(String winId :windowId) {
        	 String title = driver.switchTo().window(winId).getTitle();
        	 if(title.equals("Selenium - Wikipedia")) {
        		System.out.println(driver.getTitle());
        		driver.findElement(By.xpath("//input[@class=\"cdx-text-input__input\"]")).sendKeys("vishal");
        	 }
         }
        }

}
