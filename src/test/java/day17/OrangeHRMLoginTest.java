 package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
	  //System.setProperty("webdriver.chrome.driver', "C:\\Users\\2317372\\eclipse-workspace\\seleniumWebDriver\\Browser\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize(); 
		Thread.sleep(3000); 
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	    
		WebElement login = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		System.out.println("Tittle of page "+ driver.getTitle());
        
		Thread.sleep(3000);
		try{
		WebElement dashboard=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")); 
	    System.out.println(dashboard.getText());
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
       //driver.close();
	   //driver.quit();
	}

}
