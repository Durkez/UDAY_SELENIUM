package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClassForPageObjectModel {
	
	WebDriver driver;
	pageObjectModel pom;
   @BeforeClass
   void driverSetUp() {
	   pom= new pageObjectModel();
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.get("https://demo.nopcommerce.com/login");
	   driver.manage().window().maximize();
   }
   
   @Test
   void LogInTest()
   {
	   
	   pom.setgmail("udayatest1@gmail.com");
	   pom.setPassword("ukshan2727");
	   pom.Click();
   }
   
   @AfterClass
   void closeDriver()
{
	 driver.close();  
}
}
