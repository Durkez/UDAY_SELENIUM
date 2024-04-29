package MiniProjectSelenium;

import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
	public class Screenshot{
		// this method will get the screenshot of the the result element
		public static void takeScreenshot(WebDriver driver) throws IOException{

			WebElement resultElement = WebLocators.screenshotElement(driver);
			File src = resultElement.getScreenshotAs(OutputType.FILE);
			File screenshotFile = new File("C:\\Users\\2318365\\eclipse-workspace\\Selenium\\src\\test\\java\\MiniProjectSelenium\\screenshot\\resultimg.png");
			FileUtils.copyFile(src, screenshotFile);
		}
}

