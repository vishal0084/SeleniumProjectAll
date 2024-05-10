 package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bingdemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys("Selenium");
		
		List<WebElement> li = driver.findElements(By.xpath("//ul[@class=\"sa_drw\"]//li"));
		System.out.println("Size "+li.size());
		
		for(WebElement l :li) {
			System.out.println(l.getText());
		}
	
//		for(int i=0;i<li.size();i++) {
//			String s=li.get(i).getText();
//			if(s.equalsIgnoreCase("Selenium Download")){
//				li.get(i).click();
//				break;
//			}
//		}
		
		
		
	}

}
