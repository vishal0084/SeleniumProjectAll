 package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssDemo {
	public static void main(String [] args) {
		
		//driver set up
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		//maximize window
		driver.manage().window().maximize();
				
		//open application
		driver.get("https://demo.nopcommerce.com/");
		
		//tag with id 
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		//tag with class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
		//driver.findElement(By.cssSelector("button.button-1")).click();
		
		//tag with attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("MacBook");
		
		//tag with class and Attribute
		//driver.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("MacBook");
		driver.findElement(By.cssSelector(".search-box-text[type='text']")).sendKeys("MacBook");
		
	}

}
