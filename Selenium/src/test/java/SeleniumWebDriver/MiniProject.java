package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MiniProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2318365\\OneDrive - Cognizant\\Desktop\\Driver/chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get(" https://demoqa.com/droppable/ ");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 WebElement Drag=driver.findElementByCssSelector("div#draggable");
		 WebElement Drop = driver.findElementByCssSelector("div#droppable");
		 
		 Actions act  = new Actions(driver);
		 
		 act.dragAndDrop(Drag, Drop).build().perform();
		 
		 WebElement text =driver.findElementByXPath("//*[@id=\"droppable\"]/p");
		 
		 String tex=text.getText();
		 
		 if(tex.equalsIgnoreCase("Dropped!"))
		 {
			 System.out.println("Test Passed");
		 }
		 else
		 {
			 System.out.println("Test Failed");
		 }
 
		 
		 driver.navigate().to("https://demoqa.com/date-picker");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		 driver.findElementByCssSelector("input#datePickerMonthYearInput").click();
		 driver.findElementByXPath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]");
	}

}
