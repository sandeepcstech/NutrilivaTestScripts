package Seller_Panel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sellerLogin_AddProducts {
	
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
		public void sellerAddingProducts() throws InterruptedException {		
			driver.get("http://sellernutriliva.cstechns.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("left_txtemail")).sendKeys("sandeepkumar@cstech.in");
			driver.findElement(By.id("left_txtpwd")).sendKeys("Xyz@123");
			driver.findElement(By.id("signin_btnlogin")).click();
//product 1 adding			
			Thread.sleep(5000);
			WebElement element = driver.findElement(By.xpath("//a[@href='supplierproductlist']"));
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
			driver.findElement(By.linkText("Add Single Listing")).click();
			WebElement w1=driver.findElement(By.id("maincategory"));
			Select option=new Select(w1);
			option.selectByIndex(2);
			
			WebElement w2 = driver.findElement(By.id("ddlcommissioncategory"));
			Select option2= new Select(w2);
			option2.selectByIndex(1);
			
			
			WebElement w3 = driver.findElement(By.id("ddlsubcategorywithcommision"));
			Select option3= new Select(w3);
			option3.selectByIndex(1);
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("NEXT")).click();
			
			driver.findElement(By.id("myTreeViewn15CheckBox")).click();
			driver.findElement(By.xpath("//a[@id='myTreeViewn15']//img[@src='images/iconPlus.png']")).click();
			
			
			driver.findElement(By.id("myTreeViewn16CheckBox")).click();
			driver.findElement(By.xpath("//a[@id='myTreeViewn16']//img[@src='images/iconPlus.png']")).click();
			
			driver.findElement(By.id("myTreeViewn17CheckBox")).click();
			
			driver.findElement(By.linkText("NEXT")).click();
	
				WebElement w4 = driver.findElement(By.id("ddlproducttype"));
				Select option4= new Select(w4);
				option4.selectByIndex(1);
				Thread.sleep(1000);
				
			driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("Brain-capsules");
			Thread.sleep(1000);
			driver.findElement(By.id("txt_hsn")).sendKeys("HSN12344");
			driver.findElement(By.id("txt_igst")).sendKeys("18"+Keys.ENTER);
			Thread.sleep(1000);
			
			driver.findElement(By.id("txt_desc")).sendKeys("Product 1");
			Thread.sleep(1000);
			driver.findElement(By.id("txt_Skucode")).sendKeys("SKU0001");
			driver.findElement(By.id("fl_MainImg")).sendKeys("C:\\Users\\USER\\Documents\\BrainCapsules.jpg");
			
			WebElement w5 = driver.findElement(By.id("ddlretunpolicy"));
			Select option5= new Select(w5);
			option5.selectByVisibleText("No Returns");
			Thread.sleep(1000);
			driver.findElement(By.linkText("NEXT")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("Checkl41_1")).click();
			driver.findElement(By.linkText("NEXT")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("rbt_cod_0")).click();
			driver.findElement(By.id("txt_Weight")).clear();
			driver.findElement(By.id("txt_Weight")).sendKeys("1000");
			driver.findElement(By.xpath("//span[@class='button_03']//a[@id='LinkButton1']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='product button_03']//a[@id='LinkButton1']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("txtmrpall")).sendKeys("450");
			driver.findElement(By.id("txtofferall")).sendKeys("420");
			driver.findElement(By.linkText("Confirm")).click();
			driver.findElement(By.name("0Stock")).clear();
			driver.findElement(By.name("0Stock")).sendKeys("10");
			driver.findElement(By.name("0Stockremove")).clear();
			driver.findElement(By.name("0Stockremove")).sendKeys("01");
			driver.findElement(By.id("0chkdefaultval")).click();
			driver.findElement(By.linkText("Submit")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='supplierwelcome']")).click();

// product 2 adding with color variation
			
			driver.findElement(By.linkText("Add Single Listing")).click();
			WebElement w6=driver.findElement(By.id("maincategory"));
			Select option6=new Select(w6);
			option6.selectByIndex(2);
			
			WebElement w7 = driver.findElement(By.id("ddlcommissioncategory"));
			Select option7= new Select(w7);
			option7.selectByIndex(1);
			
			
			WebElement w8 = driver.findElement(By.id("ddlsubcategorywithcommision"));
			Select option8= new Select(w8);
			option8.selectByIndex(1);
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("NEXT")).click();
			
			driver.findElement(By.id("myTreeViewn15CheckBox")).click();
			driver.findElement(By.xpath("//a[@id='myTreeViewn15']//img[@src='images/iconPlus.png']")).click();
			
			
			driver.findElement(By.id("myTreeViewn16CheckBox")).click();
			driver.findElement(By.xpath("//a[@id='myTreeViewn16']//img[@src='images/iconPlus.png']")).click();
			
			driver.findElement(By.id("myTreeViewn17CheckBox")).click();
			
			driver.findElement(By.linkText("NEXT")).click();
				
				WebElement w9 = driver.findElement(By.id("ddlproducttype"));
				Select option9= new Select(w9);
				option9.selectByIndex(2);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("Brain-Strips");
				Thread.sleep(1000);
				driver.findElement(By.id("txt_hsn")).sendKeys("HSN1289");
				Thread.sleep(1000);
				driver.findElement(By.id("txt_igst")).sendKeys("18");
				
				driver.findElement(By.id("txt_desc")).sendKeys("Product 2");
				driver.findElement(By.id("txt_Skucode")).sendKeys("SKU002");
				driver.findElement(By.id("fl_MainImg")).sendKeys("C:\\Users\\USER\\Documents\\BrainStrips.jpg");
				
				WebElement w10 = driver.findElement(By.id("ddlretunpolicy"));
				Select option10= new Select(w10);
				option10.selectByVisibleText("3 days");
				
				driver.findElement(By.linkText("NEXT")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("Checkl22_0")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("Checkl22_1")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("NEXT")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("rbt_cod_0")).click();
				driver.findElement(By.id("txt_Weight")).sendKeys("1000");
				driver.findElement(By.xpath("//span[@class='button_03']//a[@id='LinkButton1']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@class='product button_03']//a[@id='LinkButton1']")).click();
				Thread.sleep(2000);
				
				
				driver.findElement(By.id("0Price")).clear();
				driver.findElement(By.id("0Price")).sendKeys("500");

				driver.findElement(By.id("0offerPrice")).clear();
				driver.findElement(By.id("0offerPrice")).sendKeys("420");
				
				driver.findElement(By.id("1Price")).clear();
				driver.findElement(By.id("1Price")).sendKeys("1000");

				driver.findElement(By.id("1offerPrice")).clear();
				driver.findElement(By.id("1offerPrice")).sendKeys("800");
				
				driver.findElement(By.name("0Stock")).clear();
				driver.findElement(By.name("0Stock")).sendKeys("10");
				
				driver.findElement(By.name("0Stockremove")).clear();
				driver.findElement(By.name("0Stockremove")).sendKeys("0");
				
				driver.findElement(By.name("1Stock")).clear();
				driver.findElement(By.name("1Stock")).sendKeys("10");
				
				driver.findElement(By.name("1Stockremove")).clear();
				driver.findElement(By.name("1Stockremove")).sendKeys("01");
				
				driver.findElement(By.id("0chkdefaultval")).click();
				driver.findElement(By.linkText("Submit")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@href='supplierwelcome']")).click();
				
 // product 3 adding with color and size variation
		
				driver.findElement(By.linkText("Add Single Listing")).click();
				WebElement w11=driver.findElement(By.id("maincategory"));
				Select option11=new Select(w11);
				option11.selectByIndex(2);
				
				WebElement w12 = driver.findElement(By.id("ddlcommissioncategory"));
				Select option12= new Select(w12);
				option12.selectByIndex(1);
				
				
				WebElement w13 = driver.findElement(By.id("ddlsubcategorywithcommision"));
				Select option13= new Select(w13);
				option13.selectByIndex(1);
				
				Thread.sleep(2000);
				driver.findElement(By.linkText("NEXT")).click();
				
				driver.findElement(By.id("myTreeViewn15CheckBox")).click();
				driver.findElement(By.xpath("//a[@id='myTreeViewn15']//img[@src='images/iconPlus.png']")).click();
				
				
				driver.findElement(By.id("myTreeViewn16CheckBox")).click();
				driver.findElement(By.xpath("//a[@id='myTreeViewn16']//img[@src='images/iconPlus.png']")).click();
				
				driver.findElement(By.id("myTreeViewn17CheckBox")).click();
				
				driver.findElement(By.linkText("NEXT")).click();
				
				
				WebElement w14 = driver.findElement(By.id("ddlproducttype"));
				Select option14= new Select(w14);
				option14.selectByIndex(4);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("Brain-Powder");
				Thread.sleep(1000);
				driver.findElement(By.id("txt_hsn")).sendKeys("HSN1276");
				Thread.sleep(1000);
				driver.findElement(By.id("txt_igst")).sendKeys("18");
				
				driver.findElement(By.id("txt_desc")).sendKeys("Product 3");
				driver.findElement(By.id("txt_Skucode")).sendKeys("SKU003");
				driver.findElement(By.id("fl_MainImg")).sendKeys("C:\\Users\\USER\\Documents\\BrainPowder.jpg");
				
				WebElement w15 = driver.findElement(By.id("ddlretunpolicy"));
				Select option15= new Select(w15);
				option15.selectByVisibleText("10 days");
				
				driver.findElement(By.linkText("NEXT")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("Checkl22_0")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("Checkl41_3")).click();
				
				
				driver.findElement(By.linkText("NEXT")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("rbt_cod_0")).click();
				driver.findElement(By.id("txt_Weight")).sendKeys("1000");
				driver.findElement(By.xpath("//span[@class='button_03']//a[@id='LinkButton1']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@class='product button_03']//a[@id='LinkButton1']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("0Price")).clear();
				driver.findElement(By.id("0Price")).sendKeys("1500");
				
				driver.findElement(By.id("0offerPrice")).clear();
				driver.findElement(By.id("0offerPrice")).sendKeys("1500");
				
				driver.findElement(By.name("0Stock")).clear();
				driver.findElement(By.name("0Stock")).sendKeys("10");
				
				driver.findElement(By.name("0Stockremove")).clear();
				driver.findElement(By.name("0Stockremove")).sendKeys("5");
				
				driver.findElement(By.id("0chkdefaultval")).click();
				driver.findElement(By.linkText("Submit")).click();
				Thread.sleep(5000);
			}
		
		@AfterClass
		public void tearDown() throws InterruptedException {
			
			driver.close();
		}
}
