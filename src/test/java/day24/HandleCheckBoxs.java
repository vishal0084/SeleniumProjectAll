package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBoxs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		WebElement click1 =driver.findElement(By.cssSelector("input.Automation"));
		click1.click();
		
		Thread.sleep(3000); 
		click1.click();
		
//		List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
//		System.out.println("no of checkboxes " + checkboxes.size());
//		
//		for(int i=0;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
 
	}

}
