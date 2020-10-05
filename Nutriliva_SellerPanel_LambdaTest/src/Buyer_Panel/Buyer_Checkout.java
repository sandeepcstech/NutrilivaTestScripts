package Buyer_Panel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Buyer_Checkout {
	
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
		public void testProductCheckout() throws InterruptedException {
			
			driver.get("http://nutriliva.cstechns.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='close']//img[@src='images/cross.svg']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
			driver.findElement(By.xpath("//div[text()='Sign In']")).click();
			driver.findElement(By.id("left_txtemail")).sendKeys("sandeepakkic2@gmail.com");
			driver.findElement(By.id("left_txtpwd")).sendKeys("San@30041994");
			driver.findElement(By.id("signin_btnlogin")).click();
		
			Thread.sleep(1000);
			driver.findElement(By.className("input_search")).sendKeys("brain-"+Keys.ENTER);
			 String main=driver.getWindowHandle();
			driver.findElement(By.xpath("//img[@title='Brain-Strips']")).click();
			Thread.sleep(10000);
			driver.switchTo().window(main);
			driver.findElement(By.xpath("//img[@title='Brain-Powder']")).click();
			Thread.sleep(10000);
			driver.switchTo().window(main);
			driver.findElement(By.xpath("//img[@title='Brain-capsules']")).click();
			Thread.sleep(10000);
			driver.switchTo().window(main);
			driver.findElement(By.xpath("//div[text()='Wishlist']")).click();
			driver.switchTo().window(main);
			driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]/a[1]")).click();
			driver.findElement(By.linkText("Add To Cart")).click();
			driver.findElement(By.className("confirm")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[6]/span[1]/a[1]")).click();
			driver.findElement(By.linkText("Add To Cart")).click();
			driver.findElement(By.className("confirm")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[5]/span[1]/a[1]")).click();
			driver.findElement(By.linkText("Add To Cart")).click();
			driver.findElement(By.className("confirm")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("cart_item_count1")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
			driver.findElement(By.id("cod_mop")).click();
			Thread.sleep(2000);
			try {
				WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
				Actions action = new Actions(driver);
				action.moveToElement(placeOrder).click().perform();
			}
		catch(Exception e) {
			e.getMessage();
		}
		Thread.sleep(2000);
		driver.findElement(By.id("txtcodnumber")).click();
				Thread.sleep(20000);
				driver.findElement(By.id("btncodsubmit")).click();
				Thread.sleep(10000);
				try {
				WebElement Home =	driver.findElement(By.xpath("//div[@id='back-home']//a[@href='home']"));
				Actions action2 =new Actions(driver);
				action2.moveToElement(Home).click().perform();
				}
				catch(Exception e) {
					e.getMessage();
				}		

			 
// Product checkout with 10% Coupon on Brain Capsules	 
//			 driver.findElement(By.xpath("//img[@title='Brain-capsules']")).click();
//				Thread.sleep(10000);
//			 driver.switchTo().window(main);
//			 driver.findElement(By.xpath("//div[text()='Wishlist']")).click();
//			driver.findElement(By.xpath("//body/div[@id='page']/form[@id='form1']/div[@id='divdefault']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]/a[1]")).click();
//		driver.findElement(By.linkText("Add To Cart")).click();
//				driver.findElement(By.className("confirm")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.id("cart_item_count1")).click();
//				
//				Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
//			Thread.sleep(2000);
//				driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
//				driver.findElement(By.xpath("//a[@href='javascript:GetCouponDetails();']")).click();
//				driver.findElement(By.xpath("//input[@value='Discount10']")).click();
//				driver.findElement(By.id("fetchcouponcode")).click();
//				driver.switchTo().alert().accept();
//				Thread.sleep(2000);
//			driver.findElement(By.id("cod_mop")).click();
//			Thread.sleep(2000);
//			try {
//				WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
//				Actions action = new Actions(driver);
//				action.moveToElement(placeOrder).click().perform();
//			}
//		catch(Exception e) {
//			e.getMessage();
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.id("txtcodnumber")).click();
//				Thread.sleep(30000);
//				driver.findElement(By.id("btncodsubmit")).click();
//				Thread.sleep(10000);
//				driver.findElement(By.xpath("//div[@id='back-home']//a[@href='home']")).click();
				
//proceed to checkout with 10% coupon on brain strips		
//				 driver.findElement(By.xpath("//img[@title='Brain-Strips']")).click();
//					Thread.sleep(10000);
//				 driver.switchTo().window(main);
//				 driver.findElement(By.xpath("//div[text()='Wishlist']")).click();
//				driver.findElement(By.linkText("Move to Cart")).click();
//			driver.findElement(By.linkText("Add To Cart")).click();
//					driver.findElement(By.className("confirm")).click();
//					Thread.sleep(2000);
//					driver.findElement(By.id("cart_item_count1")).click();
//					
//					Thread.sleep(2000);
//				driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
//				Thread.sleep(2000);
//					driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
//					driver.findElement(By.xpath("//a[@href='javascript:GetCouponDetails();']")).click();
//					driver.findElement(By.xpath("//input[@value='Discount10']")).click();
//					driver.findElement(By.id("fetchcouponcode")).click();
//					driver.switchTo().alert().accept();
//					Thread.sleep(2000);
//				driver.findElement(By.id("cod_mop")).click();
//				Thread.sleep(2000);
//				try {
//					WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
//					Actions action = new Actions(driver);
//					action.moveToElement(placeOrder).click().perform();
//				}
//			catch(Exception e) {
//				e.getMessage();
//			}
//			Thread.sleep(2000);
//			driver.findElement(By.id("txtcodnumber")).click();
//					Thread.sleep(30000);
//					driver.findElement(By.id("btncodsubmit")).click();
//					Thread.sleep(10000);
//					driver.findElement(By.xpath("//div[@id='back-home']//a[@href='home']")).click();

//			 driver.findElement(By.xpath("//img[@title='Brain-Powder']")).click();
//				Thread.sleep(10000);
//			 driver.switchTo().window(main);
//			 driver.findElement(By.xpath("//div[text()='Wishlist']")).click();
//			driver.findElement(By.linkText("Move to Cart")).click();
//		driver.findElement(By.linkText("Add To Cart")).click();
//				driver.findElement(By.className("confirm")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.id("cart_item_count1")).click();
//				
//				Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
//			Thread.sleep(2000);
//				driver.findElement(By.xpath("//a[text()='PROCEED TO CHECKOUT']")).click();
//				driver.findElement(By.xpath("//a[@href='javascript:GetCouponDetails();']")).click();
//				driver.findElement(By.xpath("//input[@value='Flat 300']")).click();
//				driver.findElement(By.id("fetchcouponcode")).click();
//				driver.switchTo().alert().accept();
//				Thread.sleep(2000);
//			driver.findElement(By.id("cod_mop")).click();
//			Thread.sleep(2000);
//			try {
//				WebElement placeOrder=driver.findElement(By.xpath("//a[@id='btnplaceorder']"));
//				Actions action = new Actions(driver);
//				action.moveToElement(placeOrder).click().perform();
//			}
//		catch(Exception e) {
//			e.getMessage();
//		}
//		Thread.sleep(2000);
//		driver.findElement(By.id("txtcodnumber")).click();
//				Thread.sleep(20000);
//				driver.findElement(By.id("btncodsubmit")).click();
//				Thread.sleep(10000);
//				try {
//				WebElement Home =	driver.findElement(By.xpath("//div[@id='back-home']//a[@href='home']"));
//				Actions action2 =new Actions(driver);
//				action2.moveToElement(Home).click().perform();
//				}
//				catch(Exception e) {
//					e.getMessage();
//				}		
				}
		@AfterClass
		public void tearDown() {
			driver.close();
		}
}
