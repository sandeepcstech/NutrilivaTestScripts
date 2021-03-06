package Admin_Panel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Coupon_Discount {

	
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
		public void testCouponDiscount() throws InterruptedException {
			
			driver.get("http://siteadminnutriliva.cstechns.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.findElement(By.name("txtLogin")).sendKeys("nutriliva@cstech.in");
			driver.findElement(By.name("txtPassword")).sendKeys("45824582");
			
			driver.findElement(By.name("btnSubmit")).click();
//10 percent discount coupon			
			WebElement element =	driver.findElement(By.id("liSales_parent"));
			Actions action= new Actions(driver);
			action.moveToElement(element).build().perform();
			driver.findElement(By.linkText("Coupon Codes")).click();
			driver.findElement(By.linkText("Create New")).click();
			
			driver.findElement(By.id("txtcode")).sendKeys("Discount10");
			driver.findElement(By.id("txtdiscountcapping")).sendKeys("500");
			driver.findElement(By.id("txtdiscount")).sendKeys("10");
			driver.findElement(By.id("txtUpperLimit")).sendKeys("1000");
			driver.findElement(By.id("txtvaliditystartdate")).click();
			driver.findElement(By.linkText("1")).click();
			driver.findElement(By.id("txtvalidityenddate")).click();
			driver.findElement(By.linkText("25")).click();
			driver.findElement(By.id("txtdesc")).sendKeys("10 percent discount on cart amount of 1000/-");
			driver.findElement(By.id("txtcouponuses")).clear();
			driver.findElement(By.id("txtcouponuses")).sendKeys("10");
			driver.findElement(By.id("txtuseruses")).clear();
			driver.findElement(By.id("txtuseruses")).sendKeys("2");
			Thread.sleep(2000);
			driver.findElement(By.id("btn_next")).click();
			driver.findElement(By.id("chk3")).click();
			driver.findElement(By.id("chk4")).click();
			driver.findElement(By.id("chk7")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Publish")).click();
//Flat 500 off coupon			
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Create New")).click();	
			driver.findElement(By.id("txtcode")).sendKeys("Flat 500");
			driver.findElement(By.xpath("//input[@value='Flat']")).click();
			driver.findElement(By.id("txtdiscount")).sendKeys("500");
			driver.findElement(By.id("txtUpperLimit")).clear();
			driver.findElement(By.id("txtUpperLimit")).sendKeys("1500");
			driver.findElement(By.id("txtvaliditystartdate")).click();
			driver.findElement(By.linkText("1")).click();
			driver.findElement(By.id("txtvalidityenddate")).click();
			driver.findElement(By.linkText("25")).click();
			driver.findElement(By.id("txtdesc")).sendKeys("Flat 500 off on order amount of 1500/-");
			driver.findElement(By.id("txtcouponuses")).clear();
			driver.findElement(By.id("txtcouponuses")).sendKeys("10");
			driver.findElement(By.id("txtuseruses")).clear();
			driver.findElement(By.id("txtuseruses")).sendKeys("2");
			
			
			Thread.sleep(2000);
			driver.findElement(By.id("btn_next")).click();
			driver.findElement(By.id("chk3")).click();
			driver.findElement(By.id("chk4")).click();
			driver.findElement(By.id("chk7")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Publish")).click();
			
			Thread.sleep(5000);
			
			
			
		}
		@AfterClass()
		public void tearDown() {
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
			driver.quit();
		}
}
