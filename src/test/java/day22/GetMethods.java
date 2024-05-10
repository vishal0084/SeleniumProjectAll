 package day22;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//return nothing taking parameter
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
//		String name= driver.getTitle();
//		System.out.println(name);
		
//		String currenturl= driver.getCurrentUrl();
//		System.out.println(currenturl); 
//		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		System.out.println(pagesource.contains("html"));
//		
//		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(2000);
		
		WebElement button=driver.findElement(By.linkText("OrangeHRM, Inc"));
		button.click();
		
		//Thread.sleep(4000);
		
		//driver.findElement(By.linkText("Executive Profile")).click();
		
//		Set<String> ids=driver.getWindowHandles();
//		 
//		for(String winid:ids) {
//			System.out.println(winid);
//		}
		//driver.close();
		//driver.quit();

	}

}
