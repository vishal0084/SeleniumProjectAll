 package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		
		Set<String> windowsID=driver.getWindowHandles();
        
//		 
		/*
		 //Approche 1
		List<String> arrayWindowList = new ArrayList(windowsID);
		
		
		String parentWindowId = arrayWindowList.get(0);
		String childWindowId = arrayWindowList.get(1);
		
		//switch to child
		driver.switchTo().window(childWindowId);
		driver.findElement(By.xpath("//div[@class='d-flex']//li[1]//a[1]")).click();
		
		//switch to parent
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		*/
		
		//approche 2
		for (String w : windowsID) {
			String tittle= driver.switchTo().window(w).getTitle();
			if(tittle.equals("Human Resources Management Software | OrangeHRM")) {
				driver.findElement(By.xpath("//div[@class='d-flex']//li[1]//a[1]")).click();
			}
		}
		
		
	}

}
