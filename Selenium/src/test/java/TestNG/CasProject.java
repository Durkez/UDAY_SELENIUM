package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class CasProject {
	WebDriver driver;
  @BeforeClass
  public void webDriver()
  {
	  WebDriver driver = new ChromeDriver();
		 String URL = "https://be.cognizant.com";
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   driver.get(URL);
		   driver.manage().window().maximize();
  }
  @Test(priority =1)
  public void clickUserProfile() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  WebElement UserInfoButton =driver.findElement(By.xpath("//*[@id='meInitialsButton']"));  ////*[@id=\"O365_MainLink_Me\"]
	   Actions act = new Actions(driver);
	   act.click(UserInfoButton).perform();
  }
  @Test(priority =2,dependsOnMethods= {"clickUserProfile"})
  public void getUserInfo() {
	  String Name= driver.findElement(By.id("mectrl_currentAccount_primary")).getText();
	    
	 String Email=driver.findElement(By.id("mectrl_currentAccount_secondary")).getText();
	    
	    System.out.println("UserName :"+ Name);
	    
	    System.out.println("User Mail-Id :"+ Email);
  }
	    
	    @AfterClass
	    public void quitDriver() throws InterruptedException {
	    	
	    	Thread.sleep(3000);
	    	driver.quit();
	    	
	    }
  

	
}

