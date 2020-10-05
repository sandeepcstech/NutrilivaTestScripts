package Seller_Panel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SellerFullFiillingBuyerOrders {
	
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
	public void testSellerFullfillment() throws InterruptedException, AWTException {
		
		driver.get("http://sellernutriliva.cstechns.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("left_txtemail")).sendKeys("sandeepkumar@cstech.in");
		driver.findElement(By.id("left_txtpwd")).sendKeys("Xyz@123");
		driver.findElement(By.id("signin_btnlogin")).click();
		
		//Approving all the buyer orders and Shipping
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//a[@href='suppliermyaccount/all']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.mousePress(InputEvent.BUTTON2_DOWN_MASK); 
		
		List<WebElement> ManageOrder = driver.findElements(By.xpath("//img[@title='MANAGE ORDER']"));
		for(int i=0;i<ManageOrder.size();i++){
		ManageOrder.get(i).click();
		
	WebElement ShippingStatus = driver.findElement(By.id("orderstatustype"));
		Select option= new Select(ShippingStatus);
		option.selectByVisibleText("Confirm");
	Thread.sleep(1000);
		
		driver.findElement(By.linkText("Submit")).click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		}
		
		
//		ManageOrder.get(1).click();
//		
//		WebElement ShippingStatus2 = driver.findElement(By.id("orderstatustype"));
//		Select option2= new Select(ShippingStatus2);
//		option2.selectByVisibleText("Confirm");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.linkText("Submit")).click();
//		
//		Thread.sleep(2000);
//		
//		ManageOrder.get(2).click();
//		
//		WebElement ShippingStatus3 = driver.findElement(By.id("orderstatustype"));
//		Select option3= new Select(ShippingStatus3);
//		option3.selectByVisibleText("Confirm");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.linkText("Submit")).click();
//		Thread.sleep(2000);
//		
//		
//		
//		ManageOrder.get(3).click();
//		
//		WebElement ShippingStatus4 = driver.findElement(By.id("orderstatustype"));
//		Select option4= new Select(ShippingStatus4);
//		option4.selectByVisibleText("Confirm");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.linkText("Submit")).click();
//		
//		Thread.sleep(2000);
//		
//		
//		ManageOrder.get(4).click();
//		
//		WebElement ShippingStatus5 = driver.findElement(By.id("orderstatustype"));
//		Select option5= new Select(ShippingStatus5);
//		option5.selectByVisibleText("Confirm");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.linkText("Submit")).click();
//		
//		Thread.sleep(2000);
//		
//		
//		ManageOrder.get(5).click();
//		
//		WebElement ShippingStatus6 = driver.findElement(By.id("orderstatustype"));
//		Select option6= new Select(ShippingStatus6);
//		option6.selectByVisibleText("Confirm");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.linkText("Submit")).click();
//		Thread.sleep(5000);
//		
	}
		
		@AfterClass
		public void tearDown() {
			driver.close();
		}
	
	}