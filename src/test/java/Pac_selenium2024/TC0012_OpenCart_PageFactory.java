package Pac_selenium2024;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0012_OpenCart_PageFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://demo.opencart.com/");
		    driver.manage().window().maximize();

	}

}
