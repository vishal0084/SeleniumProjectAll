 package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutUsingSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//clicking on the drop down
		driver.findElement(By.xpath("//button[@type=\"button\" and @class=\"multiselect dropdown-toggle btn btn-default\"]")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
        System.out.println(options.size());
         
      //print all options
//        for(WebElement v:options) {
//        	System.out.println(v.getText());
//        }
        
        //select option for drop down
        
        for(int i=0;i< options.size();i++) {
        	String z=options.get(i).getText();
        	if(z.equals("Java") || z.equals("Python")) {
        		options.get(i).click();
        		
        	}
        }
        
	}

}
