package SeleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.*;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\2318365\\OneDrive - Cognizant\\Desktop\\Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
       /*
         This Code Is For Performing Mouse Hover
         
         driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        
        WebElement desktop = driver.findElementByXPath("//*[@id=\"narbar-menu\"]/ul/li[1]/a");
       WebElement Mac = driver.findElementByXPath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a");
        Actions ac= new Actions(driver);
        ac.moveToElement(desktop).moveToElement(Mac).click().build().perform();
        //driver.findElementByXPath("//*[@id=\"challenge-stage\"]/div/label/input").click();
         
         */
       
        
        /*     This Code Is For Performing Mouse Right Click and Select The Option & manage Alert Box
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement button = driver.findElementByXPath("/html/body/div/section/div/div/div/p/span");
        Actions act = new Actions(driver);
        act.contextClick(button).build().perform();
        driver.findElementByXPath("/html/body/ul/li[3]").click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        */
        
        
        
        /*
       This Code Is For Performing Mouse Double Click
        
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
       WebElement f1= driver.findElementByXPath("//*[@id=\"field1\"]");
        f1.clear();
        f1.sendKeys("Welcome");
        String s2=f1.getAttribute("value");
        
        WebElement button = driver.findElementByXPath("/html/body/button");
        Actions act = new Actions(driver);
        act.doubleClick(button).build().perform();
        
        
        WebElement  f2= driver.findElementByXPath("//*[@id=\"field2\"]");
        String s1=f2.getAttribute("value");
        
        
        if (s1.equalsIgnoreCase(s2)) {
        	System.out.println("Test Passed");
        }
        else {
         System.out.println("Test Failed");
        }
        
        
        */
        
        
        /*  This Code Is For Performing Mouse Drag And Drop
        
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement rome =driver.findElementByXPath("//*[@id=\'box6\']");
        WebElement italy= driver.findElementByXPath("//*[@id=\'box106\']");
        
        Actions act = new Actions(driver);
        act.dragAndDrop(rome, italy).build().perform();
        
        WebElement Washington =driver.findElementByXPath("//*[@id=\'box3\']");
        WebElement Usa=driver.findElementByXPath("//*[@id=\'box103\']");
        
        act.dragAndDrop(Washington, Usa).build().perform();
        
        	*/
        
        
        //This Code Is For Performing Mouse Sliders
        
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
        ///X-axis Slider Handling
        
        WebElement Xaxis= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
       System.out.println("Location Before Sliding :"+Xaxis.getLocation());
        Actions act = new Actions(driver);
        act.dragAndDropBy(Xaxis, 100, 125).build().perform();;
        System.out.println("Location After Sliding :"+Xaxis.getLocation());
        // Y-Axis Slider Handling
        
        
        WebElement Yaxis= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
        System.out.println("Location Before Sliding :"+Yaxis.getLocation());
         act.dragAndDropBy(Yaxis, -30, 125).build().perform();;
         System.out.println("Location After Sliding :"+Yaxis.getLocation());
        
        
        

	}

}
