 
package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sleep {

	 public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
		//return nothing taking parameter
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
	 }
}
 