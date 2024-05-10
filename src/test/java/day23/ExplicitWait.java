 
package day23;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	 public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		//Declare Explicit wait
		WebDriverWait myWait = new WebDriverWait(driver , Duration.ofSeconds(10));
			
		//return nothing taking parameter
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement username=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
	    username.sendKeys("Admin");
	    
	    WebElement password=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Password\"]")));
	    password.sendKeys("admin123");
	    
		 
	 }
}
