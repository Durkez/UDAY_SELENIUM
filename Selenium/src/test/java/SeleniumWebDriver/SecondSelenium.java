package SeleniumWebDriver;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class SecondSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2318365\\OneDrive - Cognizant\\Desktop\\Driver/chromedriver.exe");
        
		//WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.myntra.com/");
		 //driver.findElementByXPath("(//input[@placeholder='Search for products, brands and more'])[1]").sendKeys("White Shirts");
		 //driver.findElementByXPath("//a[@class='desktop-submit']").click();
	      //driver.findElementByXPath("//*[@class='product-base'][1]/a").click();
		// System.out.println(dd.getAttribute("href"));
		List<WebElement> images=driver.findElementsByTagName("img");
		System.out.println("Total Number Of Images :"+ images.size());
		
		List<WebElement> link=driver.findElementsByTagName("a");
		System.out.println("Total Number Of Links:"+ link.size());
		
		
	}

}
