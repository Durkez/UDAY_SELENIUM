package MainProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperLink {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://be.cognizant.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"news_text_title\"]")).click();
		Thread.sleep(3000);
		List <WebElement> Links =driver.findElements(By.xpath("//*[@id='spPageCanvasContent']/div/div/div/div/div/div/div/div[1]//p//a"));
		
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



