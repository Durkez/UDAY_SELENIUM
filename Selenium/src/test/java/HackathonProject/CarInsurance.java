package HackathonProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsurance {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.findElement(By.xpath("//a//div//i[@class='icon-bg homeIconsBg car-insurance']")).click();
	     driver.findElement(By.xpath("//div[@class='dont-know-number']/a |  //div[@class='headingV3 fontNormal']/span")).click();   ////div[@class='headingV3 fontNormal']/span
	     driver.findElement(By.xpath("//span[@id='spn6']  | //li//span[contains(text(),'Chennai')]")).click();
	     driver.findElement(By.xpath("//li[@class='rtoItem '][7] | //li//span[contains(text(),'TN07')]")).click();
	     driver.findElement(By.cssSelector(".volkswagen ")).click();
	     
	     driver.findElement(By.xpath("//li[normalize-space()='POLO']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@id='Petrol']/b  |  //*[contains(text(),'Petrol')]")).click();
	     driver.findElement(By.xpath("//ul//li[starts-with(text(),'1.2 MPI')] | //li//span//b[starts-with(text(),'1.2 MPI')]")).click();	     
	     Thread.sleep(3000);
	     WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Full name'] | //input[@id='name']"));
	    		   // Name.click();
	                Name.sendKeys("Udaya Krishna");
	        
	     WebElement Email =driver.findElement(By.xpath("//input[@placeholder='Your email'] | //input[@id='email']"));
	                //Email.click();
	                Email.sendKeys("Testinggmail.com");
	    WebElement phonenumber= driver.findElement(By.xpath("//input[@placeholder='Mobile number'] | //input[@id='mobileNo'] "));
	               //phonenumber.click();
	               phonenumber.sendKeys("9884914691");
	               
	               
	    WebElement Errormsg = driver.findElement(By.xpath("//div[@class='msg-error show'] | //*[@class='errorMsg']"));
	    		
	            System.out.println(Errormsg.getText()); 
	     //	     Select select = new Select(Chennai);
//	     select.selectByVisibleText("TN07");
	     
	     
	     
	     
		
	}

}
