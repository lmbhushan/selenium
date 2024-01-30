package pac_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pac_selenium2024.ORHM_POM_1;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRM_login {
	
	@When("Login2 to OrangeHRM")
	public void login2_to_orange_hrm() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		    WebDriver driver;
		    InputStream input1 = new FileInputStream("C:\\Users\\bhushan.joshi\\eclipse-workspace\\JAN2024_Selenium\\logindata.properties");
			Properties prob = new Properties();
			prob.load(input1);
			String url = prob.getProperty("url");
			System.out.println("The URL is:" + url);
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  long timestamp = new Date().getTime();
			  File f1 = new File("C:\\Users\\bhushan.joshi\\eclipse-workspace\\JAN2024_Selenium\\inputdata.xlsx");
		      FileInputStream fis = new FileInputStream(f1);
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				int rowCount = sheet.getPhysicalNumberOfRows();
				System.out.println("Row Count: "+rowCount);
				String[][] data = new String[2][2];
				
				for(int i=0;i<rowCount;i++) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					driver.get(url);
					
					data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
					data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
					String uname = data[i][0];
					String pwd = data[i][1];
					System.out.println("Username: "+uname);
					System.out.println("Password: "+pwd);	
			  
			  ORHM_POM_1 obj = new ORHM_POM_1(driver);
			  String title=driver.getTitle();
			  //Assert.assertEquals(title, "OrangeHRM");
			  
			  ExtentReports extent=new ExtentReports();
				ExtentSparkReporter spark=new ExtentSparkReporter(timestamp+"25jan.html");
				extent.attachReporter(spark);
				ExtentTest test=extent.createTest("Verify the Title of OrngeHRM");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
					  
				obj.enterusername(uname);
				obj.enterpassword(pwd);
				obj.clicklogin();


					if(obj.verifylogin())
					{
						System.out.println("Login is Successful");	
					}
					else
					{
						System.out.println("Login is Failed");
					}
			driver.quit();
				}
			}
         
		
	    
	}
	
