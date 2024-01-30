package Pac_selenium2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Selenium {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		@Test
		public void run(){
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        WebElement search=driver.findElement(By.name("q"));
	    search.sendKeys("Automation Testing Tools");
	    search.submit();
//	    driver.wait(3000);
        driver.quit(); 
	   // System.out.println(driver.getTitle());
	    driver.navigate().to("www.amazon.com");
	    System.out.println(driver.getTitle());
	    driver.navigate().back();
	    System.out.println("after backward:"+driver.getTitle());
	    System.out.println("after backward:"+driver.getCurrentUrl());
	    System.out.println("after backward:"+driver.getPageSource().contains("Automation"));

	    driver.navigate().forward();
	    System.out.println("After forrward:"+driver.getTitle());
	    System.out.println("After forrward:"+driver.getCurrentUrl());
	    driver.close();
	}
	

}
