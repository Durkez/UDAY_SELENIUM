package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageObjectModel {
	
	WebDriver driver;
	
	
	public void login(WebDriver driver) {
		this.driver = driver;
	}
	
	//locators
	
By gmailbox= By.xpath("//*[@id=\"Email\"]");            //.sendkeys("udayatest1@gmail.com");
By passbox = By.xpath("//*[@id=\"Password\"]");
By Click = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
               //String input="udayatest1@gmail.com";
public void setgmail(String gmail) {
	driver.findElement(gmailbox).sendKeys(gmail);
}
public void setPassword(String pass) {
	driver.findElement(passbox).sendKeys(pass);
	
}
public void Click() {
	driver.findElement(Click).click();
}
	
	

}
