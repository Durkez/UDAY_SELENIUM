package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardAssertionVsSoftAssertion {
  @Test
  public void hardassert() {
	  System.out.println("HardAssertion");
	  System.out.println("HardAssertion");
	  
	  Assert.assertEquals(1, 2,"Hard Assertion Fails"); // fails and it wont execute any code below directly the method fails
	  
	  System.out.println("Below HardAssertion Declaration");
	 //Assert.assertTrue(//webElement.isDisplayed(),"HyperLink Is Present");
  }
  
  
  @Test (invocationCount =2)
  public void softAssert() {
	  System.out.println("SoftAssertion");
	  System.out.println("SoftAssertion");
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(1, 2);
	  
	  System.out.println("Below SoftAssertion Declaration");
	 
	  sa.assertAll();  //This is Mandatory if we use soft Assert .To diplay Test Fail if the Assert condition fails 
	  

  }
}
