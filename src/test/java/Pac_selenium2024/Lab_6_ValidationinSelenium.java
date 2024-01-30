package Pac_selenium2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_6_ValidationinSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver();
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demo.opencart.com/");
	       System.out.println(driver.getTitle());
	       driver.findElement(By.linkText("My Account")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.linkText("Login")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.name("email")).sendKeys("rahul@gmail.com");
	       driver.findElement(By.name("password")).sendKeys("rahul123");
	       driver.findElement(By.tagName("button")).click();
	       
	       driver.findElement(By.linkText("Components")).click();
	       driver.findElement(By.linkText("Monitors (2)")).click();
	       Select s1=new Select(driver.findElement(By.id("input-limit")));
           s1.selectByIndex(1);
           
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("window.scrollBy(0,500);");
           Thread.sleep(1000);
 	       driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[1]/form/div/div[2]/div[1]/h4/a")).click();
 	       
 	       JavascriptExecutor js1=(JavascriptExecutor)driver; 
	       js1.executeScript("window.scrollBy(0,500);");
	       driver.findElement(By.id("input-option-value-6")).click();
	       
	       JavascriptExecutor js2=(JavascriptExecutor)driver; 
	       js2.executeScript("window.scrollBy(0,100);");
	       driver.findElement(By.id("input-option-value-8")).click();
	       
	       JavascriptExecutor js3=(JavascriptExecutor)driver; 
	       js3.executeScript("window.scrollBy(0,100);");
	       driver.findElement(By.id("input-option-208")).sendKeys("Apple");
	       
	       JavascriptExecutor js4=(JavascriptExecutor)driver; 
	       js4.executeScript("window.scrollBy(0,100);");
	       driver.findElement(By.id("input-option-208")).clear();
	       driver.findElement(By.id("input-option-208")).sendKeys("Apple");
	       
	       JavascriptExecutor js5=(JavascriptExecutor)driver; 
	       js5.executeScript("window.scrollBy(0,100);");
	       Select s2=new Select(driver.findElement(By.id("input-option-217")));
	       s2.selectByIndex(2);
	       
	       JavascriptExecutor js6=(JavascriptExecutor)driver; 
	       js6.executeScript("window.scrollBy(0,100);");
	       driver.findElement(By.id("input-option-209")).sendKeys("Apple");
	      
	       
	       
	       
	       
	       
	       driver.findElement(By.id("button-cart")).click();
	}

}
