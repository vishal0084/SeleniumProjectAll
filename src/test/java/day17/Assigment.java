  package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment {

	public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
      driver.manage().window().maximize();
      
      Thread.sleep(4000);
      
      WebElement email=driver.findElement(By.id("Email")); 
      email.clear(); 
      Thread.sleep(4000);
      email.sendKeys("admin@yourstore.com");
      
      WebElement password = driver.findElement(By.id("Password"));
      password.clear();
      Thread.sleep(4000);
      password.sendKeys("admin");
      
      WebElement login = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
      login.click();
      
      WebElement abc = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1"));
      System.out.println(abc.getText());
      
      Thread.sleep(4000);
      driver.quit();

      
      
	}

}
