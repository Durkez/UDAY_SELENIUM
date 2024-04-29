//2.How do you  click on a hyper link using linkText?


package Assessment;

import java.time.Duration;
import java.util.concurrent.ExecutionException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingHyperLink {

	 public static void main(String[] args) throws ExecutionException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://byjus.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		try {
		WebElement element = driver.findElement(By.linkText("Buy a Course"));
				
				element.click();
		
		
			System.out.println("HyperLink Is Found Using LinkText");
		}
		
		catch(Exception e){
			System.out.println("e");
		}
		
		driver.quit();
			
	}

}
