//1.write a syntax to find if an element is displayed on the screen?


package Assessment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		if(element.isDisplayed()) {
			System.out.println("The Element Is Displayed On Screen");
		}
			else {
				System.out.println("The Element Is Not Displayed On Screen");
			}
		driver.quit();
		}
		 

}
