 package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver set up
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
						
		//maximize window
		driver.manage().window().maximize();
						
		//open application
		driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
		
		String v= driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[2]/div[1]/h4/a")).getText();
        System.out.println(v);
	} 

}
