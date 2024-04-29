package MainProject;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserMouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://be.cognizant.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id=\"news_text_title\"]")).click();
		
		Actions act = new Actions(driver);
		
		WebElement user = driver.findElement(By.xpath("//*[@id=\"vpc_WebPart.PageTitle.internal.cbe7b0a9-3504-44dd-a3a3-0e5cacd07788\"]/div/div[1]/div/div/div[2]/div/div/div/div[1]/div/div/img"));
		
		act.moveToElement(user).build().perform();
		
		 try {
			 driver.findElement(By.xpath("//*[@id=\"vpc_WebPart.PageTitle.internal.cbe7b0a9-3504-44dd-a3a3-0e5cacd07788\"]/div/div[1]/div/div/div[2]/div/div/div")).isDisplayed();
			 System.out.println("User details is displayed in popup when hovered");
		 }
		 catch  (Exception e) {
			 System.out.println("User details is not displayed in popup when hovered");
		 }
		// driver.close();
	
		
	}
}
