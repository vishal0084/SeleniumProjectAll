 package miniprojectselenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniProject {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try { 
		WebElement switchTo=driver.findElement(By.linkText("SwitchTo"));
		//creating instance of the interface Actions
		Actions action=new Actions(driver);
		action.moveToElement(switchTo).build().perform();
		Thread.sleep(10000);
		
		//Working with the Alert with OK
		
		WebElement alerts=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
		alerts.click(); 
		Thread.sleep(3000);
		WebElement alertWithOk=driver.findElement(By.className("analystic"));
		alertWithOk.click();
		Thread.sleep(3000);
		WebElement click1=driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		click1.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   	    Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	//	Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		
		
		//Working with Alert with Ok & Cancel
		
		WebElement alertWithOkAndCancel=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		Thread.sleep(3000);
		alertWithOkAndCancel.click();
		WebElement click2=driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		click2.click();
		Alert alert2=wait.until(ExpectedConditions.alertIsPresent());
	//	Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert2.dismiss();
		
		WebElement txt1=driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		System.out.println("The text that appears after clicking cancel button is: "+txt1.getText());
		Thread.sleep(5000);
		
		
		//Working with Alert with a textbox
		
		WebElement alertWithTextbox=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alertWithTextbox.click();
		WebElement click3=driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		click3.click();
		Alert alert3=wait.until(ExpectedConditions.alertIsPresent());
		//Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Vishal Kumar");
		Thread.sleep(3000);
		alert3.accept();
		
		WebElement txt2=driver.findElement(By.xpath("//*[@id=\"demo1\"]"));
		System.out.println("The text that appears after entering name is: "+txt2.getText());
	    }
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
		driver.quit();
		}
		
	}
}
