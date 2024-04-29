package MainProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LikesAndViews {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://be.cognizant.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"news_text_title\"]")).click();
		
		WebElement Scroll= driver.findElement(By.xpath("//*[@id=\"fa45f946-463e-428f-a84b-0bbbde09c3ba\"]/div/div/div/p[21]/a/span/u"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView();",Scroll); 
		
		Thread.sleep(5000);
		String like= driver.findElement(By.xpath("//span[contains(text(),'people liked this')]")).getText();
		
		System.out.println(like);
		
		
		String Views = driver.findElement(By.xpath("//span[contains(text(),'Views')]")).getText();
		
		System.out.println(Views);
			
	}

}
