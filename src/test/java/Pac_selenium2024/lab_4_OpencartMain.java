package Pac_selenium2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab_4_OpencartMain {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/");
			
			
			lab_4_OpencartPOM obj= new lab_4_OpencartPOM(driver);
			obj.desktop();
			obj.mac();
			obj.sort(1);
			obj.search();
			obj.search2("Mobile");
			obj.tick();
			obj.searchbutton();
	    
	    
	    

		}

	}


