package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnonotationDemo1 {
 WebDriver driver;
 @BeforeMethod
  public void Driver() {
	  driver = new ChromeDriver();
	  driver.get("https://www.myntra.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
  }
 @Test
 void SearchShirt() {
	 driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("Black Shirt");
	}
 @Test
 void SearchPant() {
	 driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("Black Pant");
 }
 @AfterMethod
 void ClickSearch() {
 driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a")).click();
 }
 
}
