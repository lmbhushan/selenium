package Pac_selenium2024;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab_12_Properties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream input1 = new FileInputStream("C:\\Users\\bhushan.joshi\\eclipse-workspace\\JAN2024_Selenium\\opencart_lab14.properties");
		Properties prop = new Properties();
		prop.load(input1);
		String url = prop.getProperty("url");
		String prdt = prop.getProperty("product");
		System.out.println("The URL is: "+ url);
		System.out.println("The product is: "+ prdt);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		lab_12_opencartPOM obj = new lab_12_opencartPOM(driver);
		obj.desktop();
		obj.mac();
		obj.sort(1);
		obj.search();
		obj.search2(prdt);
		obj.tick();
		obj.searchbutton();
	}
}
