package MainProject;
import java.time.Duration;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
	 String URL = "https://be.cognizant.com";
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	
	   driver.get(URL);
       driver.manage().window().maximize();
   WebElement UserInfoButton =driver.findElement(By.xpath("//*[@id='meInitialsButton']"));  ////*[@id=\"O365_MainLink_Me\"]
	   Actions act = new Actions(driver);
//	   act.moveToElement(UserInfoButton).perform();

	   
	   
	   //	   WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
//	 
//	   WebElement  wait=mywait.until(ExpectedConditions.visibilityOfElementLocated
//			   (By.cssSelector("span.mectrl_screen_reader_text")));
	   
	   //String pop= wait.getText();
//	  WebElement popupUserInfo = driver.findElement(By.xpath("//*[@id=\"O365_MainLink_Me\"]"));
//	     String pop= popupUserInfo.getAttribute("title");
	    		 //System.out.println(pop);
//	   Thread.sleep(5000);
	   act.click(UserInfoButton).perform();
//	   
	   //UserInfo 
	    String Name= driver.findElement(By.id("mectrl_currentAccount_primary")).getText();
//	    
	    String Email=driver.findElement(By.id("mectrl_currentAccount_secondary")).getText();
//	    
//	    
//	    
	    System.out.println("UserName :"+ Name);
	    
	    System.out.println("User Mail-Id :"+ Email);   
//	    
	    ////*[@id="mectrl_main_trigger"]/div/span    //*[@id="mectrl_main_trigger"]/div/span
	     
	     
	 
	    }

}
