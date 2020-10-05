package Seller_Panel;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class sellerBrandReistration{
	
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
	public void testBasicInfo() throws InterruptedException {
		
		driver.get("http://sellernutriliva.cstechns.com/SupplierRegistration/6D967605-0771-4505-B003-F557BCE1F9F1");
			driver.findElement(By.xpath("//input[@id='txtcompanyname']")).clear();
			driver.findElement(By.xpath("//input[@id='txtcompanyname']")).sendKeys("ASK ");
			
			driver.findElement(By.id("txtdisplayname")).clear();
			driver.findElement(By.id("txtdisplayname")).sendKeys("ASK sellers");
			
			driver.findElement(By.id("txtship_address")).clear();
			driver.findElement(By.id("txtship_address")).sendKeys("11-1-109 Laxmi Nagar");
			
			driver.findElement(By.id("txtship_landmark")).clear();
			driver.findElement(By.id("txtship_landmark")).sendKeys("Near Ayyappa temple");
			
			driver.findElement(By.id("txtpinsupplier")).clear();
			driver.findElement(By.id("txtpinsupplier")).sendKeys("500035"+Keys.ENTER);
			
			Thread.sleep(5000);
			
			WebElement w1=driver.findElement(By.id("txtbusinesstype"));
			Select s1=new Select(w1);
			s1.selectByVisibleText("Sole Proprietor");
			
			driver.findElement(By.id("txtpassportno")).clear();
			driver.findElement(By.id("txtpassportno")).sendKeys("CDIN123455784");
			
			driver.findElement(By.id("txtaboutus")).clear();
			driver.findElement(By.id("txtaboutus")).sendKeys("This is for testing");
			
			driver.findElement(By.id("txtbuisnessdescription")).clear();
			driver.findElement(By.id("txtbuisnessdescription")).sendKeys("This is for testing");
			 Thread.sleep(5000);
			 
			 driver.findElement(By.id("txtbankaccount")).clear();
			 driver.findElement(By.id("txtbankaccount")).sendKeys("2013045987");
			 
			 driver.findElement(By.id("txtBeneficiary")).clear();
			 driver.findElement(By.id("txtBeneficiary")).sendKeys("Sandeep");
			 
			 driver.findElement(By.id("txtbankname")).clear();
			 driver.findElement(By.id("txtbankname")).sendKeys("RBI");
			 
			 driver.findElement(By.id("txtbranch")).clear();
			 driver.findElement(By.id("txtbranch")).sendKeys("Mumbai");
			 
			 driver.findElement(By.id("txtifsc")).clear();
			 driver.findElement(By.id("txtifsc")).sendKeys("RBI0011999");
			 WebElement w2= driver.findElement(By.id("txtactype"));
			 Select s2=new Select(w2);
			 s2.selectByIndex(1);
			 driver.findElement(By.linkText("NEXT STEP")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//button[@class='confirm']")).click();
			 
			Thread.sleep(5000);

			
		 driver.findElement(By.id("filetopancard")).sendKeys("C:\\Users\\USER\\Downloads\\NikeProducts.pdf");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetocst")).sendKeys("C:\\Users\\USER\\Downloads\\NikeLogo.jpg");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetocancelcheque")).sendKeys("C:\\Users\\USER\\Downloads\\NikeLogo.png");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetologo")).sendKeys("C:\\Users\\USER\\Downloads\\onion-hair-oil_1_1.jpg");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetobrand")).sendKeys("C:\\Users\\USER\\Downloads\\mamaeartth.jpg");
		 Thread.sleep(5000);
		 driver.findElement(By.id("filetosignature")).sendKeys("C:\\Users\\USER\\Downloads\\mamaeartth.jpg");
		 Thread.sleep(5000);
		 driver.findElement(By.id("tp1")).click();
		 driver.findElement(By.id("tp1")).click();
		 driver.findElement(By.id("btndoc")).click(); 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		 Thread.sleep(1000);
//brand step 3		
		 WebElement w3= driver.findElement(By.id("ddlbrandname"));
		 Select s3=new Select(w3);
		 s3.selectByIndex(1);
		 
		 WebElement w4= driver.findElement(By.id("ddldoctype"));
		 Select s4= new Select(w4);
		 s4.selectByIndex(1);
		 driver.findElement(By.name("filetobrand")).sendKeys("C:\\Users\\USER\\Documents\\Upload.pdf");
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("btndoc")).click();
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@class='confirm']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("btnsave")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//button[@class='confirm']")).click();
			}
	@AfterClass
	public void tearDown() {
		driver.close();
		
	}

}
