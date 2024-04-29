package SeleniumWebDriver;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByCssSelectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver","C:\\Users\\2318365\\OneDrive - Cognizant\\Desktop\\Driver/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://demo.nopcommerce.com/");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.findElement(By.className("input#small-searchterms")).sendKeys("nokia");
       driver.findElement(By.cssSelector("button.button-1")).click();
       //Select sc = new Select(driver.findElementByXPath("/html/body/div[6]/div[3]/div/div[1]/div[2]/div[1]/strong"));
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[1]/div[2]/div[2]/ul/li[1]/a")).click();
       //List<WebElement> Count = driver.findElements(By.tagName("img"));
         // System.out.println("Total Number Of Images In The Present Page :"+ Count.size());
       driver.findElement(By.cssSelector("input.newsletter-subscribe-text[type='email']")).sendKeys("udayashanmu27@gmail.com");
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone");
       driver.findElement(By.xpath("//form[@method='get']/button")).click();
          
	}

}
