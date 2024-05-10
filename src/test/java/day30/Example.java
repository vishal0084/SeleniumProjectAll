 package day30;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act = new Actions(driver);
		//act.sendKeys(Keys.DELETE).perform();
		act.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		
	}
 
}
