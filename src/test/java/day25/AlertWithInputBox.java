 package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWithInputBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert alertelement =driver.switchTo().alert();
		System.out.println(alertelement.getText());
		alertelement.sendKeys("Vishal Kumar"); 
		//Thread.sleep(4000);
		//alertelement.accept();
		alertelement.dismiss();
		
		WebElement data=driver.findElement(By.xpath("//p[@id=\"result\"]"));
		System.out.println(data.getText());

	}

}
