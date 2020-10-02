package Seller_Panel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registration {
	 public static WebDriver driver;
	@BeforeClass
	public void setUp() {
	String browser="Chrome";
	if(browser.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browser.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	}
	@Test()
	public void testRegistrationsignup() throws InterruptedException {
		
		
		 driver.get("http://nutriliva.cstechns.com/");
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
			unreademail.get(0).click();
			Thread.sleep(1000);
			
			
	}
@AfterClass
public void tearDown() throws InterruptedException {
	WebElement link=driver.findElement(By.xpath("//a[contains(@href,'http://sellernutriliva.cstechns.com/SupplierRegistration/')]"));
	link.click();
	String s1=driver.getCurrentUrl();
	System.out.println(s1);
	
}	
}
