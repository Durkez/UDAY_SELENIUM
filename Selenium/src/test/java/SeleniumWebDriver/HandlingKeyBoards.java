package SeleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyBoards {

	public static void main(String[] args) {
		// TODO Auto-generated method stubb
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare-online.com/");
		 driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Welcome To Selenium");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().window().maximize();
		 
		 Actions act = new Actions(driver);
		//ctrl+a 
		 act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		 
		 //ctrl + c
		 act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		 
		 //tab key
		 
		 act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 
		 // or another way is directly using sendkeys
		 // act.sendKeys(Keys.TAB).perform();
		 
		 // ctrl + v
		 
		 act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	
		
	}

}
