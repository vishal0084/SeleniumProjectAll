 package day27;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindingLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement hey = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
//		System.out.println(hey.isDisplayed());
//		System.out.println(hey.isEnabled());
		System.out.println(hey.getLocation());
		driver.manage().window().fullscreen();
		
		Point p = new Point(50,50);
		
		driver.manage().window().setPosition(p);

	}

}
 