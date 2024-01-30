package Pac_selenium2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0011_OHRM_Login_PageFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	    TC11_OHRM_Login_PageFactory obj=PageFactory.initElements(driver,TC11_OHRM_Login_PageFactory.class);
	    obj.enterusername("Admin");
	    obj.enterpassword("admin123");
	    obj.loginbutton();
	}

}
