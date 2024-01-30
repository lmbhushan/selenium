package Pac_selenium2024;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_OrangeHRM_xml {

	public static void main(String[] args) throws InterruptedException, IOException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub
		//InputStream input1=new FileInputStream("C:\\Users\\bhushan.joshi\\eclipse-workspace\\JAN2024_Selenium\\logindata.properties");
		File xmlfile=new File("C:\\Users\\bhushan.joshi\\eclipse-workspace\\JAN2024_Selenium\\Seleniumlogindata.xml");		
		DocumentBuilderFactory DBFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder=DBFactory.newDocumentBuilder();
	    Document doc=dbuilder.parse(xmlfile);
	    NodeList n1=doc.getChildNodes();
	    Node n=n1.item(0);
	    Element ele=(Element)n;
	    String url=ele.getElementsByTagName("url").item(0).getTextContent();
	    String uname=ele.getElementsByTagName("username").item(0).getTextContent();
	    String pword=ele.getElementsByTagName("password").item(0).getTextContent();
	    
		
		
		
		
	//File f1=new File("C:\\Users\\bhushan.joshi\\eclipse-workspace\\JAN2024_Selenium\\inputdata.xlsx");
//		FileInputStream fis=new FileInputStream(f1);
//		XSSFWorkbook workbook=new XSSFWorkbook(fis);
//		XSSFSheet sheet=workbook.getSheetAt(0);
//		int rowcount=sheet.getPhysicalNumberOfRows();
//		Properties prob=new Properties();
//		prob.load(input1);
//		String url=prob.getProperty("url");
//		System.out.println("The url is:"+url);
//		File f2=new File("C:\\Users\\bhushan.joshi\\eclipse-workspace\\JAN2024_Selenium\\inputdata.xlsx");
//		System.out.println("Row Count:"+rowcount);
//		String[][] data=new String[3][2];
//		for(int i=0;i<rowcount;i++)
//		{
//			data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
//			data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
//			String uname=data[i][0];
//			String pword=data[i][1];
//			System.out.println("username:"+uname);
//			System.out.println("password:"+pword);
			
		
		
        WebDriverManager.chromedriver().setup();        
        WebDriver driver=new ChromeDriver();
        driver.get(url);
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        Thread.sleep(3000);
//        driver.findElement(By.name("password")).sendKeys("admin123");
//	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))	.click();
//	    
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ORHM_POM_1 obj=new ORHM_POM_1(driver);
        obj.enterusername(uname);
        obj.enterpassword(pword);
        obj.clicklogin();
        
	}
	
	}

