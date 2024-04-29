package SeleniumWebDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertAndPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		 //This Website Works Only On the Private Hotspot
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
//		//driver.switchTo().alert().accept(); //Closing Alert by Clicking Ok button
//		
//		driver.switchTo().alert().dismiss(); //Closing Alert by Clicking Cancel button
		
		
		//Below Code is for Alert popup with inputBox
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Alert Alertwindow= driver.switchTo().alert();
		
		String PassedName="Uday";
		
		Alertwindow.sendKeys("Uday");
		
		Alertwindow.accept();
		
		WebElement text =driver.findElement(By.xpath("//*[@id=\"demo1\"]"));
		
		String OutputName=text.getText();
		
		if(OutputName.contains(PassedName)) {
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		} 
	
		}

}
