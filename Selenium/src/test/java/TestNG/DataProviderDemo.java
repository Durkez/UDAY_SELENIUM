package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo {
	WebDriver driver;
	
	
  @BeforeClass
  public void DriverSetUp() 
  {
	  driver = new ChromeDriver();
	  }
  
  @Test (dataProvider = "logindata")
  void Login (String email , String pwd) {
	  
	  
	  //String BaseURL= "demo.nopcommerce.com/login";
	  driver.navigate().to("https://demo.nopcommerce.com/login");//demo.nopcommerce.com/login
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
	  driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pwd);
	  
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	  
	  String exp_title= "nopCommerce demo store" ;
	  String act_title=driver.getTitle();
	  
	  Assert.assertEquals(act_title.equalsIgnoreCase(exp_title),true);
	  
  }
 
  @DataProvider(name ="logindata")
  
  String [][] LoginData(){
	  
	  String data[][] = {
			  {"udayauk@gmail.com","hfojsa"},
			  {"uda@gmail.com","hfosa"},
			  {"uday@gmail.com","hfoa"},
			  {"udayatest@gmail.com","ukshan2727"},
			  {"uayauk@gmail.com","hfkjskg"}
	  };
	  
	  return data;
  }
  
  @AfterClass
  public void close(){
	  driver.close();
	  
  }
  
  
}


