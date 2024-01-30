package Pac_2_Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest_5 {
  @Test(priority=2)
  public void test1() {
	  System.out.println("This is test 1");
  }
  @Test(groups = {"sanity"},priority=3)
  public void test2() {
	  System.out.println("This is test 2");
  }
  @Test(groups = {"sanity"},priority=1)
  public void test3() {
	  System.out.println("This is test 3");
  }
  @Test(groups = {"sanity"},priority=0)
  public void test4() {
	  System.out.println("This is test 4");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
