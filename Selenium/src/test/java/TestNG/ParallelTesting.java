package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParallelTesting {
	
	WebDriver driver;
  @BeforeClass
  @Parameters({"browser"})
  public void setup( String br) throws InterruptedException {
	  if(br.equalsIgnoreCase("chrome")){
	  
	  driver = new ChromeDriver();
	  }
	  if(br.equalsIgnoreCase("edge")){
		  
		  driver = new EdgeDriver();
		  }
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
  }
  
  @Test(priority = 1)
  public void TestLogo() {
	
	  try{boolean logo=  driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
	 
	 Assert.assertEquals(logo, true);
	  }
	  catch(Exception e) {
		  Assert.fail();
	  }
	 
	  
  } 
  
  @Test (priority =2)
  public void SearchProduct() {
	  
	  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
	  
	  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	  
  }
  
  @AfterClass
  public void Close() {
	  driver.close();
  }
}
