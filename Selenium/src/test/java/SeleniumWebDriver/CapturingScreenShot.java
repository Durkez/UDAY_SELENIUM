package SeleniumWebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.google.com/intl/en_in/gmail/about/");
//     TakesScreenshot ts = (TakesScreenshot)driver;
//    File src=  ts.getScreenshotAs(OutputType.FILE);
//    
//    File trg = new File("C:\\Users\\2318365\\eclipse-workspace\\Selenium\\ScreenShots\\FullPageGmail.png");
//    
//    FileUtils.copyFile(src, trg);
//     
     
     
     // SCREENSHOT OF PARTICULAR PART FROM AN WEB PAGE
     
     
    
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
     WebElement photo = driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div/div/div[2]/div/div/picture/img"));
     File src= photo.getScreenshotAs(OutputType.FILE);
     File trg = new File("C:\\Users\\2318365\\eclipse-workspace\\Selenium\\ScreenShots\\gmailex.png");
     FileUtils.copyFile(src,trg);
     
	}

}
