 package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticatedPopAndAlert {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
//		https://the-internet.herokuapp.com/basic_auth
//		https://admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		WebElement d=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]"));
		System.out.println(d.getText());
	}

}
 