package TestNG;

import org.testng.annotations.*;

public class AllAnnotations {
  @BeforeSuite
	void BeforeSuite() {
	  System.out.println("Before Suite");
  }
  @AfterSuite
  void AfterSuite() {
	  System.out.println("After Suite");
  }
  @BeforeTest
  void BeforeTest() {
	  System.out.println("Before Test");
  }
  @AfterTest
  void AfterTest() {
	  System.out.println("After Test");
  }
  @BeforeClass
  void BeforeClass() {
	  System.out.println("Before Class");
  }
  @AfterClass
  void AfterClass() {
	  System.out.println("After Class");
  }
  @BeforeMethod
  void BeforeMethod() {
	  System.out.println("Before Method");
  }
  @AfterMethod
  void AfterMethod() {
	  System.out.println("After Method");
  }
  @Test(priority =1)
  void test1() {
	  System.out.println("This is Test 1");
  }
  @Test(priority =2)
  void test2() {
	  System.out.println("This is Test 2");
  }


}
