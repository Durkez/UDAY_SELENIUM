package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {  
  @Test
  public void intAssert () {
	  int a = 10;
	  int b =12;
	  Assert.assertEquals(a>b,true,"A is Not Greater Than B"); // this Assert.assertEquals()  works for all types of data 
  }
  @Test
  public void StringAssert() {
	  String s1 = "uday";
	  String s2 = "uday";
	  
	  Assert.assertEquals(s1.equalsIgnoreCase(s2),true);
  }
}
