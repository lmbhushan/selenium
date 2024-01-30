package Pac_selenium2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0012_Opencart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
//	    driver.findElement(By.linkText("My Account")).click();
//	    driver.findElement(By.linkText("Login")).click();
//	    driver.findElement(By.id("input-email")).sendKeys("rahul@gmail.com");
//	    driver.findElement(By.id("input-password")).sendKeys("rahul");
//	    driver.findElement(By.tagName("button")).click();
//	    
	    driver.findElement(By.linkText("Desktops")).click();
	    driver.findElement(By.linkText("Mac (1)")).click();
	    Select s1=new Select(driver.findElement(By.id("input-sort")));
	    List<WebElement> l1=s1.getOptions();
	    s1.selectByIndex(1);
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;  
	    js.executeScript("window.scrollBy(0,500);");
	    driver.findElement(By.linkText("iMac")).click();
	    JavascriptExecutor js1=(JavascriptExecutor)driver;  
	    js1.executeScript("window.scrollBy(0,200);");
	    Thread.sleep(1000);
	    driver.findElement(By.id("button-cart")).click();
	}
	    
	}


