package SeleniumWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("paper");
		
		List <WebElement> suggestions =driver.findElements(By.xpath("//div[contains(@class,'wM6W7d') and @role='presentation'] //span"));
		 
		int listvalue=suggestions.size();
		
		System.out.println("Total Number Of Suggestions :" +listvalue);
		
		System.out.println("The Suggested Links In the Search page");
		
		for(int i=0;i<listvalue;i++) {
			
			
			
			System.out.println(suggestions.get(i).getText());
		}
		
		
		

	}

}
