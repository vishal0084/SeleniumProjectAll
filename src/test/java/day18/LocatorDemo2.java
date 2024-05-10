 package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		//driver set up
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		 
		//open application
		driver.get("http://www.automationpractice.pl/index.php");
		
		Thread.sleep(4000);
		
		//finding number of slides
	 	List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
	    System.out.println("slidebar"+sliders.size());
	
	    //total no of image
	    List<WebElement> images = driver.findElements(By.tagName("img"));
	    System.out.println("images"+images.size());
	    
	    //total no of links
	    List<WebElement> links= driver.findElements(By.tagName("a"));
	    System.out.println("links are "+ links.size());
		
		
	}

}
