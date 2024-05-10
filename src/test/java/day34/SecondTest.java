package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {
	
	WebDriver driver ;
	
	//@BeforeClass
	@Test(priority=1)
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority=2)
	public void login() {
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		login.click();
		
	}
	
	//@AfterClass
	@Test(priority=3)
	public void close() {
		
		driver.close();
		
	}

}
