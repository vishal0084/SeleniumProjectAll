 package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleInnerFramesDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
		WebElement frm1= driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("111111");
		
		driver.switchTo().defaultContent(); 
		
		//frame2
		WebElement frm2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frm2);
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("2222");
		
		driver.switchTo().defaultContent();
		
		//frame4
		WebElement frm4=driver.findElement(By.xpath("//frame[@src=\"frame_4.html\"]"));
		driver.switchTo().frame(frm4);
		driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("44444");
		
		driver.switchTo().defaultContent();
		
		//frame5
		WebElement frm5=driver.findElement(By.xpath("//frame[@src=\"frame_5.html\"]"));
		driver.switchTo().frame(frm5);
		driver.findElement(By.xpath("//input[@name=\"mytext5\"]")).sendKeys("55555");
		
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frm3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("333333");
		
		//iframe of 3
//		WebElement ifrm3 = driver.findElement(By.xpath("//iframe[@src=\"https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true\"]"));
//		driver.switchTo().frame(ifrm3);
		driver.switchTo().frame(0);
		
		
		

	}

}
