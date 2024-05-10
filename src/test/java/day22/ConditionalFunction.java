 package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalFunction {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//isDisplayed()
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("status of logo "+logo.isDisplayed());
		 
		//isEnabled()
		Boolean status=driver.findElement(By.cssSelector("input.search-box-text")).isEnabled();
		System.out.println("Enable is "+status);
		
		//isSelected
		WebElement male=driver.findElement(By.cssSelector("input#gender-male"));
		WebElement female=driver.findElement(By.cssSelector("input#gender-female"));
		
		//before selecton
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		//after selection male radio button
		male.click();
		System.out.println("After selecting male radio button "+male.isSelected());
		System.out.println(female.isSelected());
		
		//after selection female radio button
		female.click();
		System.out.println("After selecting female radio button "+female.isSelected());
		System.out.println(male.isSelected());
		driver.close();
	}

}
