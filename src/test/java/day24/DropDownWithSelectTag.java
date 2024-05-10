  package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		
		WebElement dropcountryele=driver.findElement(By.xpath("//select[@id='country-list']"));
        Select drpdowncounrty=new Select(dropcountryele);
        
        //selecting the valur from drp down 
        //drpdowncounrty.selectByVisibleText("USA");
        //drpdowncounrty.selectByIndex(2);
        //drpdowncounrty.selectByValue("3");//use this only if value present for option tag
        
        //taking all option in list and find total
        List<WebElement> option=drpdowncounrty.getOptions();
        System.out.println("total no of options "+option.size());
        
        //print all options
        for(WebElement v:option) {
        	System.out.println(v.getText());
        }
        
	}

}
