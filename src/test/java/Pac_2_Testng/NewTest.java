package Pac_2_Testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws Exception {
	  WebDriverManager.chromedriver().setup();        
      WebDriver driver=new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   Thread.sleep(3000);
       
	   driver.findElement(By.name("username")).sendKeys(username);
       driver.findElement(By.name("password")).sendKeys(password);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(2000);
	   boolean dashboard=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")).isDisplayed();
       Assert.assertEquals(dashboard,true);  
  }
  private void assertequals() {
	  
  }

  @BeforeMethod
  public void beforeMethod() {
//	  WebDriverManager.chromedriver().setup();        
//      WebDriver driver=new ChromeDriver();
//      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Rahul", "rahul123" },
   
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite");
  }

}
