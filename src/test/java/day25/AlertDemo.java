 package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		 
		//alert with ok only
//        WebElement click1=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
//        click1.click();
//        Alert alertwindowjs = driver.switchTo().alert();
		//Alert alertwindowjs = mywait.until(ExpectedConditions.alertIsPresent());
//        System.out.println(alertwindowjs.getText());
//        alertwindowjs.accept();
		
		
		//alert with ok and cancle
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Alert alertwindow = driver.switchTo().alert();
	    //Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alertwindow.getText());
		alertwindow.accept(); //this will help to accept with the help of ok
//		alertwindow.dismiss(); // this will click on cancle 
		
		
       
	}

}
