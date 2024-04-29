package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependencyMethods {
  @BeforeClass
  public void openApp() {
	  Assert.assertTrue(true);
  }
  @Test(priority=1)
  public void logIn() {
	  Assert.assertTrue(false);
  }
  @Test(priority =2 ,dependsOnMethods= {"logIn"})
  public void search() {
	  Assert.assertTrue(true);
  }
  @Test(priority =3 ,dependsOnMethods={"search"})
  public void advSearch() {
	  Assert.assertTrue(true);
  }
  @AfterClass
  public void logOut() {
	  Assert.assertTrue(true);
  }
}
