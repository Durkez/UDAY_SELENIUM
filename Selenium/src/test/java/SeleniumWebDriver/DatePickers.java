package SeleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2318365\\OneDrive - Cognizant\\Desktop\\Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Month = "March 2024";
		
		driver.findElement(By.xpath("//*[@id=\'departure\']")).click();
		
		
		while (true) {
			 String vmonth= driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[11]/div[1]/table/thead/tr[1]/th[2]")).getText();
				
			
			if (Month.equalsIgnoreCase(vmonth)) {
				System.out.println("Test Passed");
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[11]/div[1]/table/thead/tr[1]/th[3]/svg")).click();
				
			}
			
			//driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[11]/div[1]/table/tbody/tr[1]/td[7]")).click();
			
		}
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[11]/div[1]/table/tbody/tr[1]/td[7]")).click();
		
		}
	}
