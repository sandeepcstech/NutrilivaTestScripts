package Admin_Panel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PromotionDiscount {

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
		
		@Test
		public void testPromoDiscount() {
			
			driver.get("http://siteadminnutriliva.cstechns.com/");
			driver.get("http://siteadminnutriliva.cstechns.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("txtLogin")).sendKeys("nutriliva@cstech.in");
			driver.findElement(By.name("txtPassword")).sendKeys("45824582");
			
			driver.findElement(By.name("btnSubmit")).click();
			
			WebElement element =	driver.findElement(By.id("liSales_parent"));
			Actions action= new Actions(driver);
			action.moveToElement(element).build().perform();
			driver.findElement(By.linkText("Promotions")).click();
			driver.findElement(By.id("AccjA")).click();
			driver.findElement(By.id("chk_slab")).click();
			
			driver.findElement(By.id("txt_datefrom")).click();
			driver.findElement(By.linkText("1")).click();
			
			driver.findElement(By.id("txt_dateto")).click();
			driver.findElement(By.linkText("20")).click();
			
			driver.findElement(By.id("txt_amount")).sendKeys("1500");
			driver.findElement(By.xpath("//input[@value='Flat']")).click();
			
			driver.findElement(By.id("txt_discount")).sendKeys("500");
			driver.findElement(By.linkText("Submit")).click();
			driver.findElement(By.linkText("Finish")).click();
		}
	
}
