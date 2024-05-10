 package day27;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		Actions act = new Actions(driver);
        
		//min slider
		WebElement min_slider= driver.findElement(By.xpath("//span[1]"));
		
		System.out.println("minimum 0f x is " + min_slider.getLocation());

		act.dragAndDropBy(min_slider, 100, 125).build().perform(); 
		
		System.out.println("minimum 0f x is " + min_slider.getLocation());
		
		//max slider
		WebElement max_slider= driver.findElement(By.xpath("//span[2]"));
		
		System.out.println("maximum 0f x is " + max_slider.getLocation());

		act.dragAndDropBy(max_slider, -100, 125).build().perform();
		
		System.out.println("maximum 0f x is " + min_slider.getLocation());
		
	}

}
