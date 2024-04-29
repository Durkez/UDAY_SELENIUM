package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGListenersDemo {
  @Test(priority =1)
  public void success() {
	  Assert.assertEquals(1, 1);
  }
  @Test(priority =2)
  public void fail() {
	  Assert.assertEquals(1,3);
	  
  }
  @Test(priority = 3, dependsOnMethods={"fail"})
  public void  skip() {	  
	  
	  //This method will be Skipped Because its Dependent method got failed
  }
 
}
