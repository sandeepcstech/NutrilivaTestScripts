package Seller_Panel;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registration {
	 
	 public String username = "infocsquaretech";
	    public String accesskey = "l8hpRsQltu5reEtFBnlcYllrNM6KXNUxSmKzzizJ8alj0HDDo8";
	    public static RemoteWebDriver driver = null;
	    public String gridURL = "@hub.lambdatest.com/wd/hub";
	    boolean status = false;
	    
		@BeforeClass
		 @org.testng.annotations.Parameters(value={"browser","version","platform"})
		public void setUp() {
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("build", "your build name");
			capabilities.setCapability("name", "your test name");
			capabilities.setCapability("platform", "Windows 10");
			capabilities.setCapability("browserName", "Firefox");
			capabilities.setCapability("version","77.0");
			capabilities.setCapability("resolution","1366x768");
			capabilities.setCapability("selenium_version","3.13.0");
			capabilities.setCapability("console",true);
			capabilities.setCapability("network",true);
			capabilities.setCapability("visual",true);
			capabilities.setCapability("timezone","UTC+05:30");
			capabilities.setCapability("firefox.driver","v0.26.0");
			
			  try {
		            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
		        } catch (MalformedURLException e) {
		            System.out.println("Invalid grid URL");
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		        }
		}
	@Test()
	public void testRegistrationsignup() throws InterruptedException {
		 driver.get("http://nutriliva.cstechns.com/");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[@class='close']//img[@src='images/cross.svg']")).click();
		 String main=driver.getWindowHandle();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
			driver.findElement(By.linkText("Sell With Us")).click();
			String s=driver.getTitle();
			System.out.println("Page Title is"+s);
			 
			driver.navigate().to("http://sellernutriliva.cstechns.com/register");
			driver.switchTo().window(main);
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("right_txtname")).sendKeys("A.S.K");
			driver.findElement(By.id("right_txtemailid")).sendKeys("sandeepkumar@cstech.in");
			driver.findElement(By.id("right_txtpwd")).sendKeys("Xyz@123");
			driver.findElement(By.id("right_txtcpwd")).sendKeys("Xyz@123");
			driver.findElement(By.id("right_txtcontact")).sendKeys("09912478798");
			driver.findElement(By.id("Agree")).click();	
			driver.findElement(By.xpath("//input[@value='REGISTER']")).click();
			driver.findElement(By.xpath("//button[@class='confirm']")).click();
			
			Thread.sleep(2000);

        driver.get("https://gmail.com/");
        driver.findElement(By.id("identifierId")).sendKeys("sandeepkumar@cstech.in"+Keys.ENTER);
        driver.findElement(By.name("password")).sendKeys("San@30041994"+Keys.ENTER);
        Thread.sleep(2000);
			List<WebElement> unreademail = driver.findElements(By.className("zE"));
			System.out.println("Total No. of Unread Mails: " + unreademail.size());
			for(int i=0;i<unreademail.size();i++){

				System.out.println(unreademail.get(i).getText());

				}
			Thread.sleep(1000);
			unreademail.get(0).click();	
			WebElement link=driver.findElement(By.xpath("//a[contains(@href,'http://sellernutriliva.cstechns.com/SupplierRegistration/')]"));
			link.click();	
	}
@AfterClass
public void tearDown() throws InterruptedException {

	driver.close();
	
}	
}
