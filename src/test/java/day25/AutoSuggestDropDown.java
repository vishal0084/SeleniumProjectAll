 package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.xpath("//div[@class=\"wM6W7d\" and @role=\"presentation\"]//span"));
		System.out.println("Total number of options are " + options.size());

//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		} 
		
		for(int i=0;i<options.size();i++) {
			String text=options.get(i).getText();
			if(text.equalsIgnoreCase("Selenium Tutorial")) {
				options.get(i).click();
				break;
			}
		}
	}

}
