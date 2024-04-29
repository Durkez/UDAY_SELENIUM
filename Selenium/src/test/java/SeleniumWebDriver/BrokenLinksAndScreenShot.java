package SeleniumWebDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksAndScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List <WebElement> Links=driver.findElements(By.tagName("a"));
		
		int CountOfLinks = Links.size();
		System.out.println(CountOfLinks);
		
		int TotalBrokenLinks = 0;
		
		
		for(WebElement link : Links) {
			
			 String TargetLink =  link.getAttribute("href");
			
			 
			 if(TargetLink==null || TargetLink.isEmpty()) {
				System.out.println("Href Value Is Null");
				continue;
			 }
			 URL Linkurl = new URL(TargetLink);
			 
			 HttpURLConnection con=(HttpURLConnection)Linkurl.openConnection();
			 con.connect();
			 if(con.getResponseCode()>=400){
				 System.out.println(TargetLink +"    ====>Broken Link");
				TotalBrokenLinks ++;
			 }
			 else {
				 System.out.println(TargetLink +      "     ====> Not an Broken Link");
			 }
			
		}
		System.out.println("Total Broken Links :"+TotalBrokenLinks);

	}

}
