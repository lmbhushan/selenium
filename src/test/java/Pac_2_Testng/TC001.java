package Pac_2_Testng;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pac_selenium2024.ORHM_POM_1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {
	
	  WebDriver driver;
		
	  @Test(dataProvider = "dp")
	  public void f(String uname, String pwd) throws Exception  {	
		  long timestamp=new Date().getTime();
		  System.out.println("Time is:"+timestamp);
		  System.out.println("This is the TEst:your credentials are:"+uname+":and:"+pwd);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		  String browserName = cap.getBrowserName().toLowerCase();
		  System.out.println(browserName);
		 
		   ORHM_POM_1 obj = new ORHM_POM_1(driver);
		    String title=driver.getTitle();
		    Assert.assertEquals(title, "OrangeHRM");
		    ExtentReports extent=new ExtentReports();
		    ExtentSparkReporter spark=new ExtentSparkReporter(timestamp+"23Jan.html");
			extent.attachReporter(spark);
			ExtentTest test=extent.createTest("Verify the title of OrangeHRM"+browserName);
			if(title.equals("orangeHRM"))
			{
				test.pass("OrangeHRM title is displayed");
				
			}
			else
			{
				Thread.sleep(5000);
				File sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile=new File("p1.png");
			    FileUtils.copyFile(sfile,dfile);
				String path=dfile.getAbsolutePath();
				test.fail("OrangeHRM title is not displayed",MediaEntityBuilder.createScreenCaptureFromPath("img1.jpg").build());
                test.addScreenCaptureFromPath(path);			
			}
			if(obj.verifyusername())
			{
				test.pass("Username is displayed");
			}
			else
			{
				Thread.sleep(5000);
				File sfile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile1=new File("p2.png");
			    FileUtils.copyFile(sfile1,dfile1);
				String path=dfile1.getAbsolutePath();
				test.fail("username is not displayed",MediaEntityBuilder.createScreenCaptureFromPath("img2.jpg").build());
                test.addScreenCaptureFromPath(path);	
			}
			if(obj.verifypassword())
			{
				test.pass("Password is displayed");
			}
			else
			{
				Thread.sleep(5000);
				File sfile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile2=new File("p3.png");
			    FileUtils.copyFile(sfile2,dfile2);
				String path=dfile2.getAbsolutePath();
				test.fail("password is not displayed",MediaEntityBuilder.createScreenCaptureFromPath("img3.jpg").build());
                test.addScreenCaptureFromPath(path);	
			}
		    
		    obj.enterusername(uname);
			obj.enterpassword(pwd);
			obj.clicklogin();
			if(obj.verifylogin())
			{
				test.pass("Login is Successful");
			}
			else
			{
				Thread.sleep(5000);
				File sfile3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dfile3=new File("p4.png");
			    FileUtils.copyFile(sfile3,dfile3);
				String path=dfile3.getAbsolutePath();
				test.fail("Login is not successful",MediaEntityBuilder.createScreenCaptureFromPath("img4.jpg").build());
                test.addScreenCaptureFromPath(path);	
			}
			
			extent.flush();
			boolean dashboard=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")).isDisplayed();
		    Assert.assertEquals(dashboard,true);  
		  }
		  private void assertequals() {
			  
		  }
		  
	  @Parameters("Browser")	
	  
	  @BeforeMethod
	  public void beforeMethod(String browsername) throws Exception {
		  
		 System.out.println("This is before method");
		 InputStream input1 = new FileInputStream("C:\\Users\\bhushan.joshi\\eclipse-workspace\\JAN2024_Selenium\\logindata.properties");
			Properties prob = new Properties();
			prob.load(input1);
			String url = prob.getProperty("url");
			System.out.println("The URL is:" + url);
			System.out.println("The Browser is:"+browsername);
			if(browsername.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			}
			else if(browsername.equalsIgnoreCase("edge"))
			{

				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			}
			else if(browsername.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			}
			else 
			{
				System.out.println("The Browsername is not matched");
			}
			
			
//			WebDriverManager.chromedriver().setup();
//			 driver = new ChromeDriver();
//			driver.get(url);
			//Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("This is after method");
		//  driver.quit();
	  }
	  
	  


	  @DataProvider
	  public Object[][] dp() throws Exception {
		  File f1 = new File("C:\\Users\\bhushan.joshi\\eclipse-workspace\\JAN2024_Selenium\\inputdata.xlsx");
	   
	      
	      FileInputStream fis = new FileInputStream(f1);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count: "+rowCount);
			String[][] data = new String[3][2];
			
			for(int i=0;i<rowCount;i++) {
				data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
				data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
				String uname = data[i][0];
				String pwd = data[i][1];
				System.out.println("Username: "+uname);
				System.out.println("Password: "+pwd);	
			}
			return data;
	    };
	  
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

