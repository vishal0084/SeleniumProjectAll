 
package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	 public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//return nothing taking parameter
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
	 }
}
 