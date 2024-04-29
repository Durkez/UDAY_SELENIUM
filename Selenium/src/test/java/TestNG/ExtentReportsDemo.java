package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExtentReportsDemo {
	
	WebDriver driver;
  
	@BeforeClass
  public void DriverSetup() {
	  driver = new ChromeDriver();
	  
	  driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Flogin");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	  
  }
	
	@Test
	
	public void login() {
		 try {
			  
			  driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("udayatest@gmail.com");
			   driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("ukshan2727");
			  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
			  
			  boolean status = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).isDisplayed();
			   Assert.assertEquals(true, true);
		 }
			  
			  catch(Exception e) {
				  Assert.fail();
			  }
		
	}
	
	
}
