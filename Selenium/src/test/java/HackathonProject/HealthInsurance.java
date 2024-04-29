package HackathonProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HealthInsurance {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.policybazaar.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
    WebElement Insurance= driver.findElement(By.xpath("//li//a[contains(text(),'Insurance Products')]"));
     
     Actions Act= new Actions(driver);
     Thread.sleep(3000);
     Act.moveToElement(Insurance).perform();
    		 


}
}
