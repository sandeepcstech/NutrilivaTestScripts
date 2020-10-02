package Admin_Panel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class productApproval {
	
	

	 public static WebDriver driver;
		@BeforeClass
		public void setUp() {
		String browser="Firefox";
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
		public void testproductApproval() throws InterruptedException {
			
//			driver.get("http://siteadminnutriliva.cstechns.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.findElement(By.name("txtLogin")).sendKeys("nutriliva@cstech.in");
//			driver.findElement(By.name("txtPassword")).sendKeys("45824582");
//			driver.findElement(By.name("btnSubmit")).click();
//			
//			WebElement element =	driver.findElement(By.id("liCatalog"));
//			Actions action= new Actions(driver);
//			action.moveToElement(element).build().perform();
//			driver.findElement(By.linkText("Product's List")).click();
//			
//1st product admin approves			
//			driver.findElement(By.xpath("//input[@prdcode='SKU0001']")).click(); //change based on SKU code
//			driver.findElement(By.linkText("Bulk Active")).click();
//			Thread.sleep(1000);
//			driver.switchTo().alert().accept();
//			driver.navigate().refresh();
//			
//2nd product rejection by admin
//			Thread.sleep(1000);
//			
//			List<WebElement> Reject = driver.findElements(By.xpath("//img[@src='images/reject3.gif']"));
//			for(int i=0;i<Reject.size();i++){
//
//				System.out.println(Reject.get(i));
//
//				}
//			Reject.get(1).click();
//			Thread.sleep(1000); 
//			driver.findElement(By.xpath("//textarea[@id='txtdesc']")).sendKeys("Resubmit the Product again");
//			driver.findElement(By.linkText("GO")).click();
//			driver.switchTo().alert().accept();
	//	driver.switchTo().alert().accept();

////3rd product admin approves
//			driver.findElement(By.xpath("//input[@prdcode='SKU003']")).click(); //change based on SKU code
//			driver.findElement(By.linkText("Bulk Active")).click();
//			Thread.sleep(1000);
//			driver.switchTo().alert().accept();
			
//			driver.get("http://sellernutriliva.cstechns.com/");
//			driver.findElement(By.linkText("Login")).click();
//			
//			driver.findElement(By.id("left_txtemail")).sendKeys("habewe1841@debsmail.com");
//			driver.findElement(By.id("left_txtpwd")).sendKeys("1234");
//			driver.findElement(By.id("signin_btnlogin")).click();
//			
//			driver.findElement(By.linkText("Product List")).click();
//		List<WebElement> ManagePrice =	driver.findElements(By.xpath("//img[@title='Manage Price & Stock']"));
//		for(int i=0;i<ManagePrice.size();i++){
//
//			System.out.println(ManagePrice.get(i));
//
//			}
//		ManagePrice.get(1).click();
//		
//			driver.findElement(By.id("0Price")).clear();
//			driver.findElement(By.id("0Price")).sendKeys("600");
//
//			driver.findElement(By.id("0offerPrice")).clear();
//			driver.findElement(By.id("0offerPrice")).sendKeys("560");
//			
//			driver.findElement(By.id("1Price")).clear();
//			driver.findElement(By.id("1Price")).sendKeys("900");
//
//			driver.findElement(By.id("1offerPrice")).clear();
//			driver.findElement(By.id("1offerPrice")).sendKeys("810");
//			
//			driver.findElement(By.name("0Stock")).clear();
//			driver.findElement(By.name("0Stock")).sendKeys("10");
//			
//			driver.findElement(By.name("0Stockremove")).clear();
//			driver.findElement(By.name("0Stockremove")).sendKeys("0");
//			
//			driver.findElement(By.name("1Stock")).clear();
//			driver.findElement(By.name("1Stock")).sendKeys("10");
//			
//			driver.findElement(By.name("1Stockremove")).clear();
//			driver.findElement(By.name("1Stockremove")).sendKeys("01");
//			
//			driver.findElement(By.id("0chkdefaultval")).click();
//			driver.findElement(By.linkText("Submit")).click();
//			
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//a[@href='supplierwelcome']")).click();
//			
//			driver.get("http://siteadminnutriliva.cstechns.com/");
//			driver.findElement(By.name("txtLogin")).sendKeys("nutriliva@cstech.in");
//			driver.findElement(By.name("txtPassword")).sendKeys("45824582");
//			driver.findElement(By.name("btnSubmit")).click();
//			
//			WebElement element =	driver.findElement(By.id("liCatalog"));
//			Actions action= new Actions(driver);
//			action.moveToElement(element).build().perform();
//			driver.findElement(By.linkText("Product's List")).click();
//			
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//input[@prdcode='SKU002']")).click(); //change based on SKU code
//			driver.findElement(By.linkText("Bulk Active")).click();
//			Thread.sleep(1000);
//			driver.switchTo().alert().accept();
//			driver.navigate().refresh();
			
			driver.get("http://nutriliva.cstechns.com/");
			driver.findElement(By.className("input_search")).sendKeys("brain-"+Keys.ENTER);
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//img[@src='images/cross.svg']"));
		
		}

}
