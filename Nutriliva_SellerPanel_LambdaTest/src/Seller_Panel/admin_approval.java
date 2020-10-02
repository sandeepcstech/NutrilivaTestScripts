package Seller_Panel;

import java.util.List;
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

public class admin_approval {
	
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
		public void testAdminApproval() throws InterruptedException {
			
			driver.get("http://siteadminnutriliva.cstechns.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("txtLogin")).sendKeys("nutriliva@cstech.in");
			driver.findElement(By.name("txtPassword")).sendKeys("45824582");
			
			driver.findElement(By.name("btnSubmit")).click();
		WebElement element =	driver.findElement(By.id("liSales_parent"));
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Sellers")).click();
		
		List<WebElement> Edit = driver.findElements(By.xpath("//i[@title='Edit']"));
		for(int i=0;i<Edit.size();i++){

			System.out.println(Edit.get(i));

			}
		Edit.get(0).click();
		driver.findElement(By.name("txtslaconfrmperiod")).clear();
		driver.findElement(By.name("txtslaconfrmperiod")).sendKeys("12");
		driver.findElement(By.name("txtslashipperiod")).clear();
		driver.findElement(By.name("txtslashipperiod")).sendKeys("24");
		driver.findElement(By.id("rbtLstActive_0")).click();
		Thread.sleep(1000);
				
			driver.findElement(By.linkText("Submit")).click();
			Thread.sleep(2000);
			List<WebElement> CommissionAssign =driver.findElements(By.xpath("//img[@title='Assign']"));
			for(int i=0;i<CommissionAssign.size();i++) {
				
				System.out.println(CommissionAssign.get(i));
			}
			CommissionAssign.get(0).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@title='Edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("0txtCommissionRate")).clear();
			driver.findElement(By.id("0txtCommissionRate")).sendKeys("12.00");
			driver.findElement(By.xpath("//img[@title='Update']")).click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Logout")).click();
		}
		
	@AfterClass()
	public void tearDown() throws InterruptedException {
		driver.close();
		driver.quit();
		
	}
		
		
}
