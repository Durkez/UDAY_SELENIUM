package SeleniumWebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2318365\\OneDrive - Cognizant\\Desktop\\Driver/chromedriver.exe");
          
		//WebDriverManager.chromedriver().setup();
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize(); //,maximize the window
          Thread.sleep(5000);
          driver.findElementById("twotabsearchtextbox").sendKeys("Iphone");
          driver.findElementByXPath("//*[@id=\"nav-search-submit-button\"]").click();
         String Title=driver.getTitle();
         String verifyTitle= "Amazon.in : Iphone";
       
        
         //For Title Verification
         
         /*if (Title.equals(verifyTitle)) {
        	 System.out.println("Test Passed");
         }
        	 else
        	 {
        	 System.out.println("Test Failed");
        	 }*/
         
         // For Text Verification
         //Xpath Created by contains keyword 
         try {
      String  text=driver.findElementByXPath("//*[contains(text(),'Shop the Apple Store on')]").getText();
        String checktext="Shop the Apple Store on";
        if (text.contains("Apple")) {
        	System.out.println("Test Passed");
        }
        else {
        	System.out.println("failed");
 
        }
        	
	}
         catch(Exception e) {
         System.out.println("No such");
         }
        }
}
	


