   package TestNGCASProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CasProjectNews {
	
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	public void openBeCognizant(String browser) throws InterruptedException, IOException {
		
		if(browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Be.cognizant is open ");
		Thread.sleep(10000);
		
		//Take Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\2317372\\eclipse-workspace\\seleniumproject\\screenshot\\beCognizant.png");
		FileUtils.copyFile(src, trg);
		
		
		}
	
	@Test(priority=1)
	public void getUserInformation() throws InterruptedException, IOException {
		
		//declear explit wait 
		WebDriverWait myWait = new WebDriverWait(driver , Duration.ofSeconds(10));
		
		WebElement userClick = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"VK\"]")));
		userClick.click();
		
		WebElement userName = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"mectrl_currentAccount_primary\"]")));
		System.out.println("Name of user : " + userName.getText());
		
		WebElement userEmail = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"mectrl_currentAccount_secondary\"]")));
		System.out.println("Email of user : " + userEmail.getText());
		
		Thread.sleep(5000);
		
		//Take Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\2317372\\eclipse-workspace\\seleniumproject\\screenshot\\userdetail.png");
		FileUtils.copyFile(src, trg);
		
	}
	
	@Test(priority=2)
	public void validateTooltipHeader() throws InterruptedException, IOException {
		
	    List<WebElement> allNews = driver.findElements(By.xpath("//a[@id=\"news_text_title\"][@data-automation-id=\"newsItemTitle\"]"));
	    int newsSize=allNews.size();
		for(int i=0;i<newsSize-1;i++) {
			String newsHeader = allNews.get(i).getText();
			String newsToolTip = allNews.get(i).getAttribute("title");
			System.out.println("NEWS"+(i+1)+"----->");
			System.out.println("====================");
			System.out.println("News Header : " + newsHeader);
			System.out.println("News ToolTip : " +newsToolTip);
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(newsHeader, newsToolTip, "News Header and ToolTip are Not matched");
			Thread.sleep(5000);
		}
		
		//Take Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\2317372\\eclipse-workspace\\seleniumproject\\screenshot\\beCognizantHeader.png");
		FileUtils.copyFile(src, trg);
		
	}
	
	@Test(priority=3)
	public void newsFeature() throws InterruptedException, IOException {
		

		List<WebElement> news = driver.findElements(By.xpath("//a[@id='news_text_title'][@data-automation-id='newsItemTitle']"));
		int nsize=news.size();
		
		
		for(int i=0;i<nsize-1;i++) {
			List<WebElement> newsEach = driver.findElements(By.xpath("//a[@id='news_text_title'][@data-automation-id='newsItemTitle']"));
			WebElement oneNews =newsEach.get(i);
			oneNews.click();
			Thread.sleep(5000);
			
			//Taking Text for each news
			List<WebElement> newsText = driver.findElements(By.xpath("//div[@data-automation-id=\"textBox\"]/p"));
			for(WebElement text:newsText) {
			System.out.println(text.getText());
			}
			System.out.println("=========================");
			Thread.sleep(5000);
			
			//validate associate details 
			Actions act= new Actions(driver);
			WebElement hoverElement = driver.findElement(By.xpath("//div[@aria-haspopup='dialog']"));
			act.moveToElement(hoverElement).build().perform();
			Thread.sleep(5000);
			
			
			//taking associate details
			WebElement associateName = driver.findElement(By.xpath("//h1[@data-log-name='DisplayName']"));
			System.out.println("Associate Name : " +associateName.getText());
			Thread.sleep(5000);
			
//			//job title 
			WebElement associateJobTittle = driver.findElement(By.xpath("//div[@data-log-name='JobTitle']"));
			System.out.println("Associate Job Tittle : " +associateJobTittle.getText());
			Thread.sleep(5000);
			
//			//department
			WebElement associateDepartment = driver.findElement(By.xpath("//div[@data-log-name=\"CompanyOrDepartment\"]"));
			System.out.println("Associate Job Tittle : " +associateDepartment.getText());
			Thread.sleep(5000);
			
			System.out.println("=========================");
			
			//check hyperlink
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			for(WebElement link:allLinks ) {
				String hyperLink = link.getAttribute("href");
				if(hyperLink== null || hyperLink.isEmpty() ) {
					System.out.println("There is no hyper link is present in this news page ");
				}
				else {
					System.out.println("There is  hyper link is present in this news page ");
				}
				System.out.println("------------------------------------");
			}
			
			//validate share option
			driver.findElement(By.xpath("//span[text()='Share']")).click();
			
			WebElement text1=driver.findElement(By.xpath("//span[text()='Share page']"));
			System.out.println(text1.getText());
			
			WebElement text2=driver.findElement(By.xpath("//span[text()='Copy link to page']"));
			System.out.println(text2.getText());
			
			WebElement text3=driver.findElement(By.xpath("//span[text()='Send to email']"));
			System.out.println(text3.getText());
			
			System.out.println("===========================");
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			WebElement like = driver.findElement(By.xpath("//*[@id='CommentsWrapper']"));
			js.executeScript("arguments[0].scrollIntoView();", like);
			
			Thread.sleep(3000);
			
			WebElement totalLikes=driver.findElement(By.xpath("//*[@id='vpc_Page.CommentsWrapper.internal.2610b4b4-550c-4548-b431-aa3ab709c184']/div/div/aside/div[1]/button/span/span/span"));
			WebElement totalViews=driver.findElement(By.xpath("//*[@id='vpc_Page.CommentsWrapper.internal.2610b4b4-550c-4548-b431-aa3ab709c184']/div/div/aside/div[4]/button/span/span/span"));
			
			System.out.println("Number of Likes: " + totalLikes.getText());
			System.out.println("Number of Views : " + totalViews.getText());
			Thread.sleep(5000);
			
			//Take Screenshot
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File trg=new File("C:\\Users\\2317372\\eclipse-workspace\\seleniumproject\\screenshot\\news.png");
			FileUtils.copyFile(src, trg);
			
			driver.navigate().back();
			Thread.sleep(5000);
		}
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		System.out.println("Close The Browser");
		driver.quit();
	}

}
