package SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class InteractElementWithJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver  driver = new ChromeDriver();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				WebElement input =driver.findElement(By.xpath("//*[@id=\"name\"]"));
				js.executeScript("arguments[0].setAttribute('value','uday')", input);
		        WebElement rbutton= driver.findElement(By.xpath("//*[@id=\"male\"]"));
		        js.executeScript("arguments[0].click();", rbutton);
		        
		        
		        
				
	}

}
